diff --git a/src/java/org/apache/cassandra/db/compaction/Upgrader.java b/src/java/org/apache/cassandra/db/compaction/Upgrader.java
index e7211ba..17b68ec 100644
--- a/src/java/org/apache/cassandra/db/compaction/Upgrader.java
+++ b/src/java/org/apache/cassandra/db/compaction/Upgrader.java
@@ -69,14 +69,14 @@
         this.controller = new UpgradeController(cfs);
 
         this.strategy = cfs.getCompactionStrategy();
-        long estimatedTotalKeys = Math.max(DatabaseDescriptor.getIndexInterval(), SSTableReader.getApproximateKeyCount(toUpgrade));
+        long estimatedTotalKeys = Math.max(cfs.metadata.getIndexInterval(), SSTableReader.getApproximateKeyCount(toUpgrade, cfs.metadata));
         long estimatedSSTables = Math.max(1, SSTable.getTotalBytes(this.toUpgrade) / strategy.getMaxSSTableSize());
         this.estimatedRows = (long) Math.ceil((double) estimatedTotalKeys / estimatedSSTables);
     }
 
     private SSTableWriter createCompactionWriter()
     {
-        SSTableMetadata.Collector sstableMetadataCollector = SSTableMetadata.createCollector();
+        SSTableMetadata.Collector sstableMetadataCollector = SSTableMetadata.createCollector(cfs.getComparator());
 
         // Get the max timestamp of the precompacted sstables
         // and adds generation of live ancestors
@@ -130,7 +130,7 @@
             // also remove already completed SSTables
             for (SSTableReader sstable : sstables)
             {
-                sstable.markCompacted();
+                sstable.markObsolete();
                 sstable.releaseReference();
             }
             throw Throwables.propagate(t);
