diff --git a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/internal/TcpDiscoveryNode.java b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/internal/TcpDiscoveryNode.java
index b2797a40..20fb6c5 100644
--- a/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/internal/TcpDiscoveryNode.java
+++ b/modules/core/src/main/java/org/apache/ignite/spi/discovery/tcp/internal/TcpDiscoveryNode.java
@@ -652,7 +652,7 @@
 
     /**
      * IMPORTANT!
-     * Only purpose of this constructor is creating node which contains only necessary data to store on disc
+     * Only purpose of this constructor is creating node which contains necessary data to store on disc only
      * @param node to copy data from
      */
     public TcpDiscoveryNode(
@@ -667,6 +667,6 @@
         this.daemon = node.isDaemon();
         this.clientRouterNodeId = node.isClient() ? node.id() : null;
 
-        attrs = Collections.emptyMap();
+        attrs = Collections.singletonMap(ATTR_NODE_CONSISTENT_ID, consistentId);
     }
 }
