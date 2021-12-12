diff --git a/src/com/fsck/k9/mail/store/ImapStore.java b/src/com/fsck/k9/mail/store/ImapStore.java
index a046205..307d52e 100644
--- a/src/com/fsck/k9/mail/store/ImapStore.java
+++ b/src/com/fsck/k9/mail/store/ImapStore.java
@@ -683,7 +683,8 @@
                     } else if (attribute.equals("\\Sent")) {
                         mAccount.setSentFolderName(decodedFolderName);
                         if (K9.DEBUG) Log.d(K9.LOG_TAG, "Folder auto-configuration detected sent folder: " + decodedFolderName);
-                    } else if (attribute.equals("\\Spam")) {
+                    } else if (attribute.equals("\\Spam") || attribute.equals("\\Junk")) {
+                        //rfc6154 just mentions \Junk
                         mAccount.setSpamFolderName(decodedFolderName);
                         if (K9.DEBUG) Log.d(K9.LOG_TAG, "Folder auto-configuration detected spam folder: " + decodedFolderName);
                     } else if (attribute.equals("\\Trash")) {
