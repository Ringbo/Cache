diff --git a/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java b/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
index 8482267..219fa27 100644
--- a/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
@@ -123,7 +123,10 @@
     public final List<Catalog> getCatalogs() {
         try {
             List<Catalog> result = new ArrayList<Catalog>();
-            Result<Record> catalogs = create.fetch(meta().getCatalogs());
+            Result<Record> catalogs = create.fetch(
+                meta().getCatalogs(),
+                SQLDataType.VARCHAR // TABLE_CATALOG
+            );
 
             for (String name : catalogs.getValues(0, String.class)) {
                 result.add(new MetaCatalog(name));
@@ -193,7 +196,11 @@
         public final List<Schema> getSchemas() {
             try {
                 List<Schema> result = new ArrayList<Schema>();
-                Result<Record> schemas = create.fetch(meta().getSchemas());
+                Result<Record> schemas = create.fetch(
+                    meta().getSchemas(),
+                    SQLDataType.VARCHAR, // TABLE_SCHEM
+                    SQLDataType.VARCHAR  // TABLE_CATALOG
+                );
 
                 for (String name : schemas.getValues(0, String.class)) {
                     result.add(new MetaSchema(name));
@@ -254,7 +261,19 @@
                 }
 
                 List<Table<?>> result = new ArrayList<Table<?>>();
-                Result<Record> tables = create.fetch(meta().getTables(null, getName(), "%", types));
+                Result<Record> tables = create.fetch(
+                    meta().getTables(null, getName(), "%", types),
+                    SQLDataType.VARCHAR, // TABLE_CAT
+                    SQLDataType.VARCHAR, // TABLE_SCHEM
+                    SQLDataType.VARCHAR, // TABLE_NAME
+                    SQLDataType.VARCHAR, // TABLE_TYPE
+                    SQLDataType.VARCHAR, // REMARKS
+                    SQLDataType.VARCHAR, // TYPE_CAT
+                    SQLDataType.VARCHAR, // TYPE_SCHEM
+                    SQLDataType.VARCHAR, // TYPE_NAME
+                    SQLDataType.VARCHAR, // SELF_REFERENCING_COL_NAME
+                    SQLDataType.VARCHAR  // REF_GENERATION
+                );
 
                 for (Record table : tables) {
 //                  String catalog = table.getValue(0, String.class);
