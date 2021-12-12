diff --git a/java/org/apache/coyote/http2/Http2AsyncParser.java b/java/org/apache/coyote/http2/Http2AsyncParser.java
index 30f6591..92531bf 100644
--- a/java/org/apache/coyote/http2/Http2AsyncParser.java
+++ b/java/org/apache/coyote/http2/Http2AsyncParser.java
@@ -58,7 +58,7 @@
         framePaylod.clear();
         FrameCompletionHandler handler = new FrameCompletionHandler(expected, header, framePaylod);
         CompletionState state =
-                socketWrapper.read(BlockingMode.NON_BLOCK, socketWrapper.getWriteTimeout(), TimeUnit.MILLISECONDS, null, handler, handler, header, framePaylod);
+                socketWrapper.read(BlockingMode.NON_BLOCK, socketWrapper.getReadTimeout(), TimeUnit.MILLISECONDS, null, handler, handler, header, framePaylod);
         if (state == CompletionState.ERROR || state == CompletionState.INLINE) {
             handleAsyncException();
             return true;
