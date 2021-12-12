diff --git a/ReactAndroid/src/main/java/com/facebook/react/ReactInstanceManager.java b/ReactAndroid/src/main/java/com/facebook/react/ReactInstanceManager.java
index 52e44d3..29c9394 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/ReactInstanceManager.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/ReactInstanceManager.java
@@ -903,20 +903,23 @@
         });
     Systrace.endSection(TRACE_TAG_REACT_JAVA_BRIDGE);
     ReactMarker.logMarker(SETUP_REACT_CONTEXT_END);
-    mCurrentReactContext.runOnJSQueueThread(new Runnable() {
+    reactContext.runOnJSQueueThread(
+        new Runnable() {
       @Override
       public void run() {
         Process.setThreadPriority(Process.THREAD_PRIORITY_DEFAULT);
       }
     });
-    mCurrentReactContext.runOnNativeModulesQueueThread(new Runnable() {
+    reactContext.runOnNativeModulesQueueThread(
+        new Runnable() {
       @Override
       public void run() {
         Process.setThreadPriority(Process.THREAD_PRIORITY_DEFAULT);
       }
     });
     if (mUseSeparateUIBackgroundThread) {
-      mCurrentReactContext.runOnUiBackgroundQueueThread(new Runnable() {
+      reactContext.runOnUiBackgroundQueueThread(
+          new Runnable() {
         @Override
         public void run() {
           Process.setThreadPriority(Process.THREAD_PRIORITY_DEFAULT);
