diff --git a/core/java/android/database/sqlite/SQLiteConnectionPool.java b/core/java/android/database/sqlite/SQLiteConnectionPool.java
index 765f27e..6ce8787 100644
--- a/core/java/android/database/sqlite/SQLiteConnectionPool.java
+++ b/core/java/android/database/sqlite/SQLiteConnectionPool.java
@@ -1009,13 +1009,15 @@
     }
 
     private void setMaxConnectionPoolSizeLocked() {
-        if ((mConfiguration.openFlags & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
+        if (!mConfiguration.isInMemoryDb()
+                && (mConfiguration.openFlags & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
             mMaxConnectionPoolSize = SQLiteGlobal.getWALConnectionPoolSize();
         } else {
-            // TODO: We don't actually need to restrict the connection pool size to 1
+            // We don't actually need to always restrict the connection pool size to 1
             // for non-WAL databases.  There might be reasons to use connection pooling
-            // with other journal modes.  For now, enabling connection pooling and
-            // using WAL are the same thing in the API.
+            // with other journal modes. However, we should always keep pool size of 1 for in-memory
+            // databases since every :memory: db is separate from another.
+            // For now, enabling connection pooling and using WAL are the same thing in the API.
             mMaxConnectionPoolSize = 1;
         }
     }
