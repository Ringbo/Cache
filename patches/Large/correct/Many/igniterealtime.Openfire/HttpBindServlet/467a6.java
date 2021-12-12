diff --git a/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java b/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
index c48a343..1e3ec9a 100644
--- a/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
+++ b/src/java/org/jivesoftware/openfire/http/HttpBindServlet.java
@@ -396,7 +396,7 @@
     class ReadListenerImpl implements ReadListener {
 
         private final AsyncContext context;
-        private final StringBuilder buffer = new StringBuilder(512);
+        private final ByteArrayOutputStream outStream = new ByteArrayOutputStream(1024);
         private final String remoteAddress;
 
         ReadListenerImpl(AsyncContext context) {
@@ -413,14 +413,14 @@
             byte b[] = new byte[1024];
             int length;
             while (inputStream.isReady() && (length = inputStream.read(b)) != -1) {
-                buffer.append(new String(b, 0, length, StandardCharsets.UTF_8));
+                outStream.write(b, 0, length);
             }
         }
 
         @Override
         public void onAllDataRead() throws IOException {
             Log.trace("All data has been read from [" + remoteAddress + "]");
-            processContent(context, buffer.toString());
+            processContent(context, outStream.toString(StandardCharsets.UTF_8.name()));
         }
 
         @Override
