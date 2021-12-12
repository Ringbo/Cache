diff --git a/test/unit/org/apache/cassandra/db/compaction/CompactionsCQLTest.java b/test/unit/org/apache/cassandra/db/compaction/CompactionsCQLTest.java
index 76e3b88..a06d4a5 100644
--- a/test/unit/org/apache/cassandra/db/compaction/CompactionsCQLTest.java
+++ b/test/unit/org/apache/cassandra/db/compaction/CompactionsCQLTest.java
@@ -30,7 +30,7 @@
     public void testTriggerMinorCompaction() throws Throwable
     {
         createTable("CREATE TABLE %s (id text PRIMARY KEY);");
-        assertTrue(Keyspace.open(KEYSPACE).getColumnFamilyStore(currentTable()).getCompactionStrategy().isEnabled());
+        assertTrue(Keyspace.open(KEYSPACE).getColumnFamilyStore(currentTable()).getCompactionStrategyManager().isEnabled());
         execute("insert into %s (id) values ('1')");
         flush();
         execute("insert into %s (id) values ('1')");
