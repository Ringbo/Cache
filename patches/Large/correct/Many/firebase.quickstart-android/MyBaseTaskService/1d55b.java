diff --git a/storage/app/src/main/java/com/google/firebase/quickstart/firebasestorage/MyBaseTaskService.java b/storage/app/src/main/java/com/google/firebase/quickstart/firebasestorage/MyBaseTaskService.java
index ef68dc7..87b31b4 100644
--- a/storage/app/src/main/java/com/google/firebase/quickstart/firebasestorage/MyBaseTaskService.java
+++ b/storage/app/src/main/java/com/google/firebase/quickstart/firebasestorage/MyBaseTaskService.java
@@ -43,7 +43,7 @@
      * Show notification with a progress bar.
      */
     protected void showProgressNotification(String caption, long completedUnits, long totalUnits) {
-        int percentComplete = 50;
+        int percentComplete = 0;
         if (totalUnits > 0) {
             percentComplete = (int) (100 * completedUnits / totalUnits);
         }
