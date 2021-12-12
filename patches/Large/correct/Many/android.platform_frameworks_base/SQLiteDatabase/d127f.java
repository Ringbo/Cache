diff --git a/core/java/android/database/sqlite/SQLiteDatabase.java b/core/java/android/database/sqlite/SQLiteDatabase.java
index f723dc8..e33463b 100644
--- a/core/java/android/database/sqlite/SQLiteDatabase.java
+++ b/core/java/android/database/sqlite/SQLiteDatabase.java
@@ -2355,7 +2355,7 @@
         }
         int i = mConnectionPool.getMaxPoolSize();
         if (size < i) {
-            throw new IllegalStateException(
+            throw new IllegalArgumentException(
                     "cannot set max pool size to a value less than the current max value(=" +
                     i + ")");
         }
