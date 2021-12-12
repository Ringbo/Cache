diff --git a/williamchart/src/main/java/com/db/chart/view/HorizontalBarChartView.java b/williamchart/src/main/java/com/db/chart/view/HorizontalBarChartView.java
index 1102b66..ad2c0a1 100644
--- a/williamchart/src/main/java/com/db/chart/view/HorizontalBarChartView.java
+++ b/williamchart/src/main/java/com/db/chart/view/HorizontalBarChartView.java
@@ -83,7 +83,7 @@
 				bar = (Bar) barSet.getEntry(i);
 
 				// If entry value is 0 it won't be drawn
-				if (!barSet.isVisible() || bar.getValue() == 0) continue;
+				if (!barSet.isVisible()) continue;
 
 				// Style it!
 				if (!bar.hasGradientColor()) style.barPaint.setColor(bar.getColor());
@@ -100,7 +100,7 @@
 
 
 				// Draw bar
-				if (bar.getValue() > 0) // Positive
+				if (bar.getValue() >= 0) // Positive
 					drawBar(canvas, this.getZeroPosition(), offset, bar.getX(), offset + barWidth);
 				else // Negative
 					drawBar(canvas, bar.getX(), offset, this.getZeroPosition(), offset + barWidth);
