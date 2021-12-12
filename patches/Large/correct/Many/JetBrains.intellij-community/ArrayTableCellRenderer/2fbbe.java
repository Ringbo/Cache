diff --git a/python/src/com/jetbrains/python/debugger/array/ArrayTableCellRenderer.java b/python/src/com/jetbrains/python/debugger/array/ArrayTableCellRenderer.java
index f650cea..7a8382f 100644
--- a/python/src/com/jetbrains/python/debugger/array/ArrayTableCellRenderer.java
+++ b/python/src/com/jetbrains/python/debugger/array/ArrayTableCellRenderer.java
@@ -28,7 +28,7 @@
   ArrayTableCellRenderer(double min, double max, String type) {
     setHorizontalAlignment(CENTER);
     setHorizontalTextPosition(LEFT);
-    setVerticalAlignment(BOTTOM);
+    setVerticalAlignment(CENTER);
     myMin = min;
     myMax = max;
     myType = type;
