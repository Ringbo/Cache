diff --git a/ReactAndroid/src/main/java/com/facebook/react/flat/DrawBorder.java b/ReactAndroid/src/main/java/com/facebook/react/flat/DrawBorder.java
index a2d0bd1..73eec05 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/flat/DrawBorder.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/flat/DrawBorder.java
@@ -172,7 +172,7 @@
 
   @Override
   protected void onDraw(Canvas canvas) {
-    if (getBorderRadius() >= 0.5f) {
+    if (getBorderRadius() >= 0.5f || getPathEffectForBorderStyle() != null) {
       drawRoundedBorders(canvas);
     } else {
       drawRectangularBorders(canvas);
