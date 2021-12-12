diff --git a/querydsl-sql-codegen/src/main/java/com/mysema/query/sql/codegen/KeyDataFactory.java b/querydsl-sql-codegen/src/main/java/com/mysema/query/sql/codegen/KeyDataFactory.java
index 8ac524c..1f28c08 100644
--- a/querydsl-sql-codegen/src/main/java/com/mysema/query/sql/codegen/KeyDataFactory.java
+++ b/querydsl-sql-codegen/src/main/java/com/mysema/query/sql/codegen/KeyDataFactory.java
@@ -77,7 +77,7 @@
                 String foreignSchemaName = foreignKeys.getString(FK_FOREIGN_SCHEMA_NAME);
                 String foreignTableName = foreignKeys.getString(FK_FOREIGN_TABLE_NAME);
                 String foreignColumn = foreignKeys.getString(FK_FOREIGN_COLUMN_NAME);
-                if (name == null) {
+                if (name == null || name.isEmpty()) {
                     name = tableName + "_" + foreignTableName + "_IFK";
                 }
 
@@ -106,7 +106,7 @@
                 String parentTableName = foreignKeys.getString(FK_PARENT_TABLE_NAME);
                 String parentColumnName = foreignKeys.getString(FK_PARENT_COLUMN_NAME);
                 String foreignColumn = foreignKeys.getString(FK_FOREIGN_COLUMN_NAME);
-                if (name == null) {
+                if (name == null || name.isEmpty()) {
                     name = tableName + "_" + parentTableName + "_FK";
                 }
 
@@ -132,7 +132,7 @@
             while (primaryKeys.next()) {
                 String name = primaryKeys.getString(PK_NAME);
                 String columnName = primaryKeys.getString(PK_COLUMN_NAME);
-                if (name == null) {
+                if (name == null || name.isEmpty()) {
                     name = tableName + "_PK";
                 }
 
