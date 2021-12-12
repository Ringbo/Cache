diff --git a/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java b/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
index b745ec6..9bfb5bb 100644
--- a/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
+++ b/modules/core/src/main/java/org/gridgain/grid/spi/discovery/tcp/GridTcpDiscoverySpi.java
@@ -3128,7 +3128,7 @@
                         }
 
                         // Stick in authentication subject to node (use security-safe attributes for copy).
-                        Map<String, Object> attrs = new HashMap<>(node.attributes());
+                        Map<String, Object> attrs = new HashMap<>(node.getAttributes());
 
                         attrs.put(GridNodeAttributes.ATTR_SECURITY_SUBJECT, gridMarsh.marshal(subj));
 
