diff --git a/test/unit/org/apache/cassandra/io/compress/CompressorTest.java b/test/unit/org/apache/cassandra/io/compress/CompressorTest.java
index 6018cc7..1d285ea4 100644
--- a/test/unit/org/apache/cassandra/io/compress/CompressorTest.java
+++ b/test/unit/org/apache/cassandra/io/compress/CompressorTest.java
@@ -80,7 +80,7 @@
 
         // need byte[] representation which direct buffers don't have
         byte[] compressedBytes = new byte[compressed.capacity()];
-        ByteBufferUtil.arrayCopy(compressed, outOffset, compressedBytes, outOffset, compressed.capacity() - outOffset);
+        ByteBufferUtil.arrayCopy(compressed, outOffset, compressedBytes, outOffset, compressed.limit() - outOffset);
 
         final int decompressedLength = compressor.uncompress(compressedBytes, outOffset, compressed.remaining(), restored, restoreOffset);
 
