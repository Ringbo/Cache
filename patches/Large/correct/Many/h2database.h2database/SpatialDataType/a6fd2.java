diff --git a/h2/src/main/org/h2/mvstore/rtree/SpatialDataType.java b/h2/src/main/org/h2/mvstore/rtree/SpatialDataType.java
index e13b445..75c4771 100644
--- a/h2/src/main/org/h2/mvstore/rtree/SpatialDataType.java
+++ b/h2/src/main/org/h2/mvstore/rtree/SpatialDataType.java
@@ -352,7 +352,7 @@
         return new int[] { firstIndex, lastIndex };
     }
 
-    ArrayList<Object> getNotNull(ArrayList<Object> list) {
+    private static ArrayList<Object> getNotNull(ArrayList<Object> list) {
         ArrayList<Object> result = null;
         for (Object o : list) {
             SpatialKey a = (SpatialKey) o;
