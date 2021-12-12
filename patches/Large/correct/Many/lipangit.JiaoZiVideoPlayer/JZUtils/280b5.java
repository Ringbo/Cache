diff --git a/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java b/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
index ebe594f..21ca7d8 100644
--- a/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
+++ b/jiaozivideoplayer/src/main/java/cn/jzvd/JZUtils.java
@@ -166,7 +166,7 @@
 
     public static boolean dataSourceObjectsContainsUri(Object[] dataSourceObjects, Object object) {
         LinkedHashMap<String, Object> map = (LinkedHashMap) dataSourceObjects[0];
-        if (map != null) {
+        if (map != null && object != null) {
             return map.containsValue(object);
         }
         return false;
