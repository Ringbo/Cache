diff --git a/src/java/org/apache/cassandra/io/sstable/SSTableSimpleUnsortedWriter.java b/src/java/org/apache/cassandra/io/sstable/SSTableSimpleUnsortedWriter.java
index 8d0b01b..c69a5a3 100644
--- a/src/java/org/apache/cassandra/io/sstable/SSTableSimpleUnsortedWriter.java
+++ b/src/java/org/apache/cassandra/io/sstable/SSTableSimpleUnsortedWriter.java
@@ -63,7 +63,7 @@
                                        int bufferSizeInMB) throws IOException
     {
         super(directory, new CFMetaData(keyspace, columnFamily, subComparator == null ? ColumnFamilyType.Standard : ColumnFamilyType.Super, comparator, subComparator));
-        this.bufferSize = bufferSizeInMB * 1024 * 1024;
+        this.bufferSize = bufferSizeInMB * 1024L * 1024L;
     }
 
     protected void writeRow(DecoratedKey key, ColumnFamily columnFamily) throws IOException
