diff --git a/plugins/devkit/src/build/PluginBuildUtil.java b/plugins/devkit/src/build/PluginBuildUtil.java
index 0602009..4d381cc 100644
--- a/plugins/devkit/src/build/PluginBuildUtil.java
+++ b/plugins/devkit/src/build/PluginBuildUtil.java
@@ -24,7 +24,7 @@
 
   public static String getPluginExPath(Module module){
     final ProjectJdk jdk = ModuleRootManager.getInstance(module).getJdk();
-    if (! (jdk.getSdkType() instanceof IdeaJdk)){
+    if (jdk == null || ! (jdk.getSdkType() instanceof IdeaJdk)){
       return null;
     }
     return ((Sandbox)jdk.getSdkAdditionalData()).getSandboxHome() + "/plugins/" + module.getName();
