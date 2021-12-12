diff --git a/MPChartLib/src/main/java/com/github/mikephil/charting/renderer/XAxisRenderer.java b/MPChartLib/src/main/java/com/github/mikephil/charting/renderer/XAxisRenderer.java
index 1973aa3..2a93910 100644
--- a/MPChartLib/src/main/java/com/github/mikephil/charting/renderer/XAxisRenderer.java
+++ b/MPChartLib/src/main/java/com/github/mikephil/charting/renderer/XAxisRenderer.java
@@ -115,7 +115,7 @@
         MPPointF pointF = MPPointF.getInstance(0,0);
         if (mXAxis.getPosition() == XAxisPosition.TOP) {
             pointF.x = 0.5f;
-            pointF.y = 0.9f;
+            pointF.y = 1.0f;
             drawLabels(c, mViewPortHandler.contentTop() - yoffset, pointF);
 
         } else if (mXAxis.getPosition() == XAxisPosition.TOP_INSIDE) {
