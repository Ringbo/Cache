diff --git a/modules/clients/src/main/java/org/gridgain/client/impl/connection/GridClientConnectionManagerImpl.java b/modules/clients/src/main/java/org/gridgain/client/impl/connection/GridClientConnectionManagerImpl.java
index 133447c..240462d 100644
--- a/modules/clients/src/main/java/org/gridgain/client/impl/connection/GridClientConnectionManagerImpl.java
+++ b/modules/clients/src/main/java/org/gridgain/client/impl/connection/GridClientConnectionManagerImpl.java
@@ -185,10 +185,10 @@
                 "(is rest enabled for this node?): " + node);
         }
 
-        final boolean sameHost = node.attributes().isEmpty() ||
+        boolean sameHost = node.attributes().isEmpty() ||
             F.containsAny(U.allLocalMACs(), node.attribute(ATTR_MACS).toString().split(", "));
 
-        final List<InetSocketAddress> srvs = new ArrayList<>(endpoints);
+        List<InetSocketAddress> srvs = new ArrayList<>(endpoints);
 
         if (sameHost)
             Collections.sort(srvs, GridClientUtils.inetSocketAddressesComparator(true));
