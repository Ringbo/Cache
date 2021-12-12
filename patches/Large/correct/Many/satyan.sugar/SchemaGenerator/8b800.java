diff --git a/library/src/main/java/com/orm/SchemaGenerator.java b/library/src/main/java/com/orm/SchemaGenerator.java
index 06a901a..730b24b 100644
--- a/library/src/main/java/com/orm/SchemaGenerator.java
+++ b/library/src/main/java/com/orm/SchemaGenerator.java
@@ -177,7 +177,7 @@
     }
 
     protected String createTableSQL(Class<?> table) {
-        KeyWord link = new KeyWord();
+        KeyWords link = new KeyWords();
         Log.i(SUGAR, "Create table if not exists");
         List<Field> fields = ReflectionUtil.getTableFields(table);
         String tableName = NamingHelper.toSQLName(table);
