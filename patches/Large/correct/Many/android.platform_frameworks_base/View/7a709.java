diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 463a2f7..784b583 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -9958,7 +9958,7 @@
      * @attr ref android.R.styleable#View_transformPivotX
      */
     public void setPivotX(float pivotX) {
-        if (mRenderNode.isPivotExplicitlySet() || pivotX != getPivotX()) {
+        if (!mRenderNode.isPivotExplicitlySet() || pivotX != getPivotX()) {
             invalidateViewProperty(true, false);
             mRenderNode.setPivotX(pivotX);
             invalidateViewProperty(false, true);
@@ -9999,7 +9999,7 @@
      * @attr ref android.R.styleable#View_transformPivotY
      */
     public void setPivotY(float pivotY) {
-        if (mRenderNode.isPivotExplicitlySet() || pivotY != getPivotY()) {
+        if (!mRenderNode.isPivotExplicitlySet() || pivotY != getPivotY()) {
             invalidateViewProperty(true, false);
             mRenderNode.setPivotY(pivotY);
             invalidateViewProperty(false, true);
