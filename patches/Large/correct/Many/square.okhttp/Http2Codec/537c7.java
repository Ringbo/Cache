diff --git a/okhttp/src/main/java/okhttp3/internal/http2/Http2Codec.java b/okhttp/src/main/java/okhttp3/internal/http2/Http2Codec.java
index 61680d5..0ed8be7 100644
--- a/okhttp/src/main/java/okhttp3/internal/http2/Http2Codec.java
+++ b/okhttp/src/main/java/okhttp3/internal/http2/Http2Codec.java
@@ -190,7 +190,7 @@
   }
 
   class StreamFinishingSource extends ForwardingSource {
-    public StreamFinishingSource(Source delegate) {
+    StreamFinishingSource(Source delegate) {
       super(delegate);
     }
 
