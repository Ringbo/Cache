diff --git a/services/java/com/android/server/SystemServer.java b/services/java/com/android/server/SystemServer.java
index 3ae62ad..ce133f0 100644
--- a/services/java/com/android/server/SystemServer.java
+++ b/services/java/com/android/server/SystemServer.java
@@ -79,7 +79,7 @@
         EventLog.writeEvent(EventLogTags.BOOT_PROGRESS_SYSTEM_RUN,
             SystemClock.uptimeMillis());
 
-        Looper.prepare();
+        Looper.prepareMainLooper();
 
         android.os.Process.setThreadPriority(
                 android.os.Process.THREAD_PRIORITY_FOREGROUND);
