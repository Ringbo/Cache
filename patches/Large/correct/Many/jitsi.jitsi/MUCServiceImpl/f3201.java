diff --git a/src/net/java/sip/communicator/impl/muc/MUCServiceImpl.java b/src/net/java/sip/communicator/impl/muc/MUCServiceImpl.java
index e05842c..0dc9b5b 100644
--- a/src/net/java/sip/communicator/impl/muc/MUCServiceImpl.java
+++ b/src/net/java/sip/communicator/impl/muc/MUCServiceImpl.java
@@ -794,7 +794,7 @@
             if (!SUCCESS.equals(returnCode) && 
                 !AUTHENTICATION_FAILED.equals(returnCode))
             {
-                MUCActivator.getAlertUIService().showAlertDialog(
+                MUCActivator.getAlertUIService().showAlertPopup(
                     resources.getI18NString("service.gui.ERROR"), errorMessage);
             }
 
