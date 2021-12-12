diff --git a/core/client/src/main/java/alluxio/client/netty/NettyRPCContext.java b/core/client/src/main/java/alluxio/client/netty/NettyRPCContext.java
index c1e976e..2a6bb03 100644
--- a/core/client/src/main/java/alluxio/client/netty/NettyRPCContext.java
+++ b/core/client/src/main/java/alluxio/client/netty/NettyRPCContext.java
@@ -16,7 +16,7 @@
 /**
  * Context to send a netty RPC.
  */
-public class NettyRPCContext {
+public final class NettyRPCContext {
   /** The netty channel, default to be null. */
   private Channel mChannel;
   /** The RPC timeout in ms, default to +inf. */
