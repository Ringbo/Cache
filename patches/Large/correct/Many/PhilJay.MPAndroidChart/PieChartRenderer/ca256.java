diff --git a/MPChartLib/src/com/github/mikephil/charting/renderer/PieChartRenderer.java b/MPChartLib/src/com/github/mikephil/charting/renderer/PieChartRenderer.java
index 82d70dc..87ded29 100644
--- a/MPChartLib/src/com/github/mikephil/charting/renderer/PieChartRenderer.java
+++ b/MPChartLib/src/com/github/mikephil/charting/renderer/PieChartRenderer.java
@@ -77,7 +77,9 @@
     @Override
     public void drawData(Canvas c) {
 
-        if (mDrawBitmap == null) {
+        if (mDrawBitmap == null
+				|| mDrawBitmap.getWidth() != mViewPortHandler.getChartWidth()
+				|| mDrawBitmap.getHeight() != mViewPortHandler.getChartHeight()) {
             mDrawBitmap = Bitmap.createBitmap((int) mViewPortHandler.getChartWidth(),
                     (int) mViewPortHandler.getChartHeight(), Bitmap.Config.ARGB_4444);
             mBitmapCanvas = new Canvas(mDrawBitmap);
