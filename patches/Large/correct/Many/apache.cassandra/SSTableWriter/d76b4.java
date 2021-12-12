diff --git a/src/java/org/apache/cassandra/io/sstable/SSTableWriter.java b/src/java/org/apache/cassandra/io/sstable/SSTableWriter.java
index 7e0b199..b8e290c 100644
--- a/src/java/org/apache/cassandra/io/sstable/SSTableWriter.java
+++ b/src/java/org/apache/cassandra/io/sstable/SSTableWriter.java
@@ -57,7 +57,7 @@
     {
         super(filename, metadata, partitioner);
         iwriter = new IndexWriter(desc, partitioner, keyCount);
-        dbuilder = SegmentedFile.getBuilder();
+        dbuilder = SegmentedFile.getBuilder(DatabaseDescriptor.getDiskAccessMode());
         dataFile = new BufferedRandomAccessFile(getFilename(), "rw", DatabaseDescriptor.getInMemoryCompactionLimit());
     }
 
@@ -344,7 +344,7 @@
             this.desc = desc;
             this.partitioner = part;
             indexFile = new BufferedRandomAccessFile(desc.filenameFor(SSTable.COMPONENT_INDEX), "rw", 8 * 1024 * 1024);
-            builder = SegmentedFile.getBuilder();
+            builder = SegmentedFile.getBuilder(DatabaseDescriptor.getIndexAccessMode());
             summary = new IndexSummary();
             bf = BloomFilter.getFilter(keyCount, 15);
         }
