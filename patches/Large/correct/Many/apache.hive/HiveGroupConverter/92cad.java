diff --git a/ql/src/java/org/apache/hadoop/hive/ql/io/parquet/convert/HiveGroupConverter.java b/ql/src/java/org/apache/hadoop/hive/ql/io/parquet/convert/HiveGroupConverter.java
index d0dae2b..4809f9b 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/io/parquet/convert/HiveGroupConverter.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/io/parquet/convert/HiveGroupConverter.java
@@ -53,7 +53,7 @@
     OriginalType annotation = type.getOriginalType();
     if (annotation == OriginalType.LIST) {
       return HiveCollectionConverter.forList(type, parent, index);
-    } else if (annotation == OriginalType.MAP) {
+    } else if (annotation == OriginalType.MAP || annotation == OriginalType.MAP_KEY_VALUE) {
       return HiveCollectionConverter.forMap(type, parent, index);
     }
 
