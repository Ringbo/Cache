diff --git a/library/core/src/main/java/com/google/android/exoplayer2/offline/DownloadManager.java b/library/core/src/main/java/com/google/android/exoplayer2/offline/DownloadManager.java
index c03337f..1d65aec 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/offline/DownloadManager.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/offline/DownloadManager.java
@@ -464,13 +464,13 @@
     });
   }
 
-  private void logd(String message) {
+  private static void logd(String message) {
     if (DEBUG) {
       Log.d(TAG, message);
     }
   }
 
-  private void logd(String message, Task task) {
+  private static void logd(String message, Task task) {
     logd(message + ": " + task);
   }
 
@@ -710,7 +710,7 @@
 
     private void stop() {
       if (changeStateAndNotify(STATE_STARTED, STATE_STARTED_STOPPING)) {
-        downloadManager.logd("Stopping", this);
+        logd("Stopping", this);
         thread.interrupt();
       }
     }
@@ -737,7 +737,7 @@
 
     @Override
     public void run() {
-      downloadManager.logd("Task is started", this);
+      logd("Task is started", this);
       Throwable error = null;
       try {
         downloader = action.createDownloader(downloadManager.downloaderConstructorHelper);
@@ -753,15 +753,14 @@
             } catch (IOException e) {
               long downloadedBytes = downloader.getDownloadedBytes();
               if (downloadedBytes != errorPosition) {
-                downloadManager.logd(
-                    "Reset error count. downloadedBytes = " + downloadedBytes, this);
+                logd("Reset error count. downloadedBytes = " + downloadedBytes, this);
                 errorPosition = downloadedBytes;
                 errorCount = 0;
               }
               if (currentState != STATE_STARTED || ++errorCount > minRetryCount) {
                 throw e;
               }
-              downloadManager.logd("Download error. Retry " + errorCount, this);
+              logd("Download error. Retry " + errorCount, this);
               Thread.sleep(getRetryDelayMillis(errorCount));
             }
           }
