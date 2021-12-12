diff --git a/java/org/apache/coyote/http2/Http2UpgradeHandler.java b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
index 7f4ec6b..eae4feb 100644
--- a/java/org/apache/coyote/http2/Http2UpgradeHandler.java
+++ b/java/org/apache/coyote/http2/Http2UpgradeHandler.java
@@ -172,7 +172,8 @@
                 String base64Settings = stream.getCoyoteRequest().getHeader(HTTP2_SETTINGS_HEADER);
                 byte[] settings = Base64.decodeBase64(base64Settings);
 
-                FrameType.SETTINGS.check(1, settings.length);
+                // Settings are only valid on stream 0
+                FrameType.SETTINGS.check(0, settings.length);
 
                 for (int i = 0; i < settings.length % 6; i++) {
                     int id = ByteUtil.getTwoBytes(settings, i * 6);
