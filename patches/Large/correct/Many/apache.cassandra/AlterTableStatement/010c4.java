diff --git a/src/java/org/apache/cassandra/cql3/statements/AlterTableStatement.java b/src/java/org/apache/cassandra/cql3/statements/AlterTableStatement.java
index a5fa12d..59c4e08 100644
--- a/src/java/org/apache/cassandra/cql3/statements/AlterTableStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/AlterTableStatement.java
@@ -237,9 +237,9 @@
                 }
 
                 if (!Iterables.isEmpty(views))
-                    throw new InvalidRequestException(String.format("Cannot drop column %s on base table with materialized views.",
+                    throw new InvalidRequestException(String.format("Cannot drop column %s on base table %s with materialized views.",
                                                                     columnName.toString(),
-                                                                    keyspace()));
+                                                                    columnFamily()));
                 break;
             case DROP_COMPACT_STORAGE:
                 if (!meta.isCompactTable())
