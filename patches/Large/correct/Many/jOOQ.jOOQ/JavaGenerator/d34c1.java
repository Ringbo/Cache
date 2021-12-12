diff --git a/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java b/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
index 4d0a58e..127d4d1 100644
--- a/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
+++ b/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
@@ -2825,7 +2825,7 @@
         List<ColumnDefinition> keyColumns = key.getKeyColumns();
 
         if (keyColumns.size() == 1) {
-            tType = getJavaType(keyColumns.get(0).getType(resolver()));
+            tType = getJavaType(keyColumns.get(0).getType(resolver()), Mode.POJO);
         }
         else if (keyColumns.size() <= Constants.MAX_ROW_DEGREE) {
             String generics = "";
