diff --git a/example/src/main/java/io/netty/example/http/snoop/HttpSnoopClient.java b/example/src/main/java/io/netty/example/http/snoop/HttpSnoopClient.java
index 436da5b..a69feec 100644
--- a/example/src/main/java/io/netty/example/http/snoop/HttpSnoopClient.java
+++ b/example/src/main/java/io/netty/example/http/snoop/HttpSnoopClient.java
@@ -83,7 +83,7 @@
 
         // Prepare the HTTP request.
         HttpRequest request = new DefaultHttpRequest(
-                HttpVersion.HTTP_1_1, HttpMethod.GET, uri.toASCIIString());
+                HttpVersion.HTTP_1_1, HttpMethod.GET, uri.getRawPath());
         request.setHeader(HttpHeaders.Names.HOST, host);
         request.setHeader(HttpHeaders.Names.CONNECTION, HttpHeaders.Values.CLOSE);
         request.setHeader(HttpHeaders.Names.ACCEPT_ENCODING, HttpHeaders.Values.GZIP);
