diff --git a/MPChartLib/src/main/java/com/github/mikephil/charting/utils/Transformer.java b/MPChartLib/src/main/java/com/github/mikephil/charting/utils/Transformer.java
index 1037739..0496bd0 100644
--- a/MPChartLib/src/main/java/com/github/mikephil/charting/utils/Transformer.java
+++ b/MPChartLib/src/main/java/com/github/mikephil/charting/utils/Transformer.java
@@ -169,9 +169,10 @@
      * @return
      */
     public float[] generateTransformedValuesLine(ILineDataSet data,
-                                                 float phaseX, float phaseY, int from, int to) {
+                                                 float phaseX, float phaseY,
+                                                 int min, int max) {
 
-        final int count = (int) ((to - from) * phaseX) * 2;
+        final int count = ((int) ((max - min) * phaseX) + 1) * 2;
 
         if (valuePointsForGenerateTransformedValuesLine.length != count) {
             valuePointsForGenerateTransformedValuesLine = new float[count];
@@ -180,7 +181,7 @@
 
         for (int j = 0; j < count; j += 2) {
 
-            Entry e = data.getEntryForIndex(j / 2 + from);
+            Entry e = data.getEntryForIndex(j / 2 + min);
 
             if (e != null) {
                 valuePoints[j] = e.getX();
