package stepdefs.rest;

import com.bumblebee.bumble.core.global.Context;
import com.bumblebee.bumble.core.global.Result;
import com.bumblebee.bumble.core.http.RestResponse;
import com.bumblebee.bumble.core.managers.DriverManager;
import com.bumblebee.bumble.core.testdata.TestCaseData;
import com.bumblebee.bumble.wrappers.driver.ApiDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RestApiSteps {

    Result result;
    ApiDriver driver = (ApiDriver) DriverManager.get(ApiDriver.class);

    public RestApiSteps(Result result){

        this.result = result;
    }

    @When("^Login with the correct credentials$")
    public void getToken() throws Throwable {
        try {
            Map<String, String> body = new HashMap<>();
            body.put("grant_type", "client_credentials");
            body.put("tenant_id", "0bfc3213-dec7-4a94-b8b2-b0594babb972");
            body.put("token", "");
            driver.setUrl("token");
            driver.setAuthorization(TestCaseData.get("UserName"), TestCaseData.get("password"));
            driver.requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            driver.setQueryParams(body);
            RestResponse response = driver.post();
            if(response.getStatusCode() == 200) {
                driver.setAccessToken(response.getContent().getString("access_token"));
                result.setStatus(true);
                result.setStatusMsg("Get Token is passed");
            }
        } catch (Exception e) {
            result.setStatus(false);
            result.setStatusMsg("get token is failed due to exception : " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        } finally {
            Context.setResult(result);
        }
    }

    @When("^Create a new tenant$")
    public void createTenant() throws Throwable {
        try {
            JSONObject body = new JSONObject();
            JSONObject resourceMap = new JSONObject();
            resourceMap.put("AuthNZ", "");
            resourceMap.put("Appointment", "hapi");
            resourceMap.put("Patient", "hapi");
            resourceMap.put("Location", "hapi");
            body.put("id", "0bfc3213-dec7-4a94-b8b2-b0594babb972");
            body.put("name", "yc-orange");
            body.put("resourceMap", resourceMap);
            driver.setUrl("tenants");
            driver.requestHeaders.setContentType(MediaType.APPLICATION_JSON);
            driver.setBearerAuth();
            driver.setJsonBody(body);
            RestResponse response = driver.post();
            if(response.getStatusCode() == 200) {
                result.setStatus(true);
                result.setStatusMsg("Create tenant is passed");
            }
        } catch (Exception e) {
            result.setStatus(false);
            result.setStatusMsg("Create new tenant is failed due to exception : \n" + Arrays.toString(e.getStackTrace()));
            throw new Throwable(e.getCause());
        }
    }

    @Then("^Get all Tenants$")
    public void getTenants() throws Throwable {
        try {
            driver.setUrl("tenants");
            driver.setBearerAuth();
            RestResponse response = driver.get();
            if(response.getStatusCode() == 200) {
                result.setStatus(true);
                result.setStatusMsg("Get Token is passed");
            }
        } catch (Exception e) {
            result.setStatus(false);
            result.setStatusMsg("Get All Tenant is failed due to exception : \n" + Arrays.toString(e.getStackTrace()));
            throw new Throwable(e.getCause());
        }
    }

    @Then("^Get all Locations$")
    public void getLocations() throws Throwable {
        try {
            Map<String, String> body = new HashMap<>();
            body.put("near", "42.3501483%7C-71.143933%7C5%7Cmi_us");
            body.put("_elements", "address,position");
            driver.setUrl("fhir/locations");
            driver.setBearerAuth();
            driver.setQueryParams(body);
            RestResponse response = driver.get();
            if(response.getStatusCode() == 200) {
                result.setStatus(true);
                result.setStatusMsg("Get Token is passed");
                driver.putCacheObject("locationId", response.getContent().getJSONArray("entry").getJSONObject(0).getJSONObject("resource").getString("id"));
            }
        } catch (Exception e) {
            result.setStatus(false);
            result.setStatusMsg("Get All Locations is failed due to exception : \n" + Arrays.toString(e.getStackTrace()));
            throw new Throwable(e.getCause());
        }
    }

    @Then("^Get Location with id$")
    public void getLocation() throws Throwable {
        try {
            String id = driver.getCacheObject("locationId").toString();
            driver.setUrl("fhir/locations/" + id);
            driver.setBearerAuth();
            RestResponse response = driver.get();
            if(response.getStatusCode() == 200) {
                result.setStatus(true);
                result.setStatusMsg("Get Token is passed");
            }
        } catch (Exception e) {
            result.setStatus(false);
            result.setStatusMsg("Get Location with id is failed due to exception : \n" + Arrays.toString(e.getStackTrace()));
            throw new Throwable(e.getCause());
        }
    }

    @When("^Create a new user$")
    public void createData() throws Throwable {
        try {
            driver.setUrl("users");
            JSONObject requestBody = new JSONObject();
            requestBody.put("name", TestCaseData.get("name"));
            requestBody.put("lastName", TestCaseData.get("lastName"));
            requestBody.put("address", TestCaseData.get("address"));
            requestBody.put("phone", TestCaseData.get("phone"));
            driver.setJsonBody(requestBody);
            RestResponse response = driver.post();
            if (response.getStatusCode() == 200) {
                result.setStatus(true);
                result.setStatusMsg("test case passed");
            }
        }catch (Exception e){
            result.setStatus(false);
            result.setStatusMsg("test case failed");
        }
    }

    @When("^Update the user information$")
    public void updateData() throws Throwable {
        try{
            driver.setUrl("users/"+TestCaseData.get("id"));
            JSONObject requestBody = new JSONObject();
            requestBody.put("address", TestCaseData.get("address"));
            requestBody.put("phone", TestCaseData.get("phone"));
            driver.setJsonBody(requestBody);
            RestResponse response = driver.put();
            if (response.getStatusCode() == 200){
                result.setStatus(true);
                result.setStatusMsg("test case passed");
            }
        }catch (Exception e){
            result.setStatus(false);
            result.setStatusMsg("test case failed");
        }
    }

    @When("^Delete the user$")
    public void deleteData() throws Throwable {
        try{
            driver.setUrl("users/"+TestCaseData.get("id"));
            RestResponse response = driver.delete();
            if (response.getStatusCode() == 200){
                result.setStatus(true);
                result.setStatusMsg("test case passed");
            }
        }catch (Exception e){
            result.setStatus(false);
            result.setStatusMsg("test case failed");
        }
    }

    @When("^Get all users$")
    public void getUsers() throws Throwable {
        try{
            driver.setUrl("users");
            RestResponse response = driver.get();
            if (response.getStatusCode() == 200){
                result.setStatus(true);
                result.setStatusMsg("test case passed");
                driver.putCacheObject("users", response.getStringBody());
            }
        }catch (Exception e){
            result.setStatus(false);
            result.setStatusMsg("test case failed");
        }
    }

    @When("^Validate the user is deleted$")
    public void validateDelete(){
        boolean found = false;
        boolean status = true;
        JSONArray users =  new JSONArray(driver.getCacheObject("users"));
        for(int i=0; i<users.length(); i++){
            JSONObject user = users.getJSONObject(i);
            if(user.getString("name").equalsIgnoreCase(TestCaseData.get("name"))){
                found = true;
                status = false;
                break;
            }
        }
        if(found){
            result.setStatus(status);
            result.setStatusMsg("test case failed");
        } else{
            result.setStatus(status);
            result.setStatusMsg("test case passed");
        }
    }
}
