diff --git a/src/java/org/apache/cassandra/cql3/statements/AlterTableStatement.java b/src/java/org/apache/cassandra/cql3/statements/AlterTableStatement.java
index 37db2fd..bb2c7e8 100644
--- a/src/java/org/apache/cassandra/cql3/statements/AlterTableStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/AlterTableStatement.java
@@ -98,7 +98,7 @@
                         cfm.defaultValidator(CFPropDefs.parseType(validator));
                         break;
                     case COLUMN_METADATA:
-                        ColumnDefinition column = meta.getColumnDefinition(columnName.key);
+                        ColumnDefinition column = cfm.getColumnDefinition(columnName.key);
                         column.setValidator(CFPropDefs.parseType(validator));
                         cfm.addColumnDefinition(column);
                         break;
