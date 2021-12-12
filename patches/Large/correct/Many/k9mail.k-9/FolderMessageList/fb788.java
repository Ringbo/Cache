diff --git a/src/com/android/email/activity/FolderMessageList.java b/src/com/android/email/activity/FolderMessageList.java
index 7fec8cc..a4e7fab 100644
--- a/src/com/android/email/activity/FolderMessageList.java
+++ b/src/com/android/email/activity/FolderMessageList.java
@@ -694,7 +694,7 @@
 
       Log.i(Email.LOG_TAG, "onGroupExpand(" + groupPosition + "), mRestoringState = " + mRestoringState);
       super.onGroupExpand(groupPosition);
-      if (mExpandedGroup != -1)
+      if (mExpandedGroup != -1 && mExpandedGroup != groupPosition)
       {
         mListView.collapseGroup(mExpandedGroup);
       }
