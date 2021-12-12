diff --git a/src/main/java/com/owncloud/android/ui/fragment/ExtendedListFragment.java b/src/main/java/com/owncloud/android/ui/fragment/ExtendedListFragment.java
index 50efa6c..26ec97c 100644
--- a/src/main/java/com/owncloud/android/ui/fragment/ExtendedListFragment.java
+++ b/src/main/java/com/owncloud/android/ui/fragment/ExtendedListFragment.java
@@ -955,7 +955,7 @@
             maxColumnSize = maxColumnSizePortrait;
         }
 
-        if (mGridView.getNumColumns() > maxColumnSize) {
+        if (mGridView != null && mGridView.getNumColumns() > maxColumnSize) {
             mGridView.setNumColumns(maxColumnSize);
             mGridView.invalidateViews();
         }
