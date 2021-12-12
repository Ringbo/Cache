diff --git a/java/org/apache/coyote/http2/FrameType.java b/java/org/apache/coyote/http2/FrameType.java
index bdec118..e4d60f0 100644
--- a/java/org/apache/coyote/http2/FrameType.java
+++ b/java/org/apache/coyote/http2/FrameType.java
@@ -67,7 +67,7 @@
 
         // Is the payload size valid for the given FrameType
         if (payloadSizeValidator != null && !payloadSizeValidator.test(payloadSize)) {
-            if (payloadErrorFatal) {
+            if (payloadErrorFatal || streamId == 0) {
                 throw new ConnectionError(sm.getString("frameType.checkPayloadSize",
                         Integer.toString(payloadSize), this),
                         Error.FRAME_SIZE_ERROR);
