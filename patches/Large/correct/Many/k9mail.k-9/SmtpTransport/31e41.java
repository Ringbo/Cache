diff --git a/k9mail-library/src/main/java/com/fsck/k9/mail/transport/smtp/SmtpTransport.java b/k9mail-library/src/main/java/com/fsck/k9/mail/transport/smtp/SmtpTransport.java
index 9fff90e..3a2e548 100644
--- a/k9mail-library/src/main/java/com/fsck/k9/mail/transport/smtp/SmtpTransport.java
+++ b/k9mail-library/src/main/java/com/fsck/k9/mail/transport/smtp/SmtpTransport.java
@@ -859,7 +859,7 @@
         //if a token was invalid before use (e.g. due to expiry). But we don't
         //This is the intended behaviour per AccountManager
 
-        Timber.v("Authentication exception, re-trying with new token", negativeResponseFromOldToken);
+        Timber.v(negativeResponseFromOldToken, "Authentication exception, re-trying with new token");
         try {
             attemptXoauth2(username);
         } catch (NegativeSmtpReplyException negativeResponseFromNewToken) {
@@ -869,8 +869,7 @@
 
             //Okay, we failed on a new token.
             //Invalidate the token anyway but assume it's permanent.
-            Timber.v("Authentication exception for new token, permanent error assumed",
-                    negativeResponseFromNewToken);
+            Timber.v(negativeResponseFromNewToken, "Authentication exception for new token, permanent error assumed");
 
             oauthTokenProvider.invalidateToken(username);
 
