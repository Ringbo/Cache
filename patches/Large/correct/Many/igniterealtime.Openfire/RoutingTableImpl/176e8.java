diff --git a/src/java/org/jivesoftware/messenger/spi/RoutingTableImpl.java b/src/java/org/jivesoftware/messenger/spi/RoutingTableImpl.java
index f5dd78f..af20598 100644
--- a/src/java/org/jivesoftware/messenger/spi/RoutingTableImpl.java
+++ b/src/java/org/jivesoftware/messenger/spi/RoutingTableImpl.java
@@ -1,5 +1,5 @@
 /**
- * $RCSfile$
+ * $RCSfile: RoutingTableImpl.java,v $
  * $Revision$
  * $Date$
  *
@@ -258,7 +258,8 @@
             }
             else if (nameRoutes != null) {
                 // The retrieved route points to a RoutableChannelHandler
-                if (((RoutableChannelHandler)nameRoutes).getAddress().equals(node)) {
+                if (("".equals(nodeJID) && "".equals(resourceJID)) ||
+                        ((RoutableChannelHandler) nameRoutes).getAddress().equals(node)) {
                     // Remove the route to this domain
                     routes.remove(node.getDomain());
                 }
