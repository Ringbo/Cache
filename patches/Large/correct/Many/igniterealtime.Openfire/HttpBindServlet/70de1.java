diff --git a/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java b/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
index c22079a..1096c1b 100644
--- a/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
+++ b/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
@@ -299,9 +299,9 @@
         if (async) {
             response.getOutputStream().setWriteListener(new WriteListenerImpl(context, byteContent));
         } else {
-            // BOSH communication should not have Chunked encoding. Ensure that the
-            // buffer can hold the entire response to prevent chunking.
-            context.getResponse().setBufferSize(byteContent.length);
+            // BOSH communication should not use Chunked encoding.
+            // This is prevented by explicitly setting the Content-Length header.
+            context.getResponse().setContentLength(byteContent.length);
             context.getResponse().getOutputStream().write(byteContent);
             context.getResponse().getOutputStream().flush();
             context.complete();
