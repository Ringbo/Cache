diff --git a/python/src/com/jetbrains/python/sdk/PythonSdkDetailsStep.java b/python/src/com/jetbrains/python/sdk/PythonSdkDetailsStep.java
index 0e31fef..d643cc4 100644
--- a/python/src/com/jetbrains/python/sdk/PythonSdkDetailsStep.java
+++ b/python/src/com/jetbrains/python/sdk/PythonSdkDetailsStep.java
@@ -195,7 +195,7 @@
 
   @Override
   public void canceled() {
-    if (getFinalRunnable() == null)
+    if (getFinalRunnable() == null && myMore != null)
       Disposer.dispose(myMore.getDisposable());
   }
 
