diff --git a/src/android/support/design/widget/CollapsingTextHelper.java b/src/android/support/design/widget/CollapsingTextHelper.java
index 152385b..9a38c7d 100644
--- a/src/android/support/design/widget/CollapsingTextHelper.java
+++ b/src/android/support/design/widget/CollapsingTextHelper.java
@@ -560,7 +560,7 @@
         final int w = Math.round(mTextPaint.measureText(mTextToDraw, 0, mTextToDraw.length()));
         final int h = Math.round(mTextureDescent - mTextureAscent);
 
-        if (w <= 0 && h <= 0) {
+        if (w <= 0 || h <= 0) {
             return; // If the width or height are 0, return
         }
 
