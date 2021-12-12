diff --git a/python/educational-core/student/src/com/jetbrains/edu/learning/stepic/EduAdaptiveStepicConnector.java b/python/educational-core/student/src/com/jetbrains/edu/learning/stepic/EduAdaptiveStepicConnector.java
index f98d279..5a9a139 100644
--- a/python/educational-core/student/src/com/jetbrains/edu/learning/stepic/EduAdaptiveStepicConnector.java
+++ b/python/educational-core/student/src/com/jetbrains/edu/learning/stepic/EduAdaptiveStepicConnector.java
@@ -133,7 +133,7 @@
 
   @Nullable
   private static Task getTask(@NotNull Project project, @NotNull String name, int stepId) throws IOException {
-    final StepicWrappers.StepSource step = getStep(stepId);
+    final StepicWrappers.StepSource step = getStep(project, stepId);
     final String stepType = step.block.name;
     if (stepType.equals(CODE_TASK_TYPE)) {
       return getCodeTaskFromStep(project, step.block, name, stepId);
