diff --git a/core/client/src/main/java/alluxio/client/block/BufferedBlockInStream.java b/core/client/src/main/java/alluxio/client/block/BufferedBlockInStream.java
index 3bc88b9..83e3790 100644
--- a/core/client/src/main/java/alluxio/client/block/BufferedBlockInStream.java
+++ b/core/client/src/main/java/alluxio/client/block/BufferedBlockInStream.java
@@ -110,7 +110,7 @@
     }
 
     int toRead = (int) Math.min(len, remaining());
-    if (mBufferIsValid && mBuffer.remaining() > toRead) { // data is fully contained in the buffer
+    if (mBufferIsValid && mBuffer.remaining() >= toRead) { // data is fully contained in the buffer
       mBuffer.get(b, off, toRead);
       mPos += toRead;
       mBlockIsRead = true;
