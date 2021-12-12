diff --git a/java/org/apache/coyote/http2/FrameType.java b/java/org/apache/coyote/http2/FrameType.java
index 167dc64..bd71818 100644
--- a/java/org/apache/coyote/http2/FrameType.java
+++ b/java/org/apache/coyote/http2/FrameType.java
@@ -61,18 +61,18 @@
     public void check(int streamId, int payloadSize) throws Http2Exception {
         // Is FrameType valid for the given stream?
         if (streamId == 0 && !streamZero || streamId != 0 && !streamNonZero) {
-            throw new ConnectionError(sm.getString("frameType.checkStream", this),
+            throw new ConnectionException(sm.getString("frameType.checkStream", this),
                     Http2Error.PROTOCOL_ERROR);
         }
 
         // Is the payload size valid for the given FrameType
         if (payloadSizeValidator != null && !payloadSizeValidator.test(payloadSize)) {
             if (payloadErrorFatal || streamId == 0) {
-                throw new ConnectionError(sm.getString("frameType.checkPayloadSize",
+                throw new ConnectionException(sm.getString("frameType.checkPayloadSize",
                         Integer.toString(payloadSize), this),
                         Http2Error.FRAME_SIZE_ERROR);
             } else {
-                throw new StreamError(sm.getString("frameType.checkPayloadSize",
+                throw new StreamException(sm.getString("frameType.checkPayloadSize",
                         Integer.toString(payloadSize), this),
                         Http2Error.FRAME_SIZE_ERROR, streamId);
             }
