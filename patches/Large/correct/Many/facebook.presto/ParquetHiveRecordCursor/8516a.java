diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/parquet/ParquetHiveRecordCursor.java b/presto-hive/src/main/java/com/facebook/presto/hive/parquet/ParquetHiveRecordCursor.java
index f4b5fc4..446caee 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/parquet/ParquetHiveRecordCursor.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/parquet/ParquetHiveRecordCursor.java
@@ -717,7 +717,11 @@
             checkArgument(ROW.equals(prestoType.getTypeSignature().getBase()));
             List<Type> prestoTypeParameters = prestoType.getTypeParameters();
             List<parquet.schema.Type> fieldTypes = entryType.getFields();
-            checkArgument(prestoTypeParameters.size() == fieldTypes.size());
+            checkArgument(prestoTypeParameters.size() == fieldTypes.size(),
+                            "Schema mismatch, metastore schema for row column %s has %s fields but parquet schema has %s fields",
+                            columnName,
+                            prestoTypeParameters.size(),
+                            fieldTypes.size());
 
             this.rowType = prestoType;
             this.fieldIndex = fieldIndex;
