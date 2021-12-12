diff --git a/dropwizard-http2/src/main/java/io/dropwizard/http2/Http2CConnectorFactory.java b/dropwizard-http2/src/main/java/io/dropwizard/http2/Http2CConnectorFactory.java
index d6b30c2..5c32758 100644
--- a/dropwizard-http2/src/main/java/io/dropwizard/http2/Http2CConnectorFactory.java
+++ b/dropwizard-http2/src/main/java/io/dropwizard/http2/Http2CConnectorFactory.java
@@ -88,7 +88,7 @@
         final HttpConnectionFactory http11 = buildHttpConnectionFactory(httpConfig);
         final HTTP2ServerConnectionFactory http2c = new HTTP2CServerConnectionFactory(httpConfig);
         http2c.setMaxConcurrentStreams(maxConcurrentStreams);
-        http2c.setInitialStreamSendWindow(initialStreamSendWindow);
+        http2c.setInitialStreamRecvWindow(initialStreamSendWindow);
 
         // The server connector should use HTTP/1.1 by default. It affords to the server to stay compatible
         // with old clients. New clients which want to use HTTP/2, however, will make an HTTP/1.1 OPTIONS
