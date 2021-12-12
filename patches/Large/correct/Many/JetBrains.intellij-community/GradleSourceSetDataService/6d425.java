diff --git a/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/data/GradleSourceSetDataService.java b/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/data/GradleSourceSetDataService.java
index 3293b78..6aa0f80 100644
--- a/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/data/GradleSourceSetDataService.java
+++ b/plugins/gradle/src/org/jetbrains/plugins/gradle/service/project/data/GradleSourceSetDataService.java
@@ -77,6 +77,6 @@
   @Override
   protected void setModuleOptions(Module module, DataNode<GradleSourceSetData> moduleDataNode) {
     super.setModuleOptions(module, moduleDataNode);
-    ExternalSystemModulePropertyManager.getInstance(module).seExternalModuleType(GradleConstants.GRADLE_SOURCE_SET_MODULE_TYPE_KEY);
+    ExternalSystemModulePropertyManager.getInstance(module).setExternalModuleType(GradleConstants.GRADLE_SOURCE_SET_MODULE_TYPE_KEY);
   }
 }
