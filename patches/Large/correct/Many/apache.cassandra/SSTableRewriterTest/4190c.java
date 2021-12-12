diff --git a/test/unit/org/apache/cassandra/io/sstable/SSTableRewriterTest.java b/test/unit/org/apache/cassandra/io/sstable/SSTableRewriterTest.java
index 17f3392..52d03bc 100644
--- a/test/unit/org/apache/cassandra/io/sstable/SSTableRewriterTest.java
+++ b/test/unit/org/apache/cassandra/io/sstable/SSTableRewriterTest.java
@@ -218,12 +218,12 @@
         SSTableWriter writer = getWriter(cfs, dir);
         try
         {
-            for (int i = 0; i < 1000; i++)
+            for (int i = 0; i < 10000; i++)
                 writer.append(StorageService.getPartitioner().decorateKey(random(i, 10)), cf);
             SSTableReader s = writer.openEarly(1000);
             assert s != null;
             assertFileCounts(dir.list(), 2, 2);
-            for (int i = 1000; i < 2000; i++)
+            for (int i = 10000; i < 20000; i++)
                 writer.append(StorageService.getPartitioner().decorateKey(random(i, 10)), cf);
             SSTableReader s2 = writer.openEarly(1000);
             assertTrue(s.last.compareTo(s2.last) < 0);
