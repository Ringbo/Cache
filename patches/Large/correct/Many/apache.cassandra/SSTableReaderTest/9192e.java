diff --git a/test/unit/org/apache/cassandra/io/sstable/SSTableReaderTest.java b/test/unit/org/apache/cassandra/io/sstable/SSTableReaderTest.java
index 6f94696..08b1716 100644
--- a/test/unit/org/apache/cassandra/io/sstable/SSTableReaderTest.java
+++ b/test/unit/org/apache/cassandra/io/sstable/SSTableReaderTest.java
@@ -381,7 +381,7 @@
         long bloomModified = Files.getLastModifiedTime(bloomPath).toMillis();
         long summaryModified = Files.getLastModifiedTime(summaryPath).toMillis();
 
-        Thread.sleep(TimeUnit.MILLISECONDS.toMillis(10)); // sleep to ensure modified time will be different
+        Thread.sleep(TimeUnit.MILLISECONDS.toMillis(1000)); // sleep to ensure modified time will be different
 
         // Offline tests
         // check that bloomfilter/summary ARE NOT regenerated
@@ -428,7 +428,7 @@
         summaryModified = Files.getLastModifiedTime(summaryPath).toMillis();
         summaryFile.delete();
 
-        Thread.sleep(TimeUnit.MILLISECONDS.toMillis(10)); // sleep to ensure modified time will be different
+        Thread.sleep(TimeUnit.MILLISECONDS.toMillis(1000)); // sleep to ensure modified time will be different
         bloomModified = Files.getLastModifiedTime(bloomPath).toMillis();
 
         target = SSTableReader.open(desc, components, store.metadata);
