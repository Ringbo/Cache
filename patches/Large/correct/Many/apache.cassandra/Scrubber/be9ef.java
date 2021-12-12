diff --git a/src/java/org/apache/cassandra/db/compaction/Scrubber.java b/src/java/org/apache/cassandra/db/compaction/Scrubber.java
index e5bcd25..ea10855 100644
--- a/src/java/org/apache/cassandra/db/compaction/Scrubber.java
+++ b/src/java/org/apache/cassandra/db/compaction/Scrubber.java
@@ -199,7 +199,7 @@
                         throw new IOError(new IOException("Impossible row size (greater than file length): " + dataSize));
 
                     if (dataStart != dataStartFromIndex)
-                        outputHandler.warn(String.format("Data file row position %d differs from index file row position %d", dataStart, dataSizeFromIndex));
+                        outputHandler.warn(String.format("Data file row position %d differs from index file row position %d", dataStart, dataStartFromIndex));
 
                     if (dataSize != dataSizeFromIndex)
                         outputHandler.warn(String.format("Data file row size %d differs from index file row size %d", dataSize, dataSizeFromIndex));
