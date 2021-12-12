diff --git a/src/java/org/apache/cassandra/io/sstable/SSTableSimpleWriter.java b/src/java/org/apache/cassandra/io/sstable/SSTableSimpleWriter.java
index 5849465..87c8e33 100644
--- a/src/java/org/apache/cassandra/io/sstable/SSTableSimpleWriter.java
+++ b/src/java/org/apache/cassandra/io/sstable/SSTableSimpleWriter.java
@@ -71,7 +71,7 @@
         {
             if (currentKey != null)
                 writeRow(currentKey, columnFamily);
-            writer.close(true);
+            writer.close();
         }
         catch (FSError e)
         {
