diff --git a/okhttp/src/main/java/okhttp3/internal/http2/Http2Reader.java b/okhttp/src/main/java/okhttp3/internal/http2/Http2Reader.java
index c6fd4cc..2b093b3 100644
--- a/okhttp/src/main/java/okhttp3/internal/http2/Http2Reader.java
+++ b/okhttp/src/main/java/okhttp3/internal/http2/Http2Reader.java
@@ -67,7 +67,7 @@
   final Hpack.Reader hpackReader;
 
   /** Creates a frame reader with max header table size of 4096. */
-  public Http2Reader(BufferedSource source, boolean client) {
+  Http2Reader(BufferedSource source, boolean client) {
     this.source = source;
     this.client = client;
     this.continuation = new ContinuationSource(this.source);
@@ -356,7 +356,7 @@
     int left;
     short padding;
 
-    public ContinuationSource(BufferedSource source) {
+    ContinuationSource(BufferedSource source) {
       this.source = source;
     }
 
