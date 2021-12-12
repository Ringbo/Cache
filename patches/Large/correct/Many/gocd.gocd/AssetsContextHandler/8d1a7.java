diff --git a/jetty9/src/com/thoughtworks/go/server/AssetsContextHandler.java b/jetty9/src/com/thoughtworks/go/server/AssetsContextHandler.java
index 719ad29..c00c103 100644
--- a/jetty9/src/com/thoughtworks/go/server/AssetsContextHandler.java
+++ b/jetty9/src/com/thoughtworks/go/server/AssetsContextHandler.java
@@ -40,7 +40,7 @@
         handler = new AssetsHandler();
 
         GzipHandler gzipHandler = new GzipHandler();
-        gzipHandler.setMimeTypes("text/html,text/plain,text/xml,application/xhtml+xml,text/css,application/javascript,image/svg+xml,application/vnd.go.cd.v1+json,application/json");
+        gzipHandler.addIncludedMimeTypes("text/html,text/plain,text/xml,application/xhtml+xml,text/css,application/javascript,image/svg+xml,application/vnd.go.cd.v1+json,application/json");
         gzipHandler.setHandler(handler);
         setHandler(gzipHandler);
     }
