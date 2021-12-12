diff --git a/plugins/gradle/testSources/org/jetbrains/plugins/gradle/service/project/GradleProjectResolverUtilTest.java b/plugins/gradle/testSources/org/jetbrains/plugins/gradle/service/project/GradleProjectResolverUtilTest.java
index 490d23a..f068aaf 100644
--- a/plugins/gradle/testSources/org/jetbrains/plugins/gradle/service/project/GradleProjectResolverUtilTest.java
+++ b/plugins/gradle/testSources/org/jetbrains/plugins/gradle/service/project/GradleProjectResolverUtilTest.java
@@ -63,7 +63,7 @@
     final Module module = myProjectRule.getModule();
     ExternalSystemModulePropertyManager modulePropertyManager = ExternalSystemModulePropertyManager.getInstance(module);
     modulePropertyManager.setExternalId(SYSTEM_ID);
-    modulePropertyManager.seExternalModuleType(moduleType);
+    modulePropertyManager.setExternalModuleType(moduleType);
     modulePropertyManager.setLinkedProjectId(projectId);
     return module;
   }
