diff --git a/jetty-http2/http2-server/src/test/java/org/eclipse/jetty/http2/server/Http2Server.java b/jetty-http2/http2-server/src/test/java/org/eclipse/jetty/http2/server/Http2Server.java
index c80f358..5c53235 100644
--- a/jetty-http2/http2-server/src/test/java/org/eclipse/jetty/http2/server/Http2Server.java
+++ b/jetty-http2/http2-server/src/test/java/org/eclipse/jetty/http2/server/Http2Server.java
@@ -94,8 +94,7 @@
         HTTP2ServerConnectionFactory h2 = new HTTP2ServerConnectionFactory(https_config);
         
         NegotiatingServerConnectionFactory.checkProtocolNegotiationAvailable();
-        ALPNServerConnectionFactory alpn =
-            new ALPNServerConnectionFactory(h2.getProtocol(),http.getDefaultProtocol());
+        ALPNServerConnectionFactory alpn = new ALPNServerConnectionFactory();
         alpn.setDefaultProtocol(http.getDefaultProtocol());
         
         // SSL Factory
