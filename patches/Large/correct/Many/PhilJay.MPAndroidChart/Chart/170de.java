diff --git a/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java b/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
index 0e1ab2d..3040bd2 100644
--- a/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
+++ b/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
@@ -269,7 +269,7 @@
 	 */
 	protected void calcMinMax(boolean fixedValues) {
 		// only calculate values if not fixed values
-		if (fixedValues) {
+		if (!fixedValues) {
 			mYChartMin = mData.getYMin();
 			mYChartMax = mYChartMin + mData.getYMax();
 		}
