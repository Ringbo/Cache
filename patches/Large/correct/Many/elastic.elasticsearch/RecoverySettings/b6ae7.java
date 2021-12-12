diff --git a/src/main/java/org/elasticsearch/indices/recovery/RecoverySettings.java b/src/main/java/org/elasticsearch/indices/recovery/RecoverySettings.java
index e1eb74d..88890a8 100644
--- a/src/main/java/org/elasticsearch/indices/recovery/RecoverySettings.java
+++ b/src/main/java/org/elasticsearch/indices/recovery/RecoverySettings.java
@@ -81,7 +81,7 @@
         this.concurrentSmallFileStreams = componentSettings.getAsInt("concurrent_small_file_streams", settings.getAsInt("index.shard.recovery.concurrent_small_file_streams", 2));
         this.concurrentSmallFileStreamPool = EsExecutors.newScaling(0, concurrentSmallFileStreams, 60, TimeUnit.SECONDS, EsExecutors.daemonThreadFactory(settings, "[small_file_recovery_stream]"));
 
-        this.maxBytesPerSec = componentSettings.getAsBytesSize("max_bytes_per_sec", componentSettings.getAsBytesSize("max_size_per_sec", new ByteSizeValue(50, ByteSizeUnit.MB)));
+        this.maxBytesPerSec = componentSettings.getAsBytesSize("max_bytes_per_sec", componentSettings.getAsBytesSize("max_size_per_sec", new ByteSizeValue(20, ByteSizeUnit.MB)));
         if (maxBytesPerSec.bytes() <= 0) {
             rateLimiter = null;
         } else {
