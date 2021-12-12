diff --git a/dropwizard-http2/src/main/java/io/dropwizard/http2/Http2ConnectorFactory.java b/dropwizard-http2/src/main/java/io/dropwizard/http2/Http2ConnectorFactory.java
index cd0d495..4f70119 100644
--- a/dropwizard-http2/src/main/java/io/dropwizard/http2/Http2ConnectorFactory.java
+++ b/dropwizard-http2/src/main/java/io/dropwizard/http2/Http2ConnectorFactory.java
@@ -100,7 +100,7 @@
         final HttpConnectionFactory http1 = buildHttpConnectionFactory(httpConfig);
         final HTTP2ServerConnectionFactory http2 = new HTTP2ServerConnectionFactory(httpConfig);
         http2.setMaxConcurrentStreams(maxConcurrentStreams);
-        http2.setInitialStreamSendWindow(initialStreamSendWindow);
+        http2.setInitialStreamRecvWindow(initialStreamSendWindow);
 
         final NegotiatingServerConnectionFactory alpn = new ALPNServerConnectionFactory(H2, H2_17);
         alpn.setDefaultProtocol(HTTP_1_1); // Speak HTTP 1.1 over TLS if negotiation fails
