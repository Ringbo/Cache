diff --git a/test/unit/org/apache/cassandra/streaming/StreamTransferTaskTest.java b/test/unit/org/apache/cassandra/streaming/StreamTransferTaskTest.java
index 1c28cbd..94fa92c 100644
--- a/test/unit/org/apache/cassandra/streaming/StreamTransferTaskTest.java
+++ b/test/unit/org/apache/cassandra/streaming/StreamTransferTaskTest.java
@@ -64,7 +64,7 @@
         {
             List<Range<Token>> ranges = new ArrayList<>();
             ranges.add(new Range<>(sstable.first.getToken(), sstable.last.getToken()));
-            task.addTransferFile(sstable, 1, sstable.getPositionsForRanges(ranges), 0);
+            task.addTransferFile(sstable, 1, sstable.getPositionsForRanges(ranges));
         }
         assertEquals(2, task.getTotalNumberOfFiles());
 
