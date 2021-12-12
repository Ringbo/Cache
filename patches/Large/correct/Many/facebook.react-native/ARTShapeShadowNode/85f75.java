diff --git a/ReactAndroid/src/main/java/com/facebook/react/views/art/ARTShapeShadowNode.java b/ReactAndroid/src/main/java/com/facebook/react/views/art/ARTShapeShadowNode.java
index b66066b..ce8b5e1 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/views/art/ARTShapeShadowNode.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/views/art/ARTShapeShadowNode.java
@@ -101,10 +101,10 @@
         throw new JSApplicationIllegalArgumentException(
             "Shapes should have a valid path (d) prop");
       }
-      if (setupStrokePaint(paint, opacity)) {
+      if (setupFillPaint(paint, opacity)) {
         canvas.drawPath(mPath, paint);
       }
-      if (setupFillPaint(paint, opacity)) {
+      if (setupStrokePaint(paint, opacity)) {
         canvas.drawPath(mPath, paint);
       }
       restoreCanvas(canvas);
