diff --git a/core/src/main/java/io/undertow/protocols/http2/Http2Channel.java b/core/src/main/java/io/undertow/protocols/http2/Http2Channel.java
index 83e6336..5cb956e 100644
--- a/core/src/main/java/io/undertow/protocols/http2/Http2Channel.java
+++ b/core/src/main/java/io/undertow/protocols/http2/Http2Channel.java
@@ -1071,7 +1071,7 @@
         return protocol;
     }
 
-    private boolean isIdle(int streamNo) {
+    private synchronized boolean isIdle(int streamNo) {
         if(streamNo % 2 == streamIdCounter % 2) {
             return streamNo >= streamIdCounter;
         } else {
