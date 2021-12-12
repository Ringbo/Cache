diff --git a/src/net/java/sip/communicator/impl/gui/utils/ConfigurationManager.java b/src/net/java/sip/communicator/impl/gui/utils/ConfigurationManager.java
index d7e2176..9432828 100644
--- a/src/net/java/sip/communicator/impl/gui/utils/ConfigurationManager.java
+++ b/src/net/java/sip/communicator/impl/gui/utils/ConfigurationManager.java
@@ -109,7 +109,7 @@
             String chatRoomID
                 = configService.getString(chatRoomRootPropName);
 
-            chatRooms.add(chatRoomID);
+            chatRoomsList.add(chatRoomID);
         }
     }
 
