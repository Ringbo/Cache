diff --git a/android/core/src/processing/data/Table.java b/android/core/src/processing/data/Table.java
index 339f3e4..d493b7b 100644
--- a/android/core/src/processing/data/Table.java
+++ b/android/core/src/processing/data/Table.java
@@ -1801,7 +1801,8 @@
 
   public int getInt(int row, int column) {
     checkBounds(row, column);
-    if (columnTypes[column] == INT) {
+    if (columnTypes[column] == INT ||
+        columnTypes[column] == CATEGORICAL) {
       int[] intData = (int[]) columns[column];
       return intData[row];
     }
