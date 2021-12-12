diff --git a/graphics/java/android/graphics/drawable/DrawableContainer.java b/graphics/java/android/graphics/drawable/DrawableContainer.java
index b03fe3a..4a06805 100644
--- a/graphics/java/android/graphics/drawable/DrawableContainer.java
+++ b/graphics/java/android/graphics/drawable/DrawableContainer.java
@@ -295,9 +295,9 @@
     @Override
     public void setHotspotBounds(int left, int top, int right, int bottom) {
         if (mHotspotBounds == null) {
-            mHotspotBounds = new Rect(left, top, bottom, right);
+            mHotspotBounds = new Rect(left, top, right, bottom);
         } else {
-            mHotspotBounds.set(left, top, bottom, right);
+            mHotspotBounds.set(left, top, right, bottom);
         }
 
         if (mCurrDrawable != null) {
