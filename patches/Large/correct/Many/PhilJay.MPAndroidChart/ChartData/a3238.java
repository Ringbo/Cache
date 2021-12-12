diff --git a/MPChartLib/src/com/github/mikephil/charting/data/ChartData.java b/MPChartLib/src/com/github/mikephil/charting/data/ChartData.java
index d9ef299..71663eb 100644
--- a/MPChartLib/src/com/github/mikephil/charting/data/ChartData.java
+++ b/MPChartLib/src/com/github/mikephil/charting/data/ChartData.java
@@ -174,7 +174,7 @@
         if (mDataSets == null)
             return;
 
-        if (this instanceof ScatterData)
+        if (this instanceof ScatterData || this instanceof CombinedData)
             return;
 
         for (int i = 0; i < mDataSets.size(); i++) {
