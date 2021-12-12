diff --git a/MPChartExample/src/com/xxmassdeveloper/mpchartexample/MultiLineChartActivity.java b/MPChartExample/src/com/xxmassdeveloper/mpchartexample/MultiLineChartActivity.java
index 03ebedd..487fd4b 100644
--- a/MPChartExample/src/com/xxmassdeveloper/mpchartexample/MultiLineChartActivity.java
+++ b/MPChartExample/src/com/xxmassdeveloper/mpchartexample/MultiLineChartActivity.java
@@ -196,7 +196,7 @@
 
             for (int i = 0; i < mSeekBarX.getProgress(); i++) {
                 double val = (Math.random() * mSeekBarY.getProgress()) + 3;
-                values.add(new Entry((float) val, i));
+                values.add(new Entry(i, (float) val));
             }
 
             LineDataSet d = new LineDataSet(values, "DataSet " + (z + 1));
