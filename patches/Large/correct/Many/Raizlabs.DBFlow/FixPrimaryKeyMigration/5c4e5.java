diff --git a/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/sql/FixPrimaryKeyMigration.java b/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/sql/FixPrimaryKeyMigration.java
index 624e35a..9dbeffe 100644
--- a/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/sql/FixPrimaryKeyMigration.java
+++ b/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/sql/FixPrimaryKeyMigration.java
@@ -21,7 +21,7 @@
 
     @Override
     public void migrate(DatabaseWrapper database) {
-        Cursor tableSchema = getSelectTableQuery().query();
+        Cursor tableSchema = getSelectTableQuery().query(database);
 
         if (tableSchema != null && tableSchema.moveToFirst()) {
             String creationQuery = tableSchema.getString(0);
