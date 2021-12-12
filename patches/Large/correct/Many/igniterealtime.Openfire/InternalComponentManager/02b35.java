diff --git a/src/java/org/jivesoftware/openfire/component/InternalComponentManager.java b/src/java/org/jivesoftware/openfire/component/InternalComponentManager.java
index a94e0da..c89eced 100644
--- a/src/java/org/jivesoftware/openfire/component/InternalComponentManager.java
+++ b/src/java/org/jivesoftware/openfire/component/InternalComponentManager.java
@@ -388,7 +388,7 @@
                 Presence presence = new Presence();
                 presence.setFrom(prober);
                 presence.setTo(probee);
-                routingTable.routePacket(probee, presence);
+                routingTable.routePacket(probee, presence, false);
 
                 // No reason to hold onto prober reference.
                 presenceMap.remove(prober);
