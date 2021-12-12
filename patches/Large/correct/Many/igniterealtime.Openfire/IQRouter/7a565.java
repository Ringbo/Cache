diff --git a/src/java/org/jivesoftware/messenger/IQRouter.java b/src/java/org/jivesoftware/messenger/IQRouter.java
index e5b7822..05a9948 100644
--- a/src/java/org/jivesoftware/messenger/IQRouter.java
+++ b/src/java/org/jivesoftware/messenger/IQRouter.java
@@ -195,7 +195,7 @@
                             // Locate a route to the sender of the IQ and ask it to process
                             // the packet. Use the routingTable so that routes to remote servers
                             // may be found
-                            routingTable.getRoute(packet.getFrom()).process(packet);
+                            routingTable.getRoute(packet.getFrom()).process(reply);
                         }
                         catch (NoSuchRouteException e) {
                             // No root was found so try looking for local sessions that have never
