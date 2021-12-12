diff --git a/test/unit/org/apache/cassandra/io/compress/CompressorTest.java b/test/unit/org/apache/cassandra/io/compress/CompressorTest.java
index ba53718..1e24d03 100644
--- a/test/unit/org/apache/cassandra/io/compress/CompressorTest.java
+++ b/test/unit/org/apache/cassandra/io/compress/CompressorTest.java
@@ -81,7 +81,7 @@
 
         // need byte[] representation which direct buffers don't have
         byte[] compressedBytes = new byte[compressed.capacity()];
-        ByteBufferUtil.arrayCopy(compressed, outOffset, compressedBytes, outOffset, compressed.capacity() - outOffset);
+        ByteBufferUtil.arrayCopy(compressed, outOffset, compressedBytes, outOffset, compressed.limit() - outOffset);
 
         final int decompressedLength = compressor.uncompress(compressedBytes, outOffset, compressed.remaining(), restored, restoreOffset);
 
