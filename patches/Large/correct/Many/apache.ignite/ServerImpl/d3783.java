diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ServerImpl.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ServerImpl.java
index 720ce3a..94a2290 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ServerImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ServerImpl.java
@@ -585,11 +585,12 @@
 
     /** {@inheritDoc} */
     @Override public void failNode(UUID nodeId, @Nullable String warning) {
-        ClusterNode node = ring.node(nodeId);
+        TcpDiscoveryNode node = ring.node(nodeId);
 
         if (node != null) {
             TcpDiscoveryNodeFailedMessage msg = new TcpDiscoveryNodeFailedMessage(getLocalNodeId(),
-                node.id(), node.order());
+                node.id(),
+                node.internalOrder());
 
             msg.warning(warning);
 
