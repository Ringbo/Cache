diff --git a/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/SpiceManager.java b/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/SpiceManager.java
index 564e8fe..02c4136 100644
--- a/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/SpiceManager.java
+++ b/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/SpiceManager.java
@@ -1237,7 +1237,7 @@
     }
 
     protected <T> Future<T> executeCommand(SpiceManagerCommand<T> spiceManagerCommand) {
-        if (executorService.isShutdown()) {
+        if (executorService == null || executorService.isShutdown()) {
             return null;
         }
         return executorService.submit(spiceManagerCommand);
