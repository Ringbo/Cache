diff --git a/src/com/timsu/astrid/data/task/AbstractTaskModel.java b/src/com/timsu/astrid/data/task/AbstractTaskModel.java
index 9875825..6d58e9b 100644
--- a/src/com/timsu/astrid/data/task/AbstractTaskModel.java
+++ b/src/com/timsu/astrid/data/task/AbstractTaskModel.java
@@ -117,9 +117,9 @@
         }
 
         @Override
-        public void onCreate(SQLiteDatabase db) {
+        public synchronized void onCreate(SQLiteDatabase db) {
             String sql = new StringBuilder().
-            append("CREATE TABLE ").append(tableName).append(" (").
+            append("CREATE TABLE IF NOT EXISTS ").append(tableName).append(" (").
                 append(AbstractController.KEY_ROWID).append(" integer primary key autoincrement, ").
                 append(NAME).append(" text not null,").
                 append(NOTES).append(" text not null,").
@@ -146,7 +146,7 @@
 
         @Override
         @SuppressWarnings("fallthrough")
-        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
+        public synchronized void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
             Log.w(getClass().getSimpleName(), "Upgrading database from version " +
                     oldVersion + " to " + newVersion + ".");
             String sql;
