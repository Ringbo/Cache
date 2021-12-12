diff --git a/src/main/java/tachyon/client/FileOutStream.java b/src/main/java/tachyon/client/FileOutStream.java
index 2db178a..ae8ced2 100644
--- a/src/main/java/tachyon/client/FileOutStream.java
+++ b/src/main/java/tachyon/client/FileOutStream.java
@@ -134,10 +134,10 @@
         int tLen = len;
         int tOff = off;
         while (tLen > 0) {
-          if (mCurrentBlockLeftByte == 0) {
+          if (mCurrentBlockLeftByte <= 0 || mCurrentBlockOutStream == null ) {
             getNextBlock();
           }
-          if (mCurrentBlockLeftByte > tLen) {
+          if (mCurrentBlockLeftByte >= tLen) {
             mCurrentBlockOutStream.write(b, tOff, tLen);
             mCurrentBlockLeftByte -= tLen;
             mCachedBytes += tLen;
