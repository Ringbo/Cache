diff --git a/core/java/android/widget/EdgeEffect.java b/core/java/android/widget/EdgeEffect.java
index 90fec23..3758d86 100644
--- a/core/java/android/widget/EdgeEffect.java
+++ b/core/java/android/widget/EdgeEffect.java
@@ -330,7 +330,7 @@
 
         canvas.clipRect(mBounds);
         canvas.translate(translateX, 0);
-        canvas.drawArc(mArcRect, 45, 90, true, mPaint);
+        canvas.drawArc(mArcRect, 45, 90, false, mPaint);
         canvas.restoreToCount(count);
 
         boolean oneLastFrame = false;
