diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ClientImpl.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ClientImpl.java
index 04276d2..3f05f59 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ClientImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/ClientImpl.java
@@ -339,11 +339,12 @@
 
     /** {@inheritDoc} */
     @Override public void failNode(UUID nodeId, @Nullable String warning) {
-        ClusterNode node = rmtNodes.get(nodeId);
+        TcpDiscoveryNode node = rmtNodes.get(nodeId);
 
         if (node != null) {
             TcpDiscoveryNodeFailedMessage msg = new TcpDiscoveryNodeFailedMessage(getLocalNodeId(),
-                node.id(), node.order());
+                node.id(),
+                node.internalOrder());
 
             msg.warning(warning);
 
