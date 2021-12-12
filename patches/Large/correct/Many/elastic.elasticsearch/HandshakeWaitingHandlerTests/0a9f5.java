diff --git a/src/test/java/org/elasticsearch/shield/transport/netty/HandshakeWaitingHandlerTests.java b/src/test/java/org/elasticsearch/shield/transport/netty/HandshakeWaitingHandlerTests.java
index d114d0e..c669141 100644
--- a/src/test/java/org/elasticsearch/shield/transport/netty/HandshakeWaitingHandlerTests.java
+++ b/src/test/java/org/elasticsearch/shield/transport/netty/HandshakeWaitingHandlerTests.java
@@ -217,7 +217,7 @@
         @Override
         public ChannelFuture call() throws Exception {
             ChannelBuffer buffer = ChannelBuffers.buffer(8);
-            buffer.writeLong(SecureRandom.getInstanceStrong().nextLong());
+            buffer.writeLong(SecureRandom.getInstance("SHA1PRNG").nextLong());
 
             // Connect and wait, then immediately start writing
             ChannelFuture future = bootstrap.connect(new InetSocketAddress("localhost", port));
