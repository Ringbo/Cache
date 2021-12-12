diff --git a/src/net/java/sip/communicator/impl/gui/main/login/SecurityAuthorityImpl.java b/src/net/java/sip/communicator/impl/gui/main/login/SecurityAuthorityImpl.java
index 3d9db3e..03aa62b 100644
--- a/src/net/java/sip/communicator/impl/gui/main/login/SecurityAuthorityImpl.java
+++ b/src/net/java/sip/communicator/impl/gui/main/login/SecurityAuthorityImpl.java
@@ -45,7 +45,7 @@
         AuthenticationWindow loginWindow = new AuthenticationWindow(
                 mainFrame, protocolProvider, realm, userCredentials);
         
-        loginWindow.showWindow();
+        loginWindow.setVisible(true);
         
         return userCredentials;
     }    
