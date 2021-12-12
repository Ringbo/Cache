diff --git a/webapps/examples/WEB-INF/classes/websocket/echo/EchoAsyncAnnotation.java b/webapps/examples/WEB-INF/classes/websocket/echo/EchoAsyncAnnotation.java
index 3fbd078..b010e71 100644
--- a/webapps/examples/WEB-INF/classes/websocket/echo/EchoAsyncAnnotation.java
+++ b/webapps/examples/WEB-INF/classes/websocket/echo/EchoAsyncAnnotation.java
@@ -39,8 +39,7 @@
     ByteArrayOutputStream bytes = null;
 
     @OnMessage
-    public void echoTextMessage(Session session, String msg, boolean last)
-            throws IOException {
+    public void echoTextMessage(Session session, String msg, boolean last) {
         if (sb == null) {
             sb = new StringBuilder();
         }
