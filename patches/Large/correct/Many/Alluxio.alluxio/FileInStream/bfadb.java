diff --git a/core/client/src/main/java/alluxio/client/file/FileInStream.java b/core/client/src/main/java/alluxio/client/file/FileInStream.java
index 3c33650..7c6337a 100644
--- a/core/client/src/main/java/alluxio/client/file/FileInStream.java
+++ b/core/client/src/main/java/alluxio/client/file/FileInStream.java
@@ -613,7 +613,7 @@
     // Do not set the buffer size too small to avoid slowing down seek by too much.
     byte[] buffer = new byte[Math.min((int) mSeekBufferSizeBytes, (int) len)];
     do {
-      int bytesRead = read(buffer);
+      int bytesRead = read(buffer, 0, (int) Math.min(buffer.length, len));
       Preconditions.checkState(bytesRead > 0, PreconditionMessage.ERR_UNEXPECTED_EOF);
       len -= bytesRead;
     } while (len > 0);
