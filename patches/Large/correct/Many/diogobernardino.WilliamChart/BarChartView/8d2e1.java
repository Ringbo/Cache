diff --git a/williamchart/src/main/java/com/db/chart/view/BarChartView.java b/williamchart/src/main/java/com/db/chart/view/BarChartView.java
index 2a6a3dd..d21fc4c 100644
--- a/williamchart/src/main/java/com/db/chart/view/BarChartView.java
+++ b/williamchart/src/main/java/com/db/chart/view/BarChartView.java
@@ -82,7 +82,7 @@
 				bar = (Bar) barSet.getEntry(i);
 
 				// If entry value is 0 it won't be drawn
-				if (!barSet.isVisible() || bar.getValue() == 0) continue;
+				if (!barSet.isVisible()) continue;
 
 				// Style it!
 				if (!bar.hasGradientColor()) style.barPaint.setColor(bar.getColor());
@@ -100,7 +100,7 @@
 				}
 
 				// Draw bar
-				if (bar.getValue() > 0) // Positive
+				if (bar.getValue() >= 0) // Positive
 					drawBar(canvas, offset, bar.getY(), offset + barWidth, this.getZeroPosition());
 				else // Negative
 					drawBar(canvas, offset, this.getZeroPosition(), offset + barWidth, bar.getY());
