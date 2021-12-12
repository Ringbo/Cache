diff --git a/src/net/java/sip/communicator/impl/gui/main/chat/conference/ConferenceChatManager.java b/src/net/java/sip/communicator/impl/gui/main/chat/conference/ConferenceChatManager.java
index e10910e..92e08de 100644
--- a/src/net/java/sip/communicator/impl/gui/main/chat/conference/ConferenceChatManager.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chat/conference/ConferenceChatManager.java
@@ -622,7 +622,7 @@
                 GuiActivator.getResources().getI18NString("service.gui.ERROR"),
                 GuiActivator.getResources().getI18NString(
                     "service.gui.CREATE_CHAT_ROOM_ERROR",
-                    new String[]{protocolProvider.getProtocolName()}),
+                    new String[]{protocolProvider.getProtocolDisplayName()}),
                     ex)
             .showDialog();
         }
@@ -633,7 +633,7 @@
                 GuiActivator.getResources().getI18NString("service.gui.ERROR"),
                 GuiActivator.getResources().getI18NString(
                     "service.gui.CREATE_CHAT_ROOM_ERROR",
-                    new String[]{protocolProvider.getProtocolName()}),
+                    new String[]{protocolProvider.getProtocolDisplayName()}),
                     ex)
             .showDialog();
         }
