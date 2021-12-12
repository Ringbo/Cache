diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/cors/CorsHandler.java b/codec-http/src/main/java/io/netty/handler/codec/http/cors/CorsHandler.java
index f4b5552..9e77565 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/cors/CorsHandler.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/cors/CorsHandler.java
@@ -205,7 +205,7 @@
                 setExposeHeaders(response);
             }
         }
-        ctx.writeAndFlush(msg, promise);
+        ctx.write(msg, promise);
     }
 
     private static void forbidden(final ChannelHandlerContext ctx, final HttpRequest request) {
