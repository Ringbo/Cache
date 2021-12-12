diff --git a/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java b/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
index cca4eba..d3b4ae9 100644
--- a/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
+++ b/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
@@ -1404,7 +1404,7 @@
         if (node.id().equals(locNodeId))
             return true;
 
-        for (InetSocketAddress addr : getNodeAddresses(node) ) {
+        for (InetSocketAddress addr : getNodeAddresses(node, U.sameMacs(locNode, node)) ) {
             try {
                 // ID returned by the node should be the same as ID of the parameter for ping to succeed.
                 return node.id().equals(pingNode(addr));
@@ -3623,7 +3623,7 @@
             throws GridSpiException {
             GridSpiException ex = null;
 
-            for (InetSocketAddress addr : getNodeAddresses(node)) {
+            for (InetSocketAddress addr : getNodeAddresses(node, U.sameMacs(locNode, node))) {
                 try {
                     sendMessageDirectly(msg, addr);
 
