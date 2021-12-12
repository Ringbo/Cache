diff --git a/k9mail/src/main/java/com/fsck/k9/view/MessageCryptoDisplayStatus.java b/k9mail/src/main/java/com/fsck/k9/view/MessageCryptoDisplayStatus.java
index 4d0527f..6914118 100644
--- a/k9mail/src/main/java/com/fsck/k9/view/MessageCryptoDisplayStatus.java
+++ b/k9mail/src/main/java/com/fsck/k9/view/MessageCryptoDisplayStatus.java
@@ -261,13 +261,13 @@
             case OpenPgpSignatureResult.RESULT_VALID_KEY_CONFIRMED:
             case OpenPgpSignatureResult.RESULT_VALID_KEY_UNCONFIRMED:
                 switch (signatureResult.getSenderStatusResult()) {
-                    case UNKNOWN:
+                    case USER_ID_CONFIRMED:
                         return ENCRYPTED_SIGN_VERIFIED;
                     case USER_ID_UNCONFIRMED:
                         return ENCRYPTED_SIGN_UNVERIFIED;
                     case USER_ID_MISSING:
                         return ENCRYPTED_SIGN_MISMATCH;
-                    case USER_ID_CONFIRMED:
+                    case UNKNOWN:
                         return ENCRYPTED_SIGN_UNVERIFIED;
                 }
                 throw new IllegalStateException("unhandled encrypted result case!");
