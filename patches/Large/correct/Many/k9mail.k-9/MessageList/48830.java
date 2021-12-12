diff --git a/src/com/fsck/k9/activity/MessageList.java b/src/com/fsck/k9/activity/MessageList.java
index 99d6341..e91dd5d 100644
--- a/src/com/fsck/k9/activity/MessageList.java
+++ b/src/com/fsck/k9/activity/MessageList.java
@@ -1416,7 +1416,7 @@
                 {
                     MessageInfoHolder msgInfoHolder = (MessageInfoHolder) mAdapter.getItem(position);
 
-                    if (msgInfoHolder != null)
+                    if (msgInfoHolder != null && msgInfoHolder.selected != selected)
                     {
                         msgInfoHolder.selected = selected;
                         mSelectedCount += (selected ? 1 : -1);
