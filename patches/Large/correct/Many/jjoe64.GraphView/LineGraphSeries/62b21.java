diff --git a/src/main/java/com/jjoe64/graphview/series/LineGraphSeries.java b/src/main/java/com/jjoe64/graphview/series/LineGraphSeries.java
index 72e4aa4..3b0e4b6 100644
--- a/src/main/java/com/jjoe64/graphview/series/LineGraphSeries.java
+++ b/src/main/java/com/jjoe64/graphview/series/LineGraphSeries.java
@@ -273,13 +273,13 @@
                 }
                 registerDataPoint(endX, endY, value);
 
-                if (i==1) {
+                if (i>=1) {
                     mPath.moveTo(startX, startY);
                 }
                 mPath.lineTo(endX, endY);
 
                 if (mStyles.drawBackground) {
-                    if (i==1) {
+                    if (i>=1) {
                         firstX = startX;
                         mPathBackground.moveTo(startX, startY);
                     }
