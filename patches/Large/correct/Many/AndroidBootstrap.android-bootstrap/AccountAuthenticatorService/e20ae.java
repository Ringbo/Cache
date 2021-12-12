diff --git a/app/src/main/java/com/donnfelker/android/bootstrap/authenticator/AccountAuthenticatorService.java b/app/src/main/java/com/donnfelker/android/bootstrap/authenticator/AccountAuthenticatorService.java
index b810396..92e97e3 100644
--- a/app/src/main/java/com/donnfelker/android/bootstrap/authenticator/AccountAuthenticatorService.java
+++ b/app/src/main/java/com/donnfelker/android/bootstrap/authenticator/AccountAuthenticatorService.java
@@ -9,7 +9,7 @@
 /**
  * Authenticator service that returns a subclass of AbstractAccountAuthenticator in onBind()
  */
-class AccountAuthenticatorService extends Service {
+public class AccountAuthenticatorService extends Service {
 
     private static BootstrapAccountAuthenticator sAuthenticator = null;
 
