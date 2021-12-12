diff --git a/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/ExecuteStepsUpdateTask.java b/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/ExecuteStepsUpdateTask.java
index c50dbd6..cb54812 100644
--- a/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/ExecuteStepsUpdateTask.java
+++ b/x-pack/plugin/index-lifecycle/src/main/java/org/elasticsearch/xpack/indexlifecycle/ExecuteStepsUpdateTask.java
@@ -82,7 +82,7 @@
                         currentState = IndexLifecycleRunner.moveClusterStateToNextStep(index, currentState, currentStep.getKey(),
                                 currentStep.getNextStepKey(), nowSupplier);
                     } else {
-                        logger.warn("condition not met, returning existing state");
+                        logger.debug("condition not met, returning existing state");
                         return currentState;
                     }
                 }
