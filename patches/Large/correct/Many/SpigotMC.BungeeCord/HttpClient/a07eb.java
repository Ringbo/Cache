diff --git a/proxy/src/main/java/net/md_5/bungee/http/HttpClient.java b/proxy/src/main/java/net/md_5/bungee/http/HttpClient.java
index c4ffc53..740e671 100644
--- a/proxy/src/main/java/net/md_5/bungee/http/HttpClient.java
+++ b/proxy/src/main/java/net/md_5/bungee/http/HttpClient.java
@@ -63,7 +63,7 @@
                     HttpRequest request = new DefaultHttpRequest( HttpVersion.HTTP_1_1, HttpMethod.GET, path );
                     request.headers().set( HttpHeaders.Names.HOST, uri.getHost() );
 
-                    future.channel().write( request );
+                    future.channel().writeAndFlush( request );
                 } else
                 {
                     callback.done( null, future.cause() );
