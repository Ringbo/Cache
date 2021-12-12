diff --git a/osgi-examples/src/main/java/io/vertx/example/osgi/VertxWebApplication.java b/osgi-examples/src/main/java/io/vertx/example/osgi/VertxWebApplication.java
index afd29e2..6f5cfd5 100644
--- a/osgi-examples/src/main/java/io/vertx/example/osgi/VertxWebApplication.java
+++ b/osgi-examples/src/main/java/io/vertx/example/osgi/VertxWebApplication.java
@@ -71,7 +71,7 @@
       if (product == null) {
         sendError(404, response);
       } else {
-        response.putHeader("content-type", "application/json").end(product.encodePrettily());
+        response.putHeader("content-type", "application/json").end(product.encode());
       }
     }
   }
