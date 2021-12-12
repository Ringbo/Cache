diff --git a/core/src/java/liquibase/change/CreateTableChange.java b/core/src/java/liquibase/change/CreateTableChange.java
index cbe7942..5e76770 100644
--- a/core/src/java/liquibase/change/CreateTableChange.java
+++ b/core/src/java/liquibase/change/CreateTableChange.java
@@ -40,8 +40,7 @@
             boolean isAutoIncrement = column.isAutoIncrement() != null && column.isAutoIncrement();
             if (constraints != null && constraints.isPrimaryKey() != null && constraints.isPrimaryKey()) {
 
-                statement.addPrimaryKeyColumn(column.getName(), constraints.getPrimaryKeyName(),
-                        database.getColumnType(column.getType(), isAutoIncrement));
+                statement.addPrimaryKeyColumn(column.getName(), database.getColumnType(column.getType(), isAutoIncrement), constraints.getPrimaryKeyName());
 
             } else {
                 String defaultValue = null;
