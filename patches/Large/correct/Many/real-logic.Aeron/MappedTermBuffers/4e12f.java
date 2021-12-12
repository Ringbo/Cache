diff --git a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/buffer/MappedTermBuffers.java b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/buffer/MappedTermBuffers.java
index f7d0d23..17d5c17 100644
--- a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/buffer/MappedTermBuffers.java
+++ b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/buffer/MappedTermBuffers.java
@@ -136,7 +136,7 @@
     private MappedByteBuffer mapBufferFile(final FileChannel channel, final long bufferSize)
         throws IOException
     {
-        reset(channel, logTemplate, logBufferLength);
+        reset(channel, logTemplate, bufferSize);
 
         return channel.map(READ_WRITE, 0, bufferSize);
     }
