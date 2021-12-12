diff --git a/okhttp/src/main/java/okhttp3/Cache.java b/okhttp/src/main/java/okhttp3/Cache.java
index 8eb4fb0..a37bc91 100644
--- a/okhttp/src/main/java/okhttp3/Cache.java
+++ b/okhttp/src/main/java/okhttp3/Cache.java
@@ -432,7 +432,7 @@
     private Sink body;
     boolean done;
 
-    public CacheRequestImpl(final DiskLruCache.Editor editor) {
+    CacheRequestImpl(final DiskLruCache.Editor editor) {
       this.editor = editor;
       this.cacheOut = editor.newSink(ENTRY_BODY);
       this.body = new ForwardingSink(cacheOut) {
@@ -536,7 +536,7 @@
      * base64-encoded and appear each on their own line. A length of -1 is used to encode a null
      * array. The last line is optional. If present, it contains the TLS version.
      */
-    public Entry(Source in) throws IOException {
+    Entry(Source in) throws IOException {
       try {
         BufferedSource source = Okio.buffer(in);
         url = source.readUtf8LineStrict();
@@ -590,7 +590,7 @@
       }
     }
 
-    public Entry(Response response) {
+    Entry(Response response) {
       this.url = response.request().url().toString();
       this.varyHeaders = HttpHeaders.varyHeaders(response);
       this.requestMethod = response.request().method();
@@ -735,7 +735,7 @@
     private final String contentType;
     private final String contentLength;
 
-    public CacheResponseBody(final DiskLruCache.Snapshot snapshot,
+    CacheResponseBody(final DiskLruCache.Snapshot snapshot,
         String contentType, String contentLength) {
       this.snapshot = snapshot;
       this.contentType = contentType;
