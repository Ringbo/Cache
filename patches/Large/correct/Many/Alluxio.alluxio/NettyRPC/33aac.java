diff --git a/core/client/src/main/java/alluxio/client/netty/NettyRPC.java b/core/client/src/main/java/alluxio/client/netty/NettyRPC.java
index f38c8b5..100461d 100644
--- a/core/client/src/main/java/alluxio/client/netty/NettyRPC.java
+++ b/core/client/src/main/java/alluxio/client/netty/NettyRPC.java
@@ -30,7 +30,7 @@
  * Netty blocking RPC client. This provides a simple way to send a request and wait for response
  * via netty. The user needs to make sure that the request is properly handled on the server.
  */
-public class NettyRPC {
+public final class NettyRPC {
   private NettyRPC() {}  // prevent instantiation
 
   /**
