diff --git a/MPChartLib/src/com/github/mikephil/charting/renderer/LineChartRenderer.java b/MPChartLib/src/com/github/mikephil/charting/renderer/LineChartRenderer.java
index 147229c..725fea5 100644
--- a/MPChartLib/src/com/github/mikephil/charting/renderer/LineChartRenderer.java
+++ b/MPChartLib/src/com/github/mikephil/charting/renderer/LineChartRenderer.java
@@ -485,7 +485,8 @@
 
             LineDataSet dataSet = dataSets.get(i);
 
-            if (!dataSet.isVisible() || !dataSet.isDrawCirclesEnabled())
+            if (!dataSet.isVisible() || !dataSet.isDrawCirclesEnabled() ||
+                    dataSet.getEntryCount() == 0)
                 continue;
 
             mCirclePaintInner.setColor(dataSet.getCircleHoleColor());
