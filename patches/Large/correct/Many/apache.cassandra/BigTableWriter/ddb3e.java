diff --git a/src/java/org/apache/cassandra/io/sstable/format/big/BigTableWriter.java b/src/java/org/apache/cassandra/io/sstable/format/big/BigTableWriter.java
index 110106c..19e29a8 100644
--- a/src/java/org/apache/cassandra/io/sstable/format/big/BigTableWriter.java
+++ b/src/java/org/apache/cassandra/io/sstable/format/big/BigTableWriter.java
@@ -208,7 +208,7 @@
         if (rowSize > DatabaseDescriptor.getCompactionLargePartitionWarningThreshold())
         {
             String keyString = metadata.getKeyValidator().getString(key.getKey());
-            logger.warn("Writing large partition {}/{}:{} ({}) to sstable {}", metadata.ksName, metadata.cfName, keyString, rowSize, FBUtilities.prettyPrintMemory(rowSize), getFilename());
+            logger.warn("Writing large partition {}/{}:{} ({}) to sstable {}", metadata.ksName, metadata.cfName, keyString, FBUtilities.prettyPrintMemory(rowSize), getFilename());
         }
     }
 
