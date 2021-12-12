diff --git a/hellocharts-library/src/lecho/lib/hellocharts/LineChartRenderer.java b/hellocharts-library/src/lecho/lib/hellocharts/LineChartRenderer.java
index 181c567..5fe3797 100644
--- a/hellocharts-library/src/lecho/lib/hellocharts/LineChartRenderer.java
+++ b/hellocharts-library/src/lecho/lib/hellocharts/LineChartRenderer.java
@@ -267,7 +267,7 @@
 			top = rawValueY + offset;
 			bottom = rawValueY + offset + textBoundsRect.height() + mAnnotationMargin * 2;
 		}
-		if (right < chartCalculator.mContentRect.left) {
+		if (left < chartCalculator.mContentRect.left) {
 			left = rawValueX;
 			right = rawValueX + textBoundsRect.width() + mAnnotationMargin * 2;
 		}
