diff --git a/python/src/com/jetbrains/python/debugger/dataframe/DataFrameTableCellRenderer.java b/python/src/com/jetbrains/python/debugger/dataframe/DataFrameTableCellRenderer.java
index 7f6fdf1..40cdfae 100644
--- a/python/src/com/jetbrains/python/debugger/dataframe/DataFrameTableCellRenderer.java
+++ b/python/src/com/jetbrains/python/debugger/dataframe/DataFrameTableCellRenderer.java
@@ -20,7 +20,7 @@
   DataFrameTableCellRenderer() {
     setHorizontalAlignment(CENTER);
     setHorizontalTextPosition(LEFT);
-    setVerticalAlignment(BOTTOM);
+    setVerticalAlignment(CENTER);
   }
 
   @Override
