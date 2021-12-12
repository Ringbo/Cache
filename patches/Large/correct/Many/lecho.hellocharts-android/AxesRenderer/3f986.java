diff --git a/hellocharts-library/src/lecho/lib/hellocharts/renderer/AxesRenderer.java b/hellocharts-library/src/lecho/lib/hellocharts/renderer/AxesRenderer.java
index be37913..bc78ee2 100644
--- a/hellocharts-library/src/lecho/lib/hellocharts/renderer/AxesRenderer.java
+++ b/hellocharts-library/src/lecho/lib/hellocharts/renderer/AxesRenderer.java
@@ -277,7 +277,7 @@
     private void initAxisMeasurements(Axis axis, int position) {
         if (LEFT == position) {
             if (axis.isInside()) {
-                labelBaselineTab[position] = computator.getContentRectMinusAxesMargins().left + axisMargin;
+                labelBaselineTab[position] = computator.getContentRectMinusAllMargins().left + axisMargin;
                 nameBaselineTab[position] = computator.getContentRectMinusAxesMargins().left - axisMargin
                         - labelTextDescentTab[position];
             } else {
@@ -288,7 +288,7 @@
             separationLineTab[position] = computator.getContentRectMinusAllMargins().left;
         } else if (RIGHT == position) {
             if (axis.isInside()) {
-                labelBaselineTab[position] = computator.getContentRectMinusAxesMargins().right - axisMargin;
+                labelBaselineTab[position] = computator.getContentRectMinusAllMargins().right - axisMargin;
                 nameBaselineTab[position] = computator.getContentRectMinusAxesMargins().right + axisMargin
                         + labelTextAscentTab[position];
             } else {
@@ -299,7 +299,7 @@
             separationLineTab[position] = computator.getContentRectMinusAllMargins().right;
         } else if (BOTTOM == position) {
             if (axis.isInside()) {
-                labelBaselineTab[position] = computator.getContentRectMinusAxesMargins().bottom - axisMargin
+                labelBaselineTab[position] = computator.getContentRectMinusAllMargins().bottom - axisMargin
                         - labelTextDescentTab[position];
                 nameBaselineTab[position] = computator.getContentRectMinusAxesMargins().bottom + axisMargin
                         + labelTextAscentTab[position];
@@ -312,7 +312,7 @@
             separationLineTab[position] = computator.getContentRectMinusAllMargins().bottom;
         } else if (TOP == position) {
             if (axis.isInside()) {
-                labelBaselineTab[position] = computator.getContentRectMinusAxesMargins().top + axisMargin
+                labelBaselineTab[position] = computator.getContentRectMinusAllMargins().top + axisMargin
                         + labelTextAscentTab[position];
                 nameBaselineTab[position] = computator.getContentRectMinusAxesMargins().top - axisMargin
                         - labelTextDescentTab[position];
