//package com.automation.helpers;
//
//import com.framework.core.global.Context;
//import com.framework.core.helpers.ThreadLocalHelper;
//import com.framework.core.results.ScenarioResult;
//import com.framework.core.results.StepResult;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ResultHelper {
//
//    private static List<StepResult> stepResults = new ArrayList<>();
//    private static List<ScenarioResult> scenarioResults = new ArrayList<>();
//
//    public static void createScenarioResult(Context context) {
//
//        context.setScenarioResult(context.getFeatureResult().getScenarioByName(context.getScenario().getName()));
//    }
//
//    public static void createStepResult(Context context, int id) {
//
//        context.getScenarioResult().getStepByName(context.getStepName()).setId(id);
//    }
//
//    public static void updateStepResult(Context context) {
//
//        context.getScenarioResult().addResult(context.getResult());
//    }
//
//    public static void updateScenarioResult(Context context) {
//
//        context.getFeatureResult().addResult(context.getScenarioResult());
//
//        if (context.getScenarioResult().isEnd()) {
//
//            ThreadLocalHelper.setFeatureResult(context.getFeatureResult());
//        }
//    }
//}
