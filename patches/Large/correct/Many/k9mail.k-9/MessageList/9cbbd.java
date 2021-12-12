diff --git a/src/com/fsck/k9/activity/MessageList.java b/src/com/fsck/k9/activity/MessageList.java
index 2d27959..fcbb78b 100644
--- a/src/com/fsck/k9/activity/MessageList.java
+++ b/src/com/fsck/k9/activity/MessageList.java
@@ -345,7 +345,7 @@
                 FragmentManager fragmentManager = getSupportFragmentManager();
                 if (fragmentManager.getBackStackEntryCount() > 0) {
                     fragmentManager.popBackStack();
-                } else if (!mSingleFolderMode) {
+                } else if (!mSingleFolderMode || mMessageListFragment.isManualSearch()) {
                     onBackPressed();
                 } else {
                     onShowFolderList();
