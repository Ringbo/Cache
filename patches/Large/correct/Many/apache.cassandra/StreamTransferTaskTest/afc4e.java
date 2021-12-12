diff --git a/test/unit/org/apache/cassandra/streaming/StreamTransferTaskTest.java b/test/unit/org/apache/cassandra/streaming/StreamTransferTaskTest.java
index 9b02817..e22fa8f 100644
--- a/test/unit/org/apache/cassandra/streaming/StreamTransferTaskTest.java
+++ b/test/unit/org/apache/cassandra/streaming/StreamTransferTaskTest.java
@@ -59,7 +59,7 @@
         {
             List<Range<Token>> ranges = new ArrayList<>();
             ranges.add(new Range<>(sstable.first.getToken(), sstable.last.getToken()));
-            task.addTransferFile(sstable, 1, sstable.getPositionsForRanges(ranges));
+            task.addTransferFile(sstable, 1, sstable.getPositionsForRanges(ranges), 0);
         }
         assertEquals(2, task.getTotalNumberOfFiles());
 
