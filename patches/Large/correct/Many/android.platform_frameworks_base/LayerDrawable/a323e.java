diff --git a/graphics/java/android/graphics/drawable/LayerDrawable.java b/graphics/java/android/graphics/drawable/LayerDrawable.java
index a2f71e5..78eee37 100644
--- a/graphics/java/android/graphics/drawable/LayerDrawable.java
+++ b/graphics/java/android/graphics/drawable/LayerDrawable.java
@@ -211,7 +211,11 @@
             updateLayerFromTypedArray(layer, a);
             a.recycle();
 
-            if (layer.mDrawable == null) {
+            // If the layer doesn't have a drawable or unresolved theme
+            // attribute for a drawable, attempt to parse one from the child
+            // element.
+            if (layer.mDrawable == null && (layer.mThemeAttrs == null ||
+                    layer.mThemeAttrs[R.styleable.LayerDrawableItem_drawable] == 0)) {
                 while ((type = parser.next()) == XmlPullParser.TEXT) {
                 }
                 if (type != XmlPullParser.START_TAG) {
