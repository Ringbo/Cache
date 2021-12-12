diff --git a/src/java/org/apache/cassandra/db/ColumnFamilyStore.java b/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
index c53ce06..6f5c866 100644
--- a/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
+++ b/src/java/org/apache/cassandra/db/ColumnFamilyStore.java
@@ -594,7 +594,7 @@
      */
     public String getFlushPath()
     {
-        long guessedSize = 2 * memsize.value() * 1024*1024; // 2* adds room for keys, column indexes
+        long guessedSize = 2L * memsize.value() * 1024*1024; // 2* adds room for keys, column indexes
         String location = DatabaseDescriptor.getDataFileLocationForTable(table.name, guessedSize);
         if (location == null)
             throw new RuntimeException("Insufficient disk space to flush");
