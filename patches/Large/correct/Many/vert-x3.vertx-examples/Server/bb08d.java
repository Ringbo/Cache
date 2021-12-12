diff --git a/core-examples/src/main/java/io/vertx/example/core/http/simple/Server.java b/core-examples/src/main/java/io/vertx/example/core/http/simple/Server.java
index 7e3c2d7..7fd9edc 100644
--- a/core-examples/src/main/java/io/vertx/example/core/http/simple/Server.java
+++ b/core-examples/src/main/java/io/vertx/example/core/http/simple/Server.java
@@ -17,6 +17,6 @@
   public void start() throws Exception {
     vertx.createHttpServer().requestHandler(req -> {
       req.response().putHeader("content-type", "text/html").end("<html><body><h1>Hello from vert.x!</h1></body></html>");
-    }).listen(8081);
+    }).listen(8080);
   }
 }
