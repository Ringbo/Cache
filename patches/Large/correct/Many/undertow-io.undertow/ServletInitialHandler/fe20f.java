diff --git a/servlet/src/main/java/io/undertow/servlet/handlers/ServletInitialHandler.java b/servlet/src/main/java/io/undertow/servlet/handlers/ServletInitialHandler.java
index 3873ea6..0e8e3ec 100644
--- a/servlet/src/main/java/io/undertow/servlet/handlers/ServletInitialHandler.java
+++ b/servlet/src/main/java/io/undertow/servlet/handlers/ServletInitialHandler.java
@@ -170,7 +170,7 @@
             //this can only happen if the path ends with a /
             //otherwise there would be a redirect instead
             exchange.setRelativePath(info.getRewriteLocation());
-            exchange.setRequestPath(exchange.getRequestPath() + info.getRewriteLocation());
+            exchange.setRequestPath(exchange.getResolvedPath() + info.getRewriteLocation());
         }
 
         final HttpServletResponseImpl response = new HttpServletResponseImpl(exchange, servletContext);
