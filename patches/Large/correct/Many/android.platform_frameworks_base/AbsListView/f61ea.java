diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index 4aae05e..48e7f79 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -2856,13 +2856,13 @@
 
         final int firstPosition = mFirstPosition;
 
-        if (firstPosition == 0 && firstTop >= listPadding.top && deltaY > 0) {
+        if (firstPosition == 0 && firstTop >= listPadding.top && deltaY >= 0) {
             // Don't need to move views down if the top of the first position
             // is already visible
             return true;
         }
 
-        if (firstPosition + childCount == mItemCount && lastBottom <= end && deltaY < 0) {
+        if (firstPosition + childCount == mItemCount && lastBottom <= end && deltaY <= 0) {
             // Don't need to move views up if the bottom of the last position
             // is already visible
             return true;
