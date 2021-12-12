diff --git a/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java b/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
index 5745b32..f79aa06 100644
--- a/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
+++ b/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
@@ -577,7 +577,7 @@
      * @param highlight contains information about which entry should be highlighted
      */
     public void highlightValue(Highlight highlight) {
-        highlightValue(highlight);
+        highlightValue(highlight, false);
     }
 
     /**
