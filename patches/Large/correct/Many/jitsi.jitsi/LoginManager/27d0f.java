diff --git a/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java b/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
index a95dd9e..c3d3f75 100644
--- a/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
+++ b/src/net/java/sip/communicator/impl/gui/main/login/LoginManager.java
@@ -253,7 +253,7 @@
             else if (evt.getReasonCode() == RegistrationStateChangeEvent
                     .REASON_AUTHENTICATION_FAILED) {
                 String msgText = Messages.getI18NString("authenticationFailed",
-                        protocolProvider.getAccountID().getAccountAddress())
+                        protocolProvider.getAccountID().getUserID())
                         .getText();
 
                 new ErrorDialog(null, msgText,
@@ -266,7 +266,7 @@
             this.mainFrame.getStatusPanel().updateStatus(evt.getProvider());
 
             String msgText = Messages.getI18NString("connectionFailedMessage",
-                protocolProvider.getAccountID().getAccountAddress()).getText();
+                protocolProvider.getAccountID().getUserID()).getText();
 
             new ErrorDialog(null, msgText,
                 Messages.getI18NString("error").getText()).showDialog();
