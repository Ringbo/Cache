diff --git a/python/ide/src/com/jetbrains/python/configuration/PythonSdkDetailsDialog.java b/python/ide/src/com/jetbrains/python/configuration/PythonSdkDetailsDialog.java
index 5718343..6ff0a2e 100644
--- a/python/ide/src/com/jetbrains/python/configuration/PythonSdkDetailsDialog.java
+++ b/python/ide/src/com/jetbrains/python/configuration/PythonSdkDetailsDialog.java
@@ -464,7 +464,7 @@
       final SdkModificator sdkModificator = myModificators.get(sdk);
 
       PythonPathDialog dialog = new PythonPathDialog(myProject, pathEditor);
-      pathEditor.reload(sdk != null ? sdkModificator : null);
+      pathEditor.reset(sdk != null ? sdkModificator : null);
       dialog.show();
 
       if (dialog.isOK()) {
