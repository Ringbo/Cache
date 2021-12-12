diff --git a/src/java/org/jivesoftware/wildfire/muc/MUCRoom.java b/src/java/org/jivesoftware/wildfire/muc/MUCRoom.java
index 8841427..76771e5 100644
--- a/src/java/org/jivesoftware/wildfire/muc/MUCRoom.java
+++ b/src/java/org/jivesoftware/wildfire/muc/MUCRoom.java
@@ -145,7 +145,7 @@
      * @return The user's role in the room
      * @throws UserNotFoundException If there is no user with the given nickname
      */
-    MUCRole getOccupantByFullJID(String jid) throws UserNotFoundException;
+    MUCRole getOccupantByFullJID(JID jid) throws UserNotFoundException;
 
     /**
      * Obtain the roles of all users in the chatroom.
