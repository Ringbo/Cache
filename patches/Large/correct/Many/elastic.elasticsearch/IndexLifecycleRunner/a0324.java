diff --git a/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleRunner.java b/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleRunner.java
index ce96f7c..b68ebea 100644
--- a/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleRunner.java
+++ b/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/IndexLifecycleRunner.java
@@ -42,7 +42,7 @@
             boolean fromClusterStateChange) {
         Settings indexSettings = indexMetaData.getSettings();
         Step currentStep = getCurrentStep(stepRegistry, policy, indexSettings);
-        logger.warn("running policy with current-step[" + currentStep.getKey() + "]");
+        logger.debug("running policy with current-step[" + currentStep.getKey() + "]");
         if (currentStep instanceof TerminalPolicyStep) {
             logger.debug("policy [" + policy + "] for index [" + indexMetaData.getIndex().getName() + "] complete, skipping execution");
         } else if (currentStep instanceof ErrorStep) {
@@ -56,7 +56,7 @@
     
                     @Override
                     public void onResponse(boolean conditionMet) {
-                        logger.error("cs-change-async-wait-callback. current-step:" + currentStep.getKey());
+                        logger.debug("cs-change-async-wait-callback. current-step:" + currentStep.getKey());
                         if (conditionMet) {
                             moveToStep(indexMetaData.getIndex(), policy, currentStep.getKey(), currentStep.getNextStepKey());
                         }
@@ -75,7 +75,7 @@
     
                     @Override
                     public void onResponse(boolean complete) {
-                        logger.error("cs-change-async-action-callback. current-step:" + currentStep.getKey());
+                        logger.debug("cs-change-async-action-callback. current-step:" + currentStep.getKey());
                         if (complete && ((AsyncActionStep) currentStep).indexSurvives()) {
                             moveToStep(indexMetaData.getIndex(), policy, currentStep.getKey(), currentStep.getNextStepKey());
                         }
@@ -178,14 +178,14 @@
     }
 
     private void moveToStep(Index index, String policy, StepKey currentStepKey, StepKey nextStepKey) {
-        logger.error("moveToStep[" + policy + "] [" + index.getName() + "]" + currentStepKey + " -> "
+        logger.debug("moveToStep[" + policy + "] [" + index.getName() + "]" + currentStepKey + " -> "
                 + nextStepKey);
         clusterService.submitStateUpdateTask("ILM", new MoveToNextStepUpdateTask(index, policy, currentStepKey,
                 nextStepKey, nowSupplier, newState -> runPolicy(newState.getMetaData().index(index), newState)));
     }
 
     private void moveToErrorStep(Index index, String policy, StepKey currentStepKey, Exception e) {
-        logger.error("policy [" + policy + "] for index [" + index.getName() + "] failed on step [" + currentStepKey
+        logger.debug("policy [" + policy + "] for index [" + index.getName() + "] failed on step [" + currentStepKey
                 + "]. Moving to ERROR step.", e);
         clusterService.submitStateUpdateTask("ILM", new MoveToErrorStepUpdateTask(index, policy, currentStepKey, nowSupplier));
     }
