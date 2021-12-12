diff --git a/MPChartLib/src/com/github/mikephil/charting/renderer/LineChartRenderer.java b/MPChartLib/src/com/github/mikephil/charting/renderer/LineChartRenderer.java
index edc75e5..56ed94c 100644
--- a/MPChartLib/src/com/github/mikephil/charting/renderer/LineChartRenderer.java
+++ b/MPChartLib/src/com/github/mikephil/charting/renderer/LineChartRenderer.java
@@ -73,7 +73,9 @@
     @Override
     public void drawData(Canvas c) {
 
-        if (mPathBitmap == null) {
+        if (mPathBitmap == null
+				|| mPathBitmap.getWidth() != mViewPortHandler.getChartWidth()
+				|| mPathBitmap.getHeight() != mViewPortHandler.getChartHeight()) {
             mPathBitmap = Bitmap.createBitmap((int) mViewPortHandler.getChartWidth(),
                     (int) mViewPortHandler.getChartHeight(), Bitmap.Config.ARGB_4444);
             mBitmapCanvas = new Canvas(mPathBitmap);
