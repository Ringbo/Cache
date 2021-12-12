diff --git a/src/java/org/apache/cassandra/db/compaction/CompactionManager.java b/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
index 310ddfb..168ee02 100644
--- a/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
+++ b/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
@@ -560,7 +560,7 @@
                 throw new IOException("disk full");
 
             ICompactionScanner scanner = cleanupStrategy.getScanner(sstable, getRateLimiter());
-            CleanupInfo ci = new CleanupInfo(sstable, (SSTableScanner)scanner);
+            CleanupInfo ci = new CleanupInfo(sstable, scanner);
 
             metrics.beginCompaction(ci);
             SSTableWriter writer = createWriter(cfs,
@@ -1052,9 +1052,9 @@
     private static class CleanupInfo extends CompactionInfo.Holder
     {
         private final SSTableReader sstable;
-        private final SSTableScanner scanner;
+        private final ICompactionScanner scanner;
 
-        public CleanupInfo(SSTableReader sstable, SSTableScanner scanner)
+        public CleanupInfo(SSTableReader sstable, ICompactionScanner scanner)
         {
             this.sstable = sstable;
             this.scanner = scanner;
