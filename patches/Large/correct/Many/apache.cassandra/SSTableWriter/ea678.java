diff --git a/src/java/org/apache/cassandra/io/sstable/SSTableWriter.java b/src/java/org/apache/cassandra/io/sstable/SSTableWriter.java
index 7730844..a2c4d0d 100644
--- a/src/java/org/apache/cassandra/io/sstable/SSTableWriter.java
+++ b/src/java/org/apache/cassandra/io/sstable/SSTableWriter.java
@@ -195,7 +195,7 @@
     {
         DataOutputStream out = new DataOutputStream(new FileOutputStream(desc.filenameFor(SSTable.COMPONENT_STATS)));
         EstimatedHistogram.serializer.serialize(rowSizes, out);
-        EstimatedHistogram.serializer.serialize(rowSizes, out);
+        EstimatedHistogram.serializer.serialize(columnnCounts, out);
         out.close();
     }
 
