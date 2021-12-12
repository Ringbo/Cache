diff --git a/src/net/java/sip/communicator/plugin/otr/authdialog/OtrBuddyAuthenticationDialog.java b/src/net/java/sip/communicator/plugin/otr/authdialog/OtrBuddyAuthenticationDialog.java
index 9003350..b67ce81 100644
--- a/src/net/java/sip/communicator/plugin/otr/authdialog/OtrBuddyAuthenticationDialog.java
+++ b/src/net/java/sip/communicator/plugin/otr/authdialog/OtrBuddyAuthenticationDialog.java
@@ -167,7 +167,7 @@
                 }
                 else if (authenticationMethod.equals(am[1]))
                 {
-                    String secret = secretQuestionPanel.getSecret();
+                    String secret = sharedSecretPanel.getSecret();
                     String question = null;
 
                     OtrActivator.scOtrEngine.initSmp(contact, question, secret);
