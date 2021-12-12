diff --git a/api/src/com/todoroo/andlib/data/AbstractDatabase.java b/api/src/com/todoroo/andlib/data/AbstractDatabase.java
index 78d0613..7ab91ea 100644
--- a/api/src/com/todoroo/andlib/data/AbstractDatabase.java
+++ b/api/src/com/todoroo/andlib/data/AbstractDatabase.java
@@ -257,8 +257,7 @@
      * @see android.database.sqlite.SQLiteDatabase#update(String  table, ContentValues  values, String  whereClause, String[] whereArgs)
      */
     public synchronized int update(String  table, ContentValues  values, String  whereClause, String[] whereArgs) {
-        int result = getDatabase().updateWithOnConflict(table, values, whereClause, whereArgs,
-                SQLiteDatabase.CONFLICT_FAIL);
+        int result = getDatabase().update(table, values, whereClause, whereArgs);
         onDatabaseUpdated();
         return result;
     }
