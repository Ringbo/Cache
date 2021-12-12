diff --git a/jOOQ-console/src/main/java/org/jooq/debug/impl/LocalDebugger.java b/jOOQ-console/src/main/java/org/jooq/debug/impl/LocalDebugger.java
index 470517b..aa852fa 100644
--- a/jOOQ-console/src/main/java/org/jooq/debug/impl/LocalDebugger.java
+++ b/jOOQ-console/src/main/java/org/jooq/debug/impl/LocalDebugger.java
@@ -226,7 +226,7 @@
         }
         Set<String> columnNameSet = new HashSet<String>();
         for(Table<?> table: databaseDescriptor.getSchema().getTables()) {
-            for(Field<?> field: table.getFields()) {
+            for(Field<?> field: table.fields()) {
                 String columnName = field.getName();
                 columnNameSet.add(columnName);
             }
