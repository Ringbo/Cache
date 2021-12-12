diff --git a/java/org/apache/coyote/http2/Http2UpgradeHandler.java b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
index 4728e3e..1ecf05b 100644
--- a/java/org/apache/coyote/http2/Http2UpgradeHandler.java
+++ b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
@@ -811,7 +811,7 @@
         stream.checkState(FrameType.HEADERS);
         stream.receivedStartOfHeaders();
         closeIdleStreams(streamId);
-        if (localSettings.getMaxConcurrentStreams() > activeRemoteStreamCount.incrementAndGet()) {
+        if (localSettings.getMaxConcurrentStreams() <= activeRemoteStreamCount.incrementAndGet()) {
             activeRemoteStreamCount.decrementAndGet();
             throw new StreamException(sm.getString("upgradeHandler.tooManyRemoteStreams",
                     Long.toString(localSettings.getMaxConcurrentStreams())),
