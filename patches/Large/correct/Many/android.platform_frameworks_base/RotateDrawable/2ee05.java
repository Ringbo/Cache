diff --git a/graphics/java/android/graphics/drawable/RotateDrawable.java b/graphics/java/android/graphics/drawable/RotateDrawable.java
index 1ee44fb..e1991fe 100644
--- a/graphics/java/android/graphics/drawable/RotateDrawable.java
+++ b/graphics/java/android/graphics/drawable/RotateDrawable.java
@@ -216,7 +216,7 @@
      * @attr ref android.R.styleable#RotateDrawable_pivotX
      */
     public void setPivotX(float pivotX) {
-        if (mState.mPivotX == pivotX) {
+        if (mState.mPivotX != pivotX) {
             mState.mPivotX = pivotX;
             invalidateSelf();
         }
@@ -242,7 +242,7 @@
      * @see #isPivotXRelative()
      */
     public void setPivotXRelative(boolean relative) {
-        if (mState.mPivotXRel == relative) {
+        if (mState.mPivotXRel != relative) {
             mState.mPivotXRel = relative;
             invalidateSelf();
         }
@@ -270,7 +270,7 @@
      * @attr ref android.R.styleable#RotateDrawable_pivotY
      */
     public void setPivotY(float pivotY) {
-        if (mState.mPivotY == pivotY) {
+        if (mState.mPivotY != pivotY) {
             mState.mPivotY = pivotY;
             invalidateSelf();
         }
@@ -296,7 +296,7 @@
      * @see #isPivotYRelative()
      */
     public void setPivotYRelative(boolean relative) {
-        if (mState.mPivotYRel == relative) {
+        if (mState.mPivotYRel != relative) {
             mState.mPivotYRel = relative;
             invalidateSelf();
         }
