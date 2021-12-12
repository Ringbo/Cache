diff --git a/graphics/java/android/graphics/drawable/BitmapDrawable.java b/graphics/java/android/graphics/drawable/BitmapDrawable.java
index 68ffed6..dc10a81 100644
--- a/graphics/java/android/graphics/drawable/BitmapDrawable.java
+++ b/graphics/java/android/graphics/drawable/BitmapDrawable.java
@@ -721,7 +721,7 @@
 
         final TypedArray a = obtainAttributes(r, theme, attrs, R.styleable.BitmapDrawable);
         updateStateFromTypedArray(a);
-        verifyState(a);
+        verifyRequiredAttributes(a);
         a.recycle();
 
         // Update local properties.
@@ -733,11 +733,13 @@
      *
      * @throws XmlPullParserException if any required attributes are missing
      */
-    private void verifyState(TypedArray a) throws XmlPullParserException {
+    private void verifyRequiredAttributes(TypedArray a) throws XmlPullParserException {
+        // If we're not waiting on a theme, verify required attributes.
         final BitmapState state = mBitmapState;
-        if (state.mBitmap == null) {
+        if (state.mBitmap == null && (state.mThemeAttrs == null
+                || state.mThemeAttrs[R.styleable.BitmapDrawable_src] == 0)) {
             throw new XmlPullParserException(a.getPositionDescription() +
-                    ": <bitmap> requires a valid src attribute");
+                    ": <bitmap> requires a valid 'src' attribute");
         }
     }
 
@@ -759,7 +761,7 @@
             final Bitmap bitmap = BitmapFactory.decodeResource(r, srcResId);
             if (bitmap == null) {
                 throw new XmlPullParserException(a.getPositionDescription() +
-                        ": <bitmap> requires a valid src attribute");
+                        ": <bitmap> requires a valid 'src' attribute");
             }
 
             state.mBitmap = bitmap;
