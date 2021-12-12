diff --git a/src/org/wordpress/android/ui/media/MediaEditFragment.java b/src/org/wordpress/android/ui/media/MediaEditFragment.java
index 42ca09c..beb75bb 100644
--- a/src/org/wordpress/android/ui/media/MediaEditFragment.java
+++ b/src/org/wordpress/android/ui/media/MediaEditFragment.java
@@ -253,11 +253,11 @@
 
     private void refreshViews(Cursor cursor) {
         if (cursor == null || !cursor.moveToFirst() || cursor.getCount() == 0) {
-            mScrollView.setVisibility(View.GONE);
+            mLinearLayout.setVisibility(View.GONE);
             return;
         }
         
-        mScrollView.setVisibility(View.VISIBLE);
+        mLinearLayout.setVisibility(View.VISIBLE);
         
         mScrollView.scrollTo(0, 0);
         
