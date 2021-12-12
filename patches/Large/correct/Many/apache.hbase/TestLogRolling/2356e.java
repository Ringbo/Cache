diff --git a/src/test/java/org/apache/hadoop/hbase/regionserver/wal/TestLogRolling.java b/src/test/java/org/apache/hadoop/hbase/regionserver/wal/TestLogRolling.java
index 8856b93..cca86d9 100644
--- a/src/test/java/org/apache/hadoop/hbase/regionserver/wal/TestLogRolling.java
+++ b/src/test/java/org/apache/hadoop/hbase/regionserver/wal/TestLogRolling.java
@@ -474,7 +474,7 @@
     writeData(table, 5);
 
     // force a log roll to read back and verify previously written logs
-    log.rollWriter();
+    log.rollWriter(true);
 
     // read back the data written
     Set<String> loggedRows = new HashSet<String>();
