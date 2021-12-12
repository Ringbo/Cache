diff --git a/src/com/timsu/astrid/data/tag/TagToTaskMapping.java b/src/com/timsu/astrid/data/tag/TagToTaskMapping.java
index c26a579..fe4f87b 100644
--- a/src/com/timsu/astrid/data/tag/TagToTaskMapping.java
+++ b/src/com/timsu/astrid/data/tag/TagToTaskMapping.java
@@ -68,9 +68,9 @@
         }
 
         @Override
-        public void onCreate(SQLiteDatabase db) {
+        public synchronized void onCreate(SQLiteDatabase db) {
             String sql = new StringBuilder().
-            append("CREATE TABLE ").append(tableName).append(" (").
+            append("CREATE TABLE IF NOT EXISTS ").append(tableName).append(" (").
                 append(AbstractController.KEY_ROWID).append(" integer primary key autoincrement, ").
                 append(TASK).append(" integer not null,").
                 append(TAG).append(" integer not null,").
@@ -80,7 +80,7 @@
         }
 
         @Override
-        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
+        public synchronized void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
             Log.w(getClass().getSimpleName(), "Upgrading database from version " +
                     oldVersion + " to " + newVersion + ".");
 
