diff --git a/src/net/java/sip/communicator/impl/gui/main/chatroomslist/ChatRoomTableDialog.java b/src/net/java/sip/communicator/impl/gui/main/chatroomslist/ChatRoomTableDialog.java
index 7e16f90..9e70971 100644
--- a/src/net/java/sip/communicator/impl/gui/main/chatroomslist/ChatRoomTableDialog.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chatroomslist/ChatRoomTableDialog.java
@@ -362,7 +362,7 @@
                     .getConferenceChatManager()
                     .createChatRoom(chatRoomName.trim(),
                         getSelectedProvider().getProtocolProvider(),
-                        new ArrayList<String>(), "", false, false, true);
+                        new ArrayList<String>(), "", false, true, true);
 
             chatRoomWrapper.getJoinOptions(true);
 
