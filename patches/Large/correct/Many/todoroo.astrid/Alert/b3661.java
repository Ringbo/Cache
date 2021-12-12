diff --git a/src/com/timsu/astrid/data/alerts/Alert.java b/src/com/timsu/astrid/data/alerts/Alert.java
index 5306cf6..784f631 100644
--- a/src/com/timsu/astrid/data/alerts/Alert.java
+++ b/src/com/timsu/astrid/data/alerts/Alert.java
@@ -70,9 +70,9 @@
         }
 
         @Override
-        public void onCreate(SQLiteDatabase db) {
+        public synchronized void onCreate(SQLiteDatabase db) {
             String sql = new StringBuilder().
-            append("CREATE TABLE ").append(tableName).append(" (").
+            append("CREATE TABLE IF NOT EXISTS ").append(tableName).append(" (").
                 append(AbstractController.KEY_ROWID).append(" integer primary key autoincrement, ").
                 append(TASK).append(" integer not null,").
                 append(DATE).append(" integer not null,").
@@ -82,7 +82,7 @@
         }
 
         @Override
-        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
+        public synchronized void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
             Log.w(getClass().getSimpleName(), "Upgrading database from version " +
                     oldVersion + " to " + newVersion + ".");
 
