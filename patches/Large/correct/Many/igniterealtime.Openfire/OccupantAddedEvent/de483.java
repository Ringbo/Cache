diff --git a/src/java/org/jivesoftware/openfire/muc/cluster/OccupantAddedEvent.java b/src/java/org/jivesoftware/openfire/muc/cluster/OccupantAddedEvent.java
index 7dd69ef..88189e0 100644
--- a/src/java/org/jivesoftware/openfire/muc/cluster/OccupantAddedEvent.java
+++ b/src/java/org/jivesoftware/openfire/muc/cluster/OccupantAddedEvent.java
@@ -69,7 +69,7 @@
     }
 
     public String getNickname() {
-        return presence.getTo().getResource().trim();
+        return presence.getFrom().getResource().trim();
     }
 
     public MUCRole.Role getRole() {
