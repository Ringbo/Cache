diff --git a/h2o-core/src/main/java/water/util/TwoDimTable.java b/h2o-core/src/main/java/water/util/TwoDimTable.java
index 25b1c70..ce1d2fb 100644
--- a/h2o-core/src/main/java/water/util/TwoDimTable.java
+++ b/h2o-core/src/main/java/water/util/TwoDimTable.java
@@ -257,7 +257,7 @@
       switch (colTypes[col]) {
         case "double":
         case "float":
-          cellValues[row][col] = Double.toString(d);
+          cellValues[row][col] = Double.toHexString(d);
           break;
         case "long":
         case "int":
@@ -280,7 +280,7 @@
     switch (colTypes[col]) {
       case "double":
       case "float":
-        cellValues[row][col] = Float.toString(f);
+        cellValues[row][col] = Float.toHexString(f);
         break;
       default:
         cellValues[row][col] = Float.toString(f);
