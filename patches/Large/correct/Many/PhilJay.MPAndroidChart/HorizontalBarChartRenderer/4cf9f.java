diff --git a/MPChartLib/src/com/github/mikephil/charting/renderer/HorizontalBarChartRenderer.java b/MPChartLib/src/com/github/mikephil/charting/renderer/HorizontalBarChartRenderer.java
index 46ab01b..cadc706 100644
--- a/MPChartLib/src/com/github/mikephil/charting/renderer/HorizontalBarChartRenderer.java
+++ b/MPChartLib/src/com/github/mikephil/charting/renderer/HorizontalBarChartRenderer.java
@@ -53,7 +53,7 @@
 
         mShadowPaint.setColor(dataSet.getBarShadowColor());
         mBarBorderPaint.setColor(dataSet.getBarBorderColor());
-        mBarBorderPaint.setStrokeWidth(Util.convertDpToPixel(dataSet.getBarBorderWidth()));
+        mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(dataSet.getBarBorderWidth()));
 
         final boolean drawBorder = dataSet.getBarBorderWidth() > 0.f;
 
