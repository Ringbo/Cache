diff --git a/subprojects/model-core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskDependency.java b/subprojects/model-core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskDependency.java
index 18a4aec..962bd80 100644
--- a/subprojects/model-core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskDependency.java
+++ b/subprojects/model-core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskDependency.java
@@ -230,7 +230,7 @@
 
         @Override
         public boolean remove(Object o) {
-            DeprecationLogger.nagUserWith("Do not remove a task dependency from a Task instance.", "This behaviour has been deprecated and is scheduled to become an error in Gradle 6.0.", "", "");
+            DeprecationLogger.nagUserOfDeprecatedBehaviour("Do not remove a task dependency from a Task instance.");
             if (delegate.remove(o)) {
                 return true;
             }
