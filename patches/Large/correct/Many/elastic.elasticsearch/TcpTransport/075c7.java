diff --git a/core/src/main/java/org/elasticsearch/transport/TcpTransport.java b/core/src/main/java/org/elasticsearch/transport/TcpTransport.java
index d5aed81..0bf600c 100644
--- a/core/src/main/java/org/elasticsearch/transport/TcpTransport.java
+++ b/core/src/main/java/org/elasticsearch/transport/TcpTransport.java
@@ -278,13 +278,13 @@
         this.transportService = service;
     }
 
-    private static class HandshakeResponseHandler<Channel> implements TransportResponseHandler<VersionHandshakeResponse> {
+    private static class HandshakeResponseHandler implements TransportResponseHandler<VersionHandshakeResponse> {
         final AtomicReference<Version> versionRef = new AtomicReference<>();
         final CountDownLatch latch = new CountDownLatch(1);
         final AtomicReference<Exception> exceptionRef = new AtomicReference<>();
-        final Channel channel;
+        final TcpChannel channel;
 
-        HandshakeResponseHandler(Channel channel) {
+        HandshakeResponseHandler(TcpChannel channel) {
             this.channel = channel;
         }
 
