diff --git a/liquibase-core/src/main/java/liquibase/snapshot/jvm/ColumnSnapshotGenerator.java b/liquibase-core/src/main/java/liquibase/snapshot/jvm/ColumnSnapshotGenerator.java
index df1fbe9..6d676bc 100644
--- a/liquibase-core/src/main/java/liquibase/snapshot/jvm/ColumnSnapshotGenerator.java
+++ b/liquibase-core/src/main/java/liquibase/snapshot/jvm/ColumnSnapshotGenerator.java
@@ -197,7 +197,7 @@
 
                 if (dataType.equalsIgnoreCase("NCLOB")) {
                     //no attributes
-                } else if (dataType.equalsIgnoreCase("NVARCHAR")) {
+                } else if (dataType.equalsIgnoreCase("NVARCHAR") || dataType.equalsIgnoreCase("NCHAR")) {
                     //data length is in bytes but specified in chars
                     type.setColumnSize(type.getColumnSize() / 2);
                     type.setColumnSizeUnit(DataType.ColumnSizeUnit.CHAR);
