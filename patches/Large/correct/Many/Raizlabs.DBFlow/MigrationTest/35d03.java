diff --git a/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/sql/MigrationTest.java b/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/sql/MigrationTest.java
index 9fc8d40..11be040 100644
--- a/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/sql/MigrationTest.java
+++ b/dbflow-tests/src/test/java/com/raizlabs/android/dbflow/test/sql/MigrationTest.java
@@ -50,7 +50,7 @@
 
         // test the column sizes
         Cursor cursor = new Select().from(MigrationModel.class).where().query();
-        assertTrue(cursor.getColumnNames().length == columnNames.size() + 1);
+        assertTrue(cursor.getColumnNames().length == columnNames.size() + 2);
 
         try {
             Thread.sleep(200);
