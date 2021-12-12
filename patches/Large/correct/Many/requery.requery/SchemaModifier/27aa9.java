diff --git a/requery/src/main/java/io/requery/sql/SchemaModifier.java b/requery/src/main/java/io/requery/sql/SchemaModifier.java
index 71c0c0b..93cb223 100644
--- a/requery/src/main/java/io/requery/sql/SchemaModifier.java
+++ b/requery/src/main/java/io/requery/sql/SchemaModifier.java
@@ -215,7 +215,7 @@
                 qb = createQueryBuilder();
                 qb.keyword(ALTER, TABLE)
                     .tableName(type.getName()).keyword(ADD);
-                createForeignKeyColumn(qb, attribute, true);
+                createForeignKeyColumn(qb, attribute, false);
             } else {
                 // just for SQLite for now adding the column and key is done in 1 statement
                 qb = createQueryBuilder();
