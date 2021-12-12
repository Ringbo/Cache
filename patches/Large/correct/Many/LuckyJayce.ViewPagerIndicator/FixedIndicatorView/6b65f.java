diff --git a/library/src/main/java/com/shizhefei/view/indicator/FixedIndicatorView.java b/library/src/main/java/com/shizhefei/view/indicator/FixedIndicatorView.java
index 9bb3b55..1766bfe 100644
--- a/library/src/main/java/com/shizhefei/view/indicator/FixedIndicatorView.java
+++ b/library/src/main/java/com/shizhefei/view/indicator/FixedIndicatorView.java
@@ -420,7 +420,7 @@
 
             int saveCount2 = canvas.save();
             canvas.translate(offsetX, offsetY);
-            canvas.clipRect(0, 0, tabWidth, tabHeight); // needed
+            canvas.clipRect(0, 0, width, tabHeight); // needed
             //绘制前面一部分
             canvas.drawBitmap(cacheBitmap, 0, 0, null);
             canvas.restoreToCount(saveCount2);
@@ -431,7 +431,7 @@
             canvas.drawBitmap(cacheBitmap, cacheMatrix, null);
         } else {
             canvas.translate(offsetX, offsetY);
-            canvas.clipRect(0, 0, tabWidth, tabHeight); // needed
+            canvas.clipRect(0, 0, width, tabHeight); // needed
             //直接绘制
             scrollBar.getSlideView().draw(canvas);
         }
