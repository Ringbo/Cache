diff --git a/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java b/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
index a1088b1..3c87cdb 100644
--- a/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
+++ b/MPChartLib/src/com/github/mikephil/charting/charts/Chart.java
@@ -247,7 +247,7 @@
      */
     public void setData(T data) {
 
-        if (data == null || data.getYValCount() <= 0) {
+        if (data == null) {
             Log.e(LOG_TAG,
                     "Cannot set data for chart. Provided data object is null.");
             return;
@@ -365,7 +365,7 @@
     protected void onDraw(Canvas canvas) {
         // super.onDraw(canvas);
 
-        if (mDataNotSet) { // check if there is data
+        if (mDataNotSet || mData == null || mData.getYValCount() <= 0) { // check if there is data
 
             // if no data, inform the user
             canvas.drawText(mNoDataText, getWidth() / 2, getHeight() / 2, mInfoPaint);
