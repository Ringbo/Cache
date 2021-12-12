diff --git a/k9mail-library/src/main/java/com/fsck/k9/mail/store/imap/ImapConnection.java b/k9mail-library/src/main/java/com/fsck/k9/mail/store/imap/ImapConnection.java
index 8297266..13c8799 100644
--- a/k9mail-library/src/main/java/com/fsck/k9/mail/store/imap/ImapConnection.java
+++ b/k9mail-library/src/main/java/com/fsck/k9/mail/store/imap/ImapConnection.java
@@ -387,7 +387,7 @@
     }
 
     private void handlePermanentXoauth2Failure(NegativeImapResponseException e) throws AuthenticationFailedException {
-        Timber.v(e, "Permanent failure during XOAUTH2", e);
+        Timber.v(e, "Permanent failure during XOAUTH2");
         throw new AuthenticationFailedException(e.getMessage(), e);
     }
 
@@ -397,13 +397,13 @@
         //if a token was invalid before use (e.g. due to expiry). But we don't
         //This is the intended behaviour per AccountManager
 
-        Timber.v(e, "Temporary failure - retrying with new token", e);
+        Timber.v(e, "Temporary failure - retrying with new token");
         try {
             attemptXOAuth2();
         } catch (NegativeImapResponseException e2) {
             //Okay, we failed on a new token.
             //Invalidate the token anyway but assume it's permanent.
-            Timber.v(e, "Authentication exception for new token, permanent error assumed", e);
+            Timber.v(e, "Authentication exception for new token, permanent error assumed");
             oauthTokenProvider.invalidateToken(settings.getUsername());
             handlePermanentXoauth2Failure(e2);
         }
@@ -581,7 +581,7 @@
             }
         } catch (IOException e) {
             close();
-            Timber.e(e, "Error enabling compression", e);
+            Timber.e(e, "Error enabling compression");
         }
     }
 
@@ -632,7 +632,7 @@
         try {
             listResponses = executeSimpleCommand(Commands.LIST + " \"\" \"\"");
         } catch (NegativeImapResponseException e) {
-            Timber.d(e, "Error getting path delimiter using LIST command", e);
+            Timber.d(e, "Error getting path delimiter using LIST command");
             return;
         }
 
