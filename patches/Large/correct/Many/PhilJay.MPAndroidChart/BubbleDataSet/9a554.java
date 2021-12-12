diff --git a/MPChartLib/src/com/github/mikephil/charting/data/BubbleDataSet.java b/MPChartLib/src/com/github/mikephil/charting/data/BubbleDataSet.java
index df02438..a01b2c1 100644
--- a/MPChartLib/src/com/github/mikephil/charting/data/BubbleDataSet.java
+++ b/MPChartLib/src/com/github/mikephil/charting/data/BubbleDataSet.java
@@ -64,7 +64,7 @@
 
         // need chart width to guess this properly
 
-        for (int i = start; i <= endValue; i++) {
+        for (int i = start; i < endValue; i++) {
 
             final BubbleEntry entry = mYVals.get(i);
 
