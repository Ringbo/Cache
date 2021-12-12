diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/configurations/DefaultConfiguration.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/configurations/DefaultConfiguration.java
index 232e94e..64da5fd 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/configurations/DefaultConfiguration.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/configurations/DefaultConfiguration.java
@@ -439,7 +439,7 @@
     }
 
     public TaskDependency getBuildDependencies() {
-        if (resolutionStrategy.resolveGraphToDetermineTaskDependencies()) {
+        if (attributes.size() > 0 || resolutionStrategy.resolveGraphToDetermineTaskDependencies()) {
             final DefaultTaskDependency taskDependency = new DefaultTaskDependency();
             resolveNow(InternalState.TASK_DEPENDENCIES_RESOLVED);
 
