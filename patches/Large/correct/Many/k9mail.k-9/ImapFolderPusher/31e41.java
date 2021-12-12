diff --git a/k9mail-library/src/main/java/com/fsck/k9/mail/store/imap/ImapFolderPusher.java b/k9mail-library/src/main/java/com/fsck/k9/mail/store/imap/ImapFolderPusher.java
index 8ef2ca5..66bafbe 100644
--- a/k9mail-library/src/main/java/com/fsck/k9/mail/store/imap/ImapFolderPusher.java
+++ b/k9mail-library/src/main/java/com/fsck/k9/mail/store/imap/ImapFolderPusher.java
@@ -638,7 +638,7 @@
 
                 pushReceiver.messagesRemoved(ImapFolderPusher.this, messages);
             } catch (Exception e) {
-                Timber.e("Cannot remove EXPUNGEd messages", e);
+                Timber.e("Cannot remove EXPUNGEd messages");
             }
         }
 
