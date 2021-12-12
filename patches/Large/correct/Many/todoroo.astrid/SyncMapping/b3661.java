diff --git a/src/com/timsu/astrid/data/sync/SyncMapping.java b/src/com/timsu/astrid/data/sync/SyncMapping.java
index 0520c80..0f138ab 100644
--- a/src/com/timsu/astrid/data/sync/SyncMapping.java
+++ b/src/com/timsu/astrid/data/sync/SyncMapping.java
@@ -77,9 +77,9 @@
         }
 
         @Override
-        public void onCreate(SQLiteDatabase db) {
+        public synchronized void onCreate(SQLiteDatabase db) {
             String sql = new StringBuilder().
-            append("CREATE TABLE ").append(tableName).append(" (").
+            append("CREATE TABLE IF NOT EXISTS ").append(tableName).append(" (").
                 append(AbstractController.KEY_ROWID).append(" integer primary key autoincrement, ").
                 append(TASK).append(" integer not null,").
                 append(SYNC_SERVICE).append(" integer not null,").
@@ -91,7 +91,7 @@
         }
 
         @Override
-        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
+        public synchronized void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
             Log.w(getClass().getSimpleName(), "Upgrading database from version " +
                     oldVersion + " to " + newVersion + ".");
 
