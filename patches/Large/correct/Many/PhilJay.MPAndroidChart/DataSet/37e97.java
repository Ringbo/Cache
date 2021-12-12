diff --git a/MPChartLib/src/com/github/mikephil/charting/data/DataSet.java b/MPChartLib/src/com/github/mikephil/charting/data/DataSet.java
index cc7633a..e370ad4 100644
--- a/MPChartLib/src/com/github/mikephil/charting/data/DataSet.java
+++ b/MPChartLib/src/com/github/mikephil/charting/data/DataSet.java
@@ -114,7 +114,7 @@
 
         int endValue;
 
-        if (end == 0)
+        if (end == 0 || end >= mYVals.size())
             endValue = mYVals.size() - 1;
         else
             endValue = end;
