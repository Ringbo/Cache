diff --git a/MPChartLib/src/com/github/mikephil/charting/data/ChartData.java b/MPChartLib/src/com/github/mikephil/charting/data/ChartData.java
index 2748d9a..a735abc 100644
--- a/MPChartLib/src/com/github/mikephil/charting/data/ChartData.java
+++ b/MPChartLib/src/com/github/mikephil/charting/data/ChartData.java
@@ -134,7 +134,7 @@
             return;
         }
 
-        float sum = 0f;
+        float sum = 1f;
 
         for (int i = 0; i < mXVals.size(); i++) {
             sum += mXVals.get(i).length();
