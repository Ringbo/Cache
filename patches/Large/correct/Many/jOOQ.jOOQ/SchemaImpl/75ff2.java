diff --git a/jOOQ/src/main/java/org/jooq/impl/SchemaImpl.java b/jOOQ/src/main/java/org/jooq/impl/SchemaImpl.java
index a93377f..47d0721 100644
--- a/jOOQ/src/main/java/org/jooq/impl/SchemaImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/SchemaImpl.java
@@ -106,7 +106,7 @@
         // [#4793] TODO: Support this
         // Utils.getMappedCatalog(ctx.configuration(), getCatalog());
 
-        if (mappedCatalog != null) {
+        if (mappedCatalog != null && !StringUtils.isBlank(mappedCatalog.getName())) {
             ctx.visit(mappedCatalog);
             ctx.sql('.');
         }
