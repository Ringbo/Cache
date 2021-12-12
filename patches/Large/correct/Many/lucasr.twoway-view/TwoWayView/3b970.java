diff --git a/library/src/main/java/org/lucasr/twowayview/TwoWayView.java b/library/src/main/java/org/lucasr/twowayview/TwoWayView.java
index e71b28d..89a6f7e 100644
--- a/library/src/main/java/org/lucasr/twowayview/TwoWayView.java
+++ b/library/src/main/java/org/lucasr/twowayview/TwoWayView.java
@@ -1275,7 +1275,7 @@
 
     @Override
     public boolean onInterceptTouchEvent(MotionEvent ev) {
-        if (!mIsAttached) {
+        if (!mIsAttached || mAdapter == null) {
             return false;
         }
 
@@ -1361,7 +1361,7 @@
             return isClickable() || isLongClickable();
         }
 
-        if (!mIsAttached) {
+        if (!mIsAttached || mAdapter == null) {
             return false;
         }
 
