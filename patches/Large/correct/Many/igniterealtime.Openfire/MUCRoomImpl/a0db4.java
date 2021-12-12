diff --git a/src/java/org/jivesoftware/wildfire/muc/spi/MUCRoomImpl.java b/src/java/org/jivesoftware/wildfire/muc/spi/MUCRoomImpl.java
index 57d438b..0070718 100644
--- a/src/java/org/jivesoftware/wildfire/muc/spi/MUCRoomImpl.java
+++ b/src/java/org/jivesoftware/wildfire/muc/spi/MUCRoomImpl.java
@@ -361,7 +361,7 @@
         throw new UserNotFoundException();
     }
 
-    public MUCRole getOccupantByFullJID(String jid) throws UserNotFoundException {
+    public MUCRole getOccupantByFullJID(JID jid) throws UserNotFoundException {
         MUCRole role = occupantsByFullJID.get(jid);
         if (role != null) {
             return role;
@@ -664,7 +664,7 @@
                 occupantsByBareJID.remove(user.getAddress().toBareJID());
             }
         }
-        occupantsByFullJID.remove(user.getAddress().toString());
+        occupantsByFullJID.remove(user.getAddress());
     }
 
     public void destroyRoom(String alternateJID, String reason) {
