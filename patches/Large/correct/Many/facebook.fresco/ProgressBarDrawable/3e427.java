diff --git a/drawee/src/main/java/com/facebook/drawee/drawable/ProgressBarDrawable.java b/drawee/src/main/java/com/facebook/drawee/drawable/ProgressBarDrawable.java
index 7f721a1..3a86145 100644
--- a/drawee/src/main/java/com/facebook/drawee/drawable/ProgressBarDrawable.java
+++ b/drawee/src/main/java/com/facebook/drawee/drawable/ProgressBarDrawable.java
@@ -171,7 +171,7 @@
 
   private void drawVerticalBar(Canvas canvas, int level, int color) {
     Rect bounds = getBounds();
-    int length = (bounds.width() - 2 * mPadding) * level / 10000;
+    int length = (bounds.height() - 2 * mPadding) * level / 10000;
     int xpos = bounds.left + mPadding;
     int ypos = bounds.top + mPadding;
     mRect.set(xpos, ypos, xpos + mBarWidth, ypos + length);
