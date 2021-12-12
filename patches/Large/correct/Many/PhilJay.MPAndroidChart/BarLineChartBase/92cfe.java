diff --git a/MPChartLib/src/main/java/com/github/mikephil/charting/charts/BarLineChartBase.java b/MPChartLib/src/main/java/com/github/mikephil/charting/charts/BarLineChartBase.java
index fd8d078..bac69f2 100644
--- a/MPChartLib/src/main/java/com/github/mikephil/charting/charts/BarLineChartBase.java
+++ b/MPChartLib/src/main/java/com/github/mikephil/charting/charts/BarLineChartBase.java
@@ -1312,7 +1312,7 @@
     public float getLowestVisibleX() {
         PointD pos = getTransformer(AxisDependency.LEFT).getValuesByTouchPoint(mViewPortHandler.contentLeft(),
                 mViewPortHandler.contentBottom());
-        return (float) Math.min(mXAxis.mAxisMinimum, pos.x);
+        return (float) Math.max(mXAxis.mAxisMinimum, pos.x);
     }
 
     /**
