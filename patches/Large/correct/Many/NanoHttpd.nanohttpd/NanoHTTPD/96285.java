diff --git a/core/src/main/java/fi/iki/elonen/NanoHTTPD.java b/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
index de4bc83..50e074f 100644
--- a/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
+++ b/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
@@ -1293,7 +1293,7 @@
 
         private void sendBodyWithCorrectEncoding(OutputStream outputStream, long pending) throws IOException {
             if (encodeAsGzip) {
-                GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream, true);
+                GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream);
                 sendBody(gzipOutputStream, -1);
                 gzipOutputStream.finish();
             } else {
