diff --git a/python/pluginSrc/com/jetbrains/python/module/PythonSdkChooserPanel.java b/python/pluginSrc/com/jetbrains/python/module/PythonSdkChooserPanel.java
index c70461b..5ed6982 100644
--- a/python/pluginSrc/com/jetbrains/python/module/PythonSdkChooserPanel.java
+++ b/python/pluginSrc/com/jetbrains/python/module/PythonSdkChooserPanel.java
@@ -59,7 +59,7 @@
     myJdkChooser.setAllowedJdkTypes(new SdkType[]{PythonSdkType.getInstance()});
 
     final Sdk selectedJdk = project == null ? null : ProjectRootManager.getInstance(project).getProjectSdk();
-    myJdkChooser.updateList(selectedJdk, null);
+    myJdkChooser.updateList(selectedJdk, null, null);
   }
 
   @Nullable
