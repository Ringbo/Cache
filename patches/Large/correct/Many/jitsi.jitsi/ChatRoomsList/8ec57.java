diff --git a/src/net/java/sip/communicator/impl/gui/main/chatroomslist/ChatRoomsList.java b/src/net/java/sip/communicator/impl/gui/main/chatroomslist/ChatRoomsList.java
index a7bc676..a3541fa 100644
--- a/src/net/java/sip/communicator/impl/gui/main/chatroomslist/ChatRoomsList.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chatroomslist/ChatRoomsList.java
@@ -253,7 +253,7 @@
                 ChatWindowManager chatWindowManager
                     = mainFrame.getChatWindowManager();
                 
-                ChatPanel chatPanel
+                ConferenceChatPanel chatPanel
                     = chatWindowManager.getMultiChat(chatRoomWrapper);
                 
                 chatWindowManager.openChat(chatPanel, true);
