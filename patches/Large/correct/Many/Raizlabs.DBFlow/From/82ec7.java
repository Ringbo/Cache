diff --git a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/From.java b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/From.java
index a82e135..a1b4604 100644
--- a/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/From.java
+++ b/dbflow/src/main/java/com/raizlabs/android/dbflow/sql/language/From.java
@@ -180,7 +180,7 @@
             queryBuilder.append("FROM ");
         }
 
-        queryBuilder.appendQuoted(FlowManager.getTableName(table));
+        queryBuilder.append(FlowManager.getTableName(table));
 
         if (queryBase instanceof Select) {
             queryBuilder.appendSpace().appendQualifier("AS", tableAlias.getAliasName());
