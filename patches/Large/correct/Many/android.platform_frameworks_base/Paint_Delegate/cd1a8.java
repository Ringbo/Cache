diff --git a/tools/layoutlib/bridge/src/android/graphics/Paint_Delegate.java b/tools/layoutlib/bridge/src/android/graphics/Paint_Delegate.java
index e60a61c..1523823 100644
--- a/tools/layoutlib/bridge/src/android/graphics/Paint_Delegate.java
+++ b/tools/layoutlib/bridge/src/android/graphics/Paint_Delegate.java
@@ -1166,7 +1166,7 @@
                 if (mTextScaleX != 1.0 || mTextSkewX != 0) {
                     // TODO: support skew
                     info.mFont = info.mFont.deriveFont(new AffineTransform(
-                            mTextScaleX, mTextSkewX, 0, 0, 1, 0));
+                            mTextScaleX, mTextSkewX, 0, 1, 0, 0));
                 }
                 info.mMetrics = Toolkit.getDefaultToolkit().getFontMetrics(info.mFont);
 
