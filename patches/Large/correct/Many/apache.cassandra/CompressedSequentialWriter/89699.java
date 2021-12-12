diff --git a/src/java/org/apache/cassandra/io/compress/CompressedSequentialWriter.java b/src/java/org/apache/cassandra/io/compress/CompressedSequentialWriter.java
index f9af748..af8ec26 100644
--- a/src/java/org/apache/cassandra/io/compress/CompressedSequentialWriter.java
+++ b/src/java/org/apache/cassandra/io/compress/CompressedSequentialWriter.java
@@ -139,7 +139,7 @@
         int chunkSize = (int) (metadataWriter.chunkOffsetBy(realMark.nextChunkIndex) - chunkOffset - 4);
 
         out.seek(chunkOffset);
-        out.read(compressed, 0, chunkSize);
+        out.readFully(compressed, 0, chunkSize);
 
         // decompress data chunk and store its length
         int validBytes = Snappy.rawUncompress(compressed, 0, chunkSize, buffer, 0);
