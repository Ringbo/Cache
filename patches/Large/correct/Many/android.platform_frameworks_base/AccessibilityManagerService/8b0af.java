diff --git a/services/java/com/android/server/accessibility/AccessibilityManagerService.java b/services/java/com/android/server/accessibility/AccessibilityManagerService.java
index 648e4d5..e980ccc 100644
--- a/services/java/com/android/server/accessibility/AccessibilityManagerService.java
+++ b/services/java/com/android/server/accessibility/AccessibilityManagerService.java
@@ -1008,7 +1008,7 @@
             synchronized (mGestureLock) {
                 Thread worker = new Thread(this, THREAD_NAME);
                 worker.start();
-                while (mHandler == null) {
+                while (mHandlerCaller == null) {
                     try {
                         mGestureLock.wait();
                     } catch (InterruptedException ie) {
