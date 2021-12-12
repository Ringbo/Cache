diff --git a/android/src/com/google/zxing/client/android/camera/AutoFocusManager.java b/android/src/com/google/zxing/client/android/camera/AutoFocusManager.java
index eccf1bb..05aee0a 100644
--- a/android/src/com/google/zxing/client/android/camera/AutoFocusManager.java
+++ b/android/src/com/google/zxing/client/android/camera/AutoFocusManager.java
@@ -64,7 +64,7 @@
     autoFocusAgainLater();
   }
 
-  private void autoFocusAgainLater() {
+  private synchronized void autoFocusAgainLater() {
     if (!stopped && outstandingTask == null) {
       AutoFocusTask newTask = new AutoFocusTask();
       try {
@@ -78,7 +78,7 @@
 
   synchronized void start() {
     if (useAutoFocus) {
-      cancelOutstandingTask();
+      outstandingTask = null;
       if (!stopped && !focusing) {
         try {
           camera.autoFocus(this);
@@ -93,7 +93,7 @@
     }
   }
 
-  private void cancelOutstandingTask() {
+  private synchronized void cancelOutstandingTask() {
     if (outstandingTask != null) {
       if (outstandingTask.getStatus() != AsyncTask.Status.FINISHED) {
         outstandingTask.cancel(true);
