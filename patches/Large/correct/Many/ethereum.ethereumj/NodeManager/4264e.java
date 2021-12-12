diff --git a/ethereumj-core/src/main/java/org/ethereum/net/rlpx/discover/NodeManager.java b/ethereumj-core/src/main/java/org/ethereum/net/rlpx/discover/NodeManager.java
index f665713..736ba3c 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/rlpx/discover/NodeManager.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/rlpx/discover/NodeManager.java
@@ -239,7 +239,7 @@
         Message m = discoveryEvent.getMessage();
         InetSocketAddress sender = discoveryEvent.getAddress();
 
-        Node n = new Node(m.getNodeId(), sender.getHostName(), sender.getPort());
+        Node n = new Node(m.getNodeId(), sender.getHostString(), sender.getPort());
 
         if (inboundOnlyFromKnownNodes && !hasNodeHandler(n)) {
             logger.debug("=/=> (" + sender + "): inbound packet from unknown peer rejected due to config option.");
