diff --git a/core/java/android/content/SyncManager.java b/core/java/android/content/SyncManager.java
index 3877f16..9757ef6 100644
--- a/core/java/android/content/SyncManager.java
+++ b/core/java/android/content/SyncManager.java
@@ -811,7 +811,7 @@
     private long rescheduleWithDelay(SyncOperation syncOperation) {
         long newDelayInMs;
 
-        if (syncOperation.delay == 0) {
+        if (syncOperation.delay <= 0) {
             // The initial delay is the jitterized INITIAL_SYNC_RETRY_TIME_IN_MS
             newDelayInMs = jitterize(INITIAL_SYNC_RETRY_TIME_IN_MS,
                     (long)(INITIAL_SYNC_RETRY_TIME_IN_MS * 1.1));
