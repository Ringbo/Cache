diff --git a/src/net/java/sip/communicator/impl/msghistory/MessageSourceService.java b/src/net/java/sip/communicator/impl/msghistory/MessageSourceService.java
index 00f2266..cef4618 100644
--- a/src/net/java/sip/communicator/impl/msghistory/MessageSourceService.java
+++ b/src/net/java/sip/communicator/impl/msghistory/MessageSourceService.java
@@ -505,7 +505,7 @@
         }
         else if(obj instanceof ChatRoomMessageReceivedEvent)
         {
-            chatRoom = ((ChatRoomMessageDeliveredEvent)obj).getSourceChatRoom();
+            chatRoom = ((ChatRoomMessageReceivedEvent)obj).getSourceChatRoom();
         }
 
         for(MessageSourceContact msc : list)
