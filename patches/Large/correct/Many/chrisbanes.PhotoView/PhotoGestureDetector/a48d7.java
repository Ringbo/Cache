diff --git a/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoGestureDetector.java b/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoGestureDetector.java
index 9a84406..2110aae 100644
--- a/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoGestureDetector.java
+++ b/photoview/src/main/java/com/github/chrisbanes/photoview/PhotoGestureDetector.java
@@ -21,7 +21,7 @@
     private int mActivePointerId = INVALID_POINTER_ID;
     private int mActivePointerIndex = 0;
 
-    public PhotoGestureDetector(Context context, OnGestureListener onGestureListener) {
+    PhotoGestureDetector(Context context, OnGestureListener onGestureListener) {
         mListener = onGestureListener;
         final ViewConfiguration configuration = ViewConfiguration
                 .get(context);
@@ -56,15 +56,15 @@
         mDetector = new ScaleGestureDetector(context, mScaleListener);
     }
 
-    public boolean isScaling() {
+    boolean isScaling() {
         return mDetector.isInProgress();
     }
 
-    public boolean isDragging() {
+    boolean isDragging() {
         return mDetector.isInProgress();
     }
 
-    public boolean onTouchEvent(MotionEvent ev) {
+    boolean onTouchEvent(MotionEvent ev) {
         try {
             mDetector.onTouchEvent(ev);
             return processTouchEvent(ev);
