diff --git a/src/com/fsck/k9/fragment/MessageListFragment.java b/src/com/fsck/k9/fragment/MessageListFragment.java
index 2d85633..f0f5058 100644
--- a/src/com/fsck/k9/fragment/MessageListFragment.java
+++ b/src/com/fsck/k9/fragment/MessageListFragment.java
@@ -3108,7 +3108,7 @@
 
         if (!mController.isMoveCapable(mAccount)) {
             // For POP3 accounts only the Inbox is a remote folder.
-            return (mFolderName != null && !mFolderName.equals(mAccount.getInboxFolderName()));
+            return (mFolderName != null && mFolderName.equals(mAccount.getInboxFolderName()));
         }
 
         return true;
