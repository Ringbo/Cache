diff --git a/java/org/apache/coyote/http2/Stream.java b/java/org/apache/coyote/http2/Stream.java
index 61b7fec..b7ebae4 100644
--- a/java/org/apache/coyote/http2/Stream.java
+++ b/java/org/apache/coyote/http2/Stream.java
@@ -422,7 +422,7 @@
 
             // Ensure that only one thread accesses inBuffer at a time
             synchronized (inBuffer) {
-                while (inBuffer.position() == 0 && !state.isFrameTypePermitted(FrameType.DATA)) {
+                while (inBuffer.position() == 0 && state.isFrameTypePermitted(FrameType.DATA)) {
                     // Need to block until some data is written
                     try {
                         inBuffer.wait();
@@ -437,7 +437,7 @@
                     written = inBuffer.remaining();
                     inBuffer.get(outBuffer, 0, written);
                     inBuffer.clear();
-                } else if (state.isFrameTypePermitted(FrameType.DATA)) {
+                } else if (!state.isFrameTypePermitted(FrameType.DATA)) {
                     return -1;
                 } else {
                     // TODO Should never happen
