diff --git a/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/internal/GridTcpDiscoveryNode.java b/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/internal/GridTcpDiscoveryNode.java
index b97aad8..346b305 100644
--- a/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/internal/GridTcpDiscoveryNode.java
+++ b/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/internal/GridTcpDiscoveryNode.java
@@ -433,6 +433,6 @@
 
     /** {@inheritDoc} */
     @Override public String toString() {
-        return S.toString(GridTcpDiscoveryNode.class, this, "attrs", attributes());
+        return S.toString(GridTcpDiscoveryNode.class, this);
     }
 }
