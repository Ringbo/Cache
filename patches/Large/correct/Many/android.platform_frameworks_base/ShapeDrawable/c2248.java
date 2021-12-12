diff --git a/graphics/java/android/graphics/drawable/ShapeDrawable.java b/graphics/java/android/graphics/drawable/ShapeDrawable.java
index 817c74f..a680550 100644
--- a/graphics/java/android/graphics/drawable/ShapeDrawable.java
+++ b/graphics/java/android/graphics/drawable/ShapeDrawable.java
@@ -82,7 +82,7 @@
     private ShapeDrawable(ShapeState state) {
         mShapeState = new ShapeState(state);
 
-        if (state.mTint != null) {
+        if (state != null && state.mTint != null) {
             final int color = state.mTint.getColorForState(getState(), 0);
             mTintFilter = new PorterDuffColorFilter(color, state.mTintMode);
         }
