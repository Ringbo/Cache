diff --git a/hellocharts-library/src/lecho/lib/hellocharts/view/AbstractChartView.java b/hellocharts-library/src/lecho/lib/hellocharts/view/AbstractChartView.java
index ac7239e..38de1ad 100644
--- a/hellocharts-library/src/lecho/lib/hellocharts/view/AbstractChartView.java
+++ b/hellocharts-library/src/lecho/lib/hellocharts/view/AbstractChartView.java
@@ -262,7 +262,7 @@
             left = Math.max(maxViewport.left, Math.min(left, maxViewport.right - width));
             top = Math.max(maxViewport.bottom + height, Math.min(top, maxViewport.top));
 
-            scrollViewport.set(left, top, left + height, top - height);
+            scrollViewport.set(left, top, left + width, top - height);
         }
 
         return scrollViewport;
