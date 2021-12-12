diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/Dispatcher.java b/jetty-server/src/main/java/org/eclipse/jetty/server/Dispatcher.java
index 01a8d69..d73d788 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/Dispatcher.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/Dispatcher.java
@@ -252,7 +252,7 @@
 
     private void commitResponse(ServletResponse response, Request baseRequest) throws IOException
     {
-        if (baseRequest.getResponse().isWriting())
+        if (!(response instanceof Response) || baseRequest.getResponse().isWriting())
         {
             try
             {
