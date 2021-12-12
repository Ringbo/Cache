diff --git a/library/src/main/java/com/etsy/android/grid/ExtendableListView.java b/library/src/main/java/com/etsy/android/grid/ExtendableListView.java
index 63b33d4..5aa29d1 100644
--- a/library/src/main/java/com/etsy/android/grid/ExtendableListView.java
+++ b/library/src/main/java/com/etsy/android/grid/ExtendableListView.java
@@ -945,7 +945,7 @@
             mPerformClick = new PerformClick();
         }
         final int motionPosition = mMotionPosition;
-        if (!mDataChanged && motionPosition > 0 && mAdapter.isEnabled(motionPosition)) {
+        if (!mDataChanged && motionPosition >= 0 && mAdapter.isEnabled(motionPosition)) {
             final PerformClick performClick = mPerformClick;
             performClick.mClickMotionPosition = motionPosition;
             performClick.rememberWindowAttachCount();
