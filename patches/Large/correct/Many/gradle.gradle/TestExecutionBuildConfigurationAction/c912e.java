diff --git a/subprojects/tooling-api-builders/src/main/java/org/gradle/tooling/internal/provider/runner/TestExecutionBuildConfigurationAction.java b/subprojects/tooling-api-builders/src/main/java/org/gradle/tooling/internal/provider/runner/TestExecutionBuildConfigurationAction.java
index 4aec243..42f08ce 100644
--- a/subprojects/tooling-api-builders/src/main/java/org/gradle/tooling/internal/provider/runner/TestExecutionBuildConfigurationAction.java
+++ b/subprojects/tooling-api-builders/src/main/java/org/gradle/tooling/internal/provider/runner/TestExecutionBuildConfigurationAction.java
@@ -46,7 +46,7 @@
 
     @Override
     public void configure(BuildExecutionContext context) {
-        final Set<Test> allTestTasksToRun = new HashSet<Test>();
+        final Set<Test> allTestTasksToRun = new LinkedHashSet<Test>();
         final GradleInternal gradleInternal = context.getGradle();
         allTestTasksToRun.addAll(configureBuildForTestDescriptors(gradleInternal, testExecutionRequest));
         allTestTasksToRun.addAll(configureBuildForTestClasses(gradleInternal, testExecutionRequest));
