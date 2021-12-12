diff --git a/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java b/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
index acedc4a..7f5449c 100644
--- a/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
+++ b/webserver/src/main/java/fi/iki/elonen/SimpleWebServer.java
@@ -442,7 +442,7 @@
         String mimeTypeForFile = getMimeTypeForFile(uri);
         WebServerPlugin plugin = SimpleWebServer.mimeTypeHandlers.get(mimeTypeForFile);
         Response response = null;
-        if (plugin != null) {
+        if (plugin != null && plugin.canServeUri(uri, homeDir)) {
             response = plugin.serveFile(uri, headers, session, f, mimeTypeForFile);
             if (response != null && response instanceof InternalRewrite) {
                 InternalRewrite rewrite = (InternalRewrite) response;
