diff --git a/presto-orc/src/main/java/com/facebook/presto/orc/OrcOutputBuffer.java b/presto-orc/src/main/java/com/facebook/presto/orc/OrcOutputBuffer.java
index d74374d..03ba598 100644
--- a/presto-orc/src/main/java/com/facebook/presto/orc/OrcOutputBuffer.java
+++ b/presto-orc/src/main/java/com/facebook/presto/orc/OrcOutputBuffer.java
@@ -226,7 +226,7 @@
         // Write huge chunks direct to OutputStream
         if (length >= DIRECT_FLUSH_SIZE) {
             flushBufferToOutputStream();
-            writeDirectlyToOutputStream((byte[]) source.getBase(), sourceIndex + (int) (slice.getAddress() - ARRAY_BYTE_BASE_OFFSET), length);
+            writeDirectlyToOutputStream((byte[]) source.getBase(), sourceIndex + (int) (source.getAddress() - ARRAY_BYTE_BASE_OFFSET), length);
             bufferOffset += length;
         }
         else {
