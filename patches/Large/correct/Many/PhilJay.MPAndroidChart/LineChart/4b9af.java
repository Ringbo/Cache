diff --git a/MPChartLib/src/com/github/mikephil/charting/charts/LineChart.java b/MPChartLib/src/com/github/mikephil/charting/charts/LineChart.java
index 9afa24a..a5e3689 100644
--- a/MPChartLib/src/com/github/mikephil/charting/charts/LineChart.java
+++ b/MPChartLib/src/com/github/mikephil/charting/charts/LineChart.java
@@ -50,7 +50,7 @@
     public void setFillFormatter(FillFormatter formatter) {
 
         if (formatter == null)
-            formatter = new DefaultFillFormatter();
+            mFillFormatter = new DefaultFillFormatter();
         else
             mFillFormatter = formatter;
     }
