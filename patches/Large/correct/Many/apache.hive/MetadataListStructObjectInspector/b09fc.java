diff --git a/serde/src/java/org/apache/hadoop/hive/serde2/objectinspector/MetadataListStructObjectInspector.java b/serde/src/java/org/apache/hadoop/hive/serde2/objectinspector/MetadataListStructObjectInspector.java
index e68325f..5a2beb9 100644
--- a/serde/src/java/org/apache/hadoop/hive/serde2/objectinspector/MetadataListStructObjectInspector.java
+++ b/serde/src/java/org/apache/hadoop/hive/serde2/objectinspector/MetadataListStructObjectInspector.java
@@ -49,7 +49,7 @@
       List<String> columnNames) {
     ArrayList<List<String>> key = new ArrayList<List<String>>(1);
     key.add(columnNames);
-    MetadataListStructObjectInspector result = cached.get(columnNames);
+    MetadataListStructObjectInspector result = cached.get(key);
     if (result == null) {
       result = new MetadataListStructObjectInspector(columnNames);
       MetadataListStructObjectInspector prev = cached.putIfAbsent(key, result);
