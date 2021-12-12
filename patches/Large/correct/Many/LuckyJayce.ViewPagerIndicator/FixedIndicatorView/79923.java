diff --git a/library/src/main/java/com/shizhefei/view/indicator/FixedIndicatorView.java b/library/src/main/java/com/shizhefei/view/indicator/FixedIndicatorView.java
index 1766bfe..fe0696d 100644
--- a/library/src/main/java/com/shizhefei/view/indicator/FixedIndicatorView.java
+++ b/library/src/main/java/com/shizhefei/view/indicator/FixedIndicatorView.java
@@ -413,7 +413,7 @@
 
             float unDraw = offsetX + tabWidth - indicatorWidth;
             cacheCanvas.save();
-            cacheCanvas.clipRect(0, 0, tabWidth, tabHeight);
+            cacheCanvas.clipRect(0, 0, width, tabHeight);
             cacheCanvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
             scrollBar.getSlideView().draw(cacheCanvas);
             cacheCanvas.restore();
