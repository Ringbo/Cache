diff --git a/MPChartLib/src/com/github/mikephil/charting/renderer/BarChartRenderer.java b/MPChartLib/src/com/github/mikephil/charting/renderer/BarChartRenderer.java
index 473a721..8179ebd 100644
--- a/MPChartLib/src/com/github/mikephil/charting/renderer/BarChartRenderer.java
+++ b/MPChartLib/src/com/github/mikephil/charting/renderer/BarChartRenderer.java
@@ -86,7 +86,7 @@
 
         mShadowPaint.setColor(dataSet.getBarShadowColor());
         mBarBorderPaint.setColor(dataSet.getBarBorderColor());
-        mBarBorderPaint.setStrokeWidth(Util.convertDpToPixel(dataSet.getBarBorderWidth()));
+        mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(dataSet.getBarBorderWidth()));
 
         final boolean drawBorder = dataSet.getBarBorderWidth() > 0.f;
 
