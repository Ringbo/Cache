diff --git a/src/net/java/sip/communicator/impl/protocol/irc/IrcStack.java b/src/net/java/sip/communicator/impl/protocol/irc/IrcStack.java
index b365f5b..dacfffd 100644
--- a/src/net/java/sip/communicator/impl/protocol/irc/IrcStack.java
+++ b/src/net/java/sip/communicator/impl/protocol/irc/IrcStack.java
@@ -488,7 +488,7 @@
                         {
                             try
                             {
-                                if (!channel.getName().equals(
+                                if (!channel.getName().equalsIgnoreCase(
                                     actualChatRoom.getIdentifier()))
                                 {
                                     // If the channel name is not the
@@ -1334,7 +1334,7 @@
          */
         private boolean isThisChatRoom(String chatRoomName)
         {
-            return this.chatroom.getIdentifier().equals(chatRoomName);
+            return this.chatroom.getIdentifier().equalsIgnoreCase(chatRoomName);
         }
 
         /**
