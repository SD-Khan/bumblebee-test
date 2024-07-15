//package stepdefs;
//
//import com.bumblebee.bumble.core.global.Context;
//import com.bumblebee.bumble.core.helpers.ThreadLocalHelper;
//import com.bumblebee.bumble.core.managers.DriverManager;
//import io.cucumber.core.backend.TestCaseState;
//import io.cucumber.java.*;
//import io.cucumber.plugin.event.PickleStepTestStep;
//import io.cucumber.plugin.event.TestCase;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import java.lang.reflect.Field;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class HookService {
//
//    Context context;
//    int counter = 0;
//
//    public HookService(Context context) {
//
//        this.context = context;
//
//        this.context.setFeatureResult(ThreadLocalHelper);
//    }
//}
//
//    @Before
//    public void beforeScenario(Scenario scenario) {
//
//            context.setScenario(scenario);
//
//            //ResultHelper.createScenarioResult(context);
//
//            //TestCaseData.setData(scenario.getName());
//
//            System.out.println(scenario.getName());
//    }
//
//    @BeforeStep
//    public void beforeStep(Scenario scenario){
//        try {
//
//            PickleStepTestStep currentStep = getStep(scenario);
//
//            context.setStepName(currentStep.getStep().getText());
//
//            //TestCaseData.setData(currentStep.getStep().getText());
//
//            //ResultHelper.createStepResult(context, counter);
//
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
//
//    @AfterStep
//    public void afterStep(Scenario scenario){
//        counter +=1;
//        //ResultHelper.updateStepResult(context);
//    }
//
//    @After
//    public void afterScenario(Scenario scenario) {
//        context.setScenario(scenario);
//        //ResultHelper.updateScenarioResult(context);
//  }
//
//    private void takeScreenshot(Scenario scenario) {
//        WebDriver _webdriver = (WebDriver) DriverManager.componentDriver.get().Get();
//        if (scenario.isFailed()) {
//            if (_webdriver instanceof TakesScreenshot) {
//                scenario.attach(((TakesScreenshot) _webdriver).getScreenshotAs(OutputType.BYTES), "image/png", "Screenshot");
//            }
//        }
//    }
//
//    private PickleStepTestStep getStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
//
//        PickleStepTestStep currentStep;
//        Field f1 = scenario.getClass().getDeclaredField("delegate");
//        f1.setAccessible(true);
//        TestCaseState tcs = (TestCaseState) f1.get(scenario);
//
//        Field f2 = tcs.getClass().getDeclaredField("testCase");
//        f2.setAccessible(true);
//        TestCase r = (TestCase) f2.get(tcs);
//
//        List<PickleStepTestStep> stepDefs = r.getTestSteps()
//                .stream()
//                .filter(x -> x instanceof PickleStepTestStep)
//                .map(x -> (PickleStepTestStep) x)
//                .collect(Collectors.toList());
//
//        currentStep = stepDefs.get(counter);
//
//        return currentStep;
//    }
//
//    //        DriverFactory.driver.closeApp();
////        DriverFactory.driver.close();
////        IDriver componentDriver = DriverManager.componentDriver.get();
////        WebDriver driver = (WebDriver) DriverManager.componentDriver.get().Get();
////        if(componentDriver instanceof BrowserStackDriver){
////
////            JavascriptExecutor jse = (JavascriptExecutor)driver;
////
////            if(scenario.isFailed()){
////
////                jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
////            }
////            else {
////
////                jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
////            }
////        }
////
////        if(componentDriver instanceof SauceLabsDriver){
////
////            JavascriptExecutor jse = (JavascriptExecutor)driver;
////
////            if(scenario.isFailed()){
////
////                jse.executeScript("saucelabs_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"Title not matched\"}}");
////            }
////            else {
////
////                jse.executeScript("saucelabs_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Title matched!\"}}");
////            }
////        }
//
//    //takeScreenshot(scenario);
//
//}
