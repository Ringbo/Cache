diff --git a/src/main/java/com/grosner/dbflow/sql/migration/UpdateTableMigration.java b/src/main/java/com/grosner/dbflow/sql/migration/UpdateTableMigration.java
index 7e8c211..2e4004c 100644
--- a/src/main/java/com/grosner/dbflow/sql/migration/UpdateTableMigration.java
+++ b/src/main/java/com/grosner/dbflow/sql/migration/UpdateTableMigration.java
@@ -44,7 +44,7 @@
      * @param value
      * @return
      */
-    public UpdateTableMigration<ModelClass> setColumn(String columnName, String value) {
+    public UpdateTableMigration<ModelClass> set(String columnName, String value) {
         if (mSetDefinitions == null) {
             mSetDefinitions = new ArrayList<QueryBuilder>();
         }
@@ -69,7 +69,7 @@
                 .append("SET").appendSpace().appendList(mSetDefinitions);
 
         if (mWhereQueryBuilder != null) {
-            mQuery.appendSpace().append(mWhereQueryBuilder.getQuery());
+            mQuery.appendSpaceSeparated("WHERE").append(mWhereQueryBuilder.getQuery());
         }
     }
 
