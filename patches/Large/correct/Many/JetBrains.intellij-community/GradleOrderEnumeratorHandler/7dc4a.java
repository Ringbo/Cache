diff --git a/plugins/gradle/src/org/jetbrains/plugins/gradle/execution/GradleOrderEnumeratorHandler.java b/plugins/gradle/src/org/jetbrains/plugins/gradle/execution/GradleOrderEnumeratorHandler.java
index 26eebab..7b578b0 100644
--- a/plugins/gradle/src/org/jetbrains/plugins/gradle/execution/GradleOrderEnumeratorHandler.java
+++ b/plugins/gradle/src/org/jetbrains/plugins/gradle/execution/GradleOrderEnumeratorHandler.java
@@ -107,7 +107,7 @@
 
     final String gradleProjectPath = ExternalSystemModulePropertyManager.getInstance(rootModel.getModule()).getRootProjectPath();
     if (gradleProjectPath == null) {
-      LOG.error("Root project path of the Gradle project not found for " + rootModel.getModule());
+      LOG.warn("Root project path of the Gradle project not found for " + rootModel.getModule());
       return false;
     }
 
