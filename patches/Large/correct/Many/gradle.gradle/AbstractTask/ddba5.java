diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/AbstractTask.java b/subprojects/core/src/main/java/org/gradle/api/internal/AbstractTask.java
index 3d7a339..d790a95 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/AbstractTask.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/AbstractTask.java
@@ -541,7 +541,9 @@
 
     @Override
     public boolean dependsOnTaskDidWork() {
-        DeprecationLogger.nagUserOfDiscontinuedMethod("Task.dependsOnTaskDidWork()");
+        DeprecationLogger.nagUserOfDiscontinuedMethod(
+            "Task.dependsOnTaskDidWork()",
+            "Instead, check the value of \"didWork()\" for each task, or declare the task inputs and outputs and let Gradle decide what needs to be run.");
         TaskDependency dependency = getTaskDependencies();
         for (Task depTask : dependency.getDependencies(this)) {
             if (depTask.getDidWork()) {
