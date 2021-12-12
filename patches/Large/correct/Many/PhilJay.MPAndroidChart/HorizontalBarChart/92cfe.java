diff --git a/MPChartLib/src/main/java/com/github/mikephil/charting/charts/HorizontalBarChart.java b/MPChartLib/src/main/java/com/github/mikephil/charting/charts/HorizontalBarChart.java
index d8fd26d..d917b85 100644
--- a/MPChartLib/src/main/java/com/github/mikephil/charting/charts/HorizontalBarChart.java
+++ b/MPChartLib/src/main/java/com/github/mikephil/charting/charts/HorizontalBarChart.java
@@ -205,7 +205,7 @@
     public float getLowestVisibleX() {
         PointD pos = getTransformer(AxisDependency.LEFT).getValuesByTouchPoint(mViewPortHandler.contentLeft(),
 				mViewPortHandler.contentBottom());
-        return (float) Math.min(mXAxis.mAxisMinimum, pos.y);
+        return (float) Math.max(mXAxis.mAxisMinimum, pos.y);
     }
 
     @Override
