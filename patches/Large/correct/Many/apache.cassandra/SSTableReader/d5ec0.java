diff --git a/src/java/org/apache/cassandra/io/sstable/SSTableReader.java b/src/java/org/apache/cassandra/io/sstable/SSTableReader.java
index b89ee24..a67c1ab 100644
--- a/src/java/org/apache/cassandra/io/sstable/SSTableReader.java
+++ b/src/java/org/apache/cassandra/io/sstable/SSTableReader.java
@@ -758,15 +758,18 @@
 
         // scan the on-disk index, starting at the nearest sampled position.
         // The check against IndexInterval is to be exit the loop in the EQ case when the key looked for is not present
-        // (bloom filter false positive).
+        // (bloom filter false positive). But note that for non-EQ cases, we might need to check the first key of the
+        // next index position because the searched key can be greater the last key of the index interval checked if it
+        // is lesser than the first key of next interval (and in that case we must return the position of the first key
+        // of the next interval).
         int i = 0;
         Iterator<FileDataInput> segments = ifile.iterator(sampledPosition, INDEX_FILE_BUFFER_BYTES);
-        while (segments.hasNext() && i < DatabaseDescriptor.getIndexInterval())
+        while (segments.hasNext() && i <= DatabaseDescriptor.getIndexInterval())
         {
             FileDataInput in = segments.next();
             try
             {
-                while (!in.isEOF() && i < DatabaseDescriptor.getIndexInterval())
+                while (!in.isEOF() && i <= DatabaseDescriptor.getIndexInterval())
                 {
                     i++;
 
