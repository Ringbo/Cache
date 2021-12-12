diff --git a/src/main/java/org/tron/common/overlay/server/PeerServer.java b/src/main/java/org/tron/common/overlay/server/PeerServer.java
index 23fff14..2701137 100644
--- a/src/main/java/org/tron/common/overlay/server/PeerServer.java
+++ b/src/main/java/org/tron/common/overlay/server/PeerServer.java
@@ -82,7 +82,7 @@
 
             // Start the client.
             logger.info("Listening for incoming connections, port: [{}] ", port);
-            logger.info("NodeId: [{}] ", Hex.toHexString(this.args.nodeId()));
+            logger.info("NodeId: [{}] ", Hex.toHexString(this.args.getNetNodeId()));
 
             channelFuture = b.bind(port).sync();
 
