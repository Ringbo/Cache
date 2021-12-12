diff --git a/src/com/timsu/astrid/data/tag/AbstractTagModel.java b/src/com/timsu/astrid/data/tag/AbstractTagModel.java
index bf19944..d8e4e0d 100644
--- a/src/com/timsu/astrid/data/tag/AbstractTagModel.java
+++ b/src/com/timsu/astrid/data/tag/AbstractTagModel.java
@@ -88,9 +88,9 @@
         }
 
         @Override
-        public void onCreate(SQLiteDatabase db) {
+        public synchronized void onCreate(SQLiteDatabase db) {
             String sql = new StringBuilder().
-            append("CREATE TABLE ").append(tableName).append(" (").
+            append("CREATE TABLE IF NOT EXISTS ").append(tableName).append(" (").
                 append(AbstractController.KEY_ROWID).append(" integer primary key autoincrement, ").
                 append(NAME).append(" text unique,").
                 append(NOTES).append(" text,").
@@ -106,7 +106,7 @@
         }
 
         @Override
-        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
+        public synchronized void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
             Log.w(getClass().getSimpleName(), "Upgrading database from version " +
                     oldVersion + " to " + newVersion + ".");
 
