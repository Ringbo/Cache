diff --git a/src/net/java/sip/communicator/plugin/jabberaccregwizz/JabberAccountCreationForm.java b/src/net/java/sip/communicator/plugin/jabberaccregwizz/JabberAccountCreationForm.java
index 34710f3..ef6e56a 100644
--- a/src/net/java/sip/communicator/plugin/jabberaccregwizz/JabberAccountCreationForm.java
+++ b/src/net/java/sip/communicator/plugin/jabberaccregwizz/JabberAccountCreationForm.java
@@ -169,7 +169,8 @@
         catch (XMPPException exc)
         {
             logger.error(exc);
-            if (exc.getXMPPError().getCode() == 409)
+            if (exc.getXMPPError() != null
+                && exc.getXMPPError().getCode() == 409)
             {
                 showErrorMessage(Resources.getString(
                         "plugin.jabberaccregwizz.USER_EXISTS_ERROR"));
