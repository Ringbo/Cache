diff --git a/MPChartLib/src/main/java/com/github/mikephil/charting/renderer/PieChartRenderer.java b/MPChartLib/src/main/java/com/github/mikephil/charting/renderer/PieChartRenderer.java
index ff22018..84fda6e 100644
--- a/MPChartLib/src/main/java/com/github/mikephil/charting/renderer/PieChartRenderer.java
+++ b/MPChartLib/src/main/java/com/github/mikephil/charting/renderer/PieChartRenderer.java
@@ -269,7 +269,7 @@
                     float arcStartPointX = center.x + radius * (float) Math.cos(startAngleOuter * Utils.FDEG2RAD);
                     float arcStartPointY = center.y + radius * (float) Math.sin(startAngleOuter * Utils.FDEG2RAD);
 
-                    if (sweepAngleOuter % 360f <= Utils.FLOAT_EPSILON) {
+                    if (sweepAngleOuter >= 360.f && sweepAngleOuter % 360f <= Utils.FLOAT_EPSILON) {
                         // Android is doing "mod 360"
                         mPathBuffer.addCircle(center.x, center.y, radius, Path.Direction.CW);
                     } else {
@@ -318,7 +318,7 @@
                         }
                         final float endAngleInner = startAngleInner + sweepAngleInner;
 
-                        if (sweepAngleOuter % 360f == 0.f) {
+                        if (sweepAngleOuter >= 360.f && sweepAngleOuter % 360f <= Utils.FLOAT_EPSILON) {
                             // Android is doing "mod 360"
                             mPathBuffer.addCircle(center.x, center.y, innerRadius, Path.Direction.CCW);
                         } else {
@@ -335,7 +335,7 @@
                         }
                     } else {
 
-                        if (sweepAngleOuter % 360f != 0.f) {
+                        if (sweepAngleOuter % 360f > Utils.FLOAT_EPSILON) {
                             if (accountForSliceSpacing) {
 
                                 float angleMiddle = startAngleOuter + sweepAngleOuter / 2.f;
@@ -818,7 +818,7 @@
 
             mPathBuffer.reset();
 
-            if (sweepAngleOuter % 360f == 0.f) {
+            if (sweepAngleOuter >= 360.f && sweepAngleOuter % 360f <= Utils.FLOAT_EPSILON) {
                 // Android is doing "mod 360"
                 mPathBuffer.addCircle(center.x, center.y, highlightedRadius, Path.Direction.CW);
             } else {
@@ -875,7 +875,7 @@
                 }
                 final float endAngleInner = startAngleInner + sweepAngleInner;
 
-                if (sweepAngleOuter % 360f == 0.f) {
+                if (sweepAngleOuter >= 360.f && sweepAngleOuter % 360f <= Utils.FLOAT_EPSILON) {
                     // Android is doing "mod 360"
                     mPathBuffer.addCircle(center.x, center.y, innerRadius, Path.Direction.CCW);
                 } else {
@@ -892,7 +892,7 @@
                 }
             } else {
 
-                if (sweepAngleOuter % 360f != 0.f) {
+                if (sweepAngleOuter % 360f > Utils.FLOAT_EPSILON) {
 
                     if (accountForSliceSpacing) {
                         final float angleMiddle = startAngleOuter + sweepAngleOuter / 2.f;
