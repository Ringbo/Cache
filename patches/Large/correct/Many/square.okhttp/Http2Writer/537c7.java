diff --git a/okhttp/src/main/java/okhttp3/internal/http2/Http2Writer.java b/okhttp/src/main/java/okhttp3/internal/http2/Http2Writer.java
index 7490b09..5ef6bb9 100644
--- a/okhttp/src/main/java/okhttp3/internal/http2/Http2Writer.java
+++ b/okhttp/src/main/java/okhttp3/internal/http2/Http2Writer.java
@@ -54,7 +54,7 @@
 
   final Hpack.Writer hpackWriter;
 
-  public Http2Writer(BufferedSink sink, boolean client) {
+  Http2Writer(BufferedSink sink, boolean client) {
     this.sink = sink;
     this.client = client;
     this.hpackBuffer = new Buffer();
