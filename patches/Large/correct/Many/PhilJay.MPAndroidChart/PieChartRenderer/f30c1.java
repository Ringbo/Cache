diff --git a/MPChartLib/src/com/github/mikephil/charting/renderer/PieChartRenderer.java b/MPChartLib/src/com/github/mikephil/charting/renderer/PieChartRenderer.java
index 2b4fdb4..b86eea4 100644
--- a/MPChartLib/src/com/github/mikephil/charting/renderer/PieChartRenderer.java
+++ b/MPChartLib/src/com/github/mikephil/charting/renderer/PieChartRenderer.java
@@ -410,7 +410,7 @@
             else
                 angle = rotationAngle + absoluteAngles[xIndex - 1];
 
-            angle *= mAnimator.getPhaseY();
+            angle *= mAnimator.getPhaseX();
 
             float sliceDegrees = drawAngles[xIndex];
 
