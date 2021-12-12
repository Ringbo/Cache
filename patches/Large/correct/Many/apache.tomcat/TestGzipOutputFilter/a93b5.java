diff --git a/test/org/apache/coyote/http11/TestGzipOutputFilter.java b/test/org/apache/coyote/http11/TestGzipOutputFilter.java
index 88a042e..6b33af8 100644
--- a/test/org/apache/coyote/http11/TestGzipOutputFilter.java
+++ b/test/org/apache/coyote/http11/TestGzipOutputFilter.java
@@ -49,7 +49,8 @@
     public void testFlushingWithGzip() throws Exception {
         // set up response, InternalOutputBuffer, and ByteArrayOutputStream
         Response res = new Response();
-        InternalOutputBuffer iob = new InternalOutputBuffer(res);
+        InternalOutputBuffer iob = new InternalOutputBuffer(res,
+                Constants.DEFAULT_HTTP_HEADER_BUFFER_SIZE);
         ByteArrayOutputStream bos = new ByteArrayOutputStream();
         iob.setOutputStream(bos);
         res.setOutputBuffer(iob);
