diff --git a/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java b/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
index e716160..11bdd2e 100644
--- a/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
@@ -587,7 +587,7 @@
             for (Entry<Record, Result<Record>> entry : groups.entrySet()) {
                 Schema schema = schemas.get(entry.getKey().get(1));
 
-                String pkName = entry.getKey().get(12, String.class);
+                String pkName = entry.getKey().get(4, String.class);
                 Table<Record> pkTable = (Table<Record>) schema.getTable(entry.getKey().get(2, String.class));
                 TableField<Record, ?>[] pkFields = new TableField[entry.getValue().size()];
                 TableField<Record, ?>[] fkFields = new TableField[entry.getValue().size()];
