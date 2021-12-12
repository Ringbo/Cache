diff --git a/src/net/java/sip/communicator/impl/muc/MUCServiceImpl.java b/src/net/java/sip/communicator/impl/muc/MUCServiceImpl.java
index 7aed3a8..4885f61 100644
--- a/src/net/java/sip/communicator/impl/muc/MUCServiceImpl.java
+++ b/src/net/java/sip/communicator/impl/muc/MUCServiceImpl.java
@@ -410,7 +410,7 @@
                 MUCActivator.getResources().getI18NString("service.gui.ERROR"),
                 MUCActivator.getResources().getI18NString(
                     "service.gui.CREATE_CHAT_ROOM_ERROR",
-                    new String[]{protocolProvider.getProtocolName()}),
+                    new String[]{protocolProvider.getProtocolDisplayName()}),
                     ex);
         }
         catch (OperationNotSupportedException ex)
@@ -421,7 +421,7 @@
                 MUCActivator.getResources().getI18NString("service.gui.ERROR"),
                 MUCActivator.getResources().getI18NString(
                     "service.gui.CREATE_CHAT_ROOM_ERROR",
-                    new String[]{protocolProvider.getProtocolName()}),
+                    new String[]{protocolProvider.getProtocolDisplayName()}),
                     ex);
         }
 
