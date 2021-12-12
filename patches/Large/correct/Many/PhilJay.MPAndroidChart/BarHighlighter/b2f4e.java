diff --git a/MPChartLib/src/com/github/mikephil/charting/highlight/BarHighlighter.java b/MPChartLib/src/com/github/mikephil/charting/highlight/BarHighlighter.java
index a85f488..7d001df 100644
--- a/MPChartLib/src/com/github/mikephil/charting/highlight/BarHighlighter.java
+++ b/MPChartLib/src/com/github/mikephil/charting/highlight/BarHighlighter.java
@@ -119,7 +119,7 @@
 	 */
 	protected int getClosestStackIndex(Range[] ranges, float value) {
 
-		if (ranges == null)
+		if (ranges == null || ranges.length == 0)
 			return 0;
 
 		int stackIndex = 0;
@@ -188,7 +188,7 @@
 
 		float[] values = entry.getVals();
 
-		if (values == null)
+		if (values == null || values.length == 0)
 			return null;
 
 		float negRemain = -entry.getNegativeSum();
