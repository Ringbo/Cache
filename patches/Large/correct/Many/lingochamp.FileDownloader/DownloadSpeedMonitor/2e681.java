diff --git a/library/src/main/java/com/liulishuo/filedownloader/DownloadSpeedMonitor.java b/library/src/main/java/com/liulishuo/filedownloader/DownloadSpeedMonitor.java
index ae74b63..cab8ee8 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/DownloadSpeedMonitor.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/DownloadSpeedMonitor.java
@@ -51,7 +51,7 @@
         long downloadSize = sofarBytes - mStartSofarBytes;
         this.mLastRefreshTime = 0;
         long interval = SystemClock.uptimeMillis() - mStartTime;
-        if (interval < 0) {
+        if (interval <= 0) {
             mSpeed = (int) downloadSize;
         } else {
             mSpeed = (int) (downloadSize / interval);
