diff --git a/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java b/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
index 8f59af2..e07ba3d 100644
--- a/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
@@ -209,8 +209,7 @@
                         meta().getSchemas(),
 
                         // [#2681] Work around a flaw in the MySQL JDBC driver
-                        SQLDataType.VARCHAR, // TABLE_SCHEM
-                        SQLDataType.VARCHAR  // TABLE_CATALOG
+                        SQLDataType.VARCHAR // TABLE_SCHEM
                     );
 
                     for (String name : schemas.getValues(0, String.class)) {
