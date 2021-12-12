diff --git a/src/com/fsck/k9/controller/MessagingController.java b/src/com/fsck/k9/controller/MessagingController.java
index 154301a..6ee0db4 100644
--- a/src/com/fsck/k9/controller/MessagingController.java
+++ b/src/com/fsck/k9/controller/MessagingController.java
@@ -2803,10 +2803,10 @@
         try {
             if (threadedList) {
                 localStore.setFlagForThreads(ids, flag, newState);
-                removeFlagFromCache(account, ids, flag);
+                removeFlagForThreadsFromCache(account, ids, flag);
             } else {
                 localStore.setFlag(ids, flag, newState);
-                removeFlagForThreadsFromCache(account, ids, flag);
+                removeFlagFromCache(account, ids, flag);
             }
         } catch (MessagingException e) {
             Log.e(K9.LOG_TAG, "Couldn't set flags in local database", e);
