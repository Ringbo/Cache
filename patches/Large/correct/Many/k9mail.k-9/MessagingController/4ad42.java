diff --git a/src/com/android/email/MessagingController.java b/src/com/android/email/MessagingController.java
index 97c0fb0..e5300c7 100644
--- a/src/com/android/email/MessagingController.java
+++ b/src/com/android/email/MessagingController.java
@@ -875,7 +875,7 @@
               for (Message remoteMessage : remoteMessages) {
                 boolean messageChanged = false;
                   Message localMessage = localFolder.getMessage(remoteMessage.getUid());
-                  if (localMessage == null) {
+                  if (localMessage == null || localMessage.isSet(Flag.DELETED)) {
                       continue;
                   }
                   for (Flag flag : new Flag[] { Flag.SEEN, Flag.FLAGGED, Flag.ANSWERED } )
@@ -914,7 +914,9 @@
              * Remove any messages that are in the local store but no longer on the remote store.
              */
             for (Message localMessage : localMessages) {
-                if (remoteUidMap.get(localMessage.getUid()) == null) {
+                if (remoteUidMap.get(localMessage.getUid()) == null &&
+                    !localMessage.isSet(Flag.DELETED))
+                {
                     localMessage.setFlag(Flag.X_DESTROYED, true);
                     for (MessagingListener l : getListeners()) {
                         l.synchronizeMailboxRemovedMessage(account, folder, localMessage);
