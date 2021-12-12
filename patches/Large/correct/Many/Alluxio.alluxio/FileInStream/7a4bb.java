diff --git a/core/client-internal/src/main/java/alluxio/client/file/FileInStream.java b/core/client-internal/src/main/java/alluxio/client/file/FileInStream.java
index d9587e5..3f8c00e 100644
--- a/core/client-internal/src/main/java/alluxio/client/file/FileInStream.java
+++ b/core/client-internal/src/main/java/alluxio/client/file/FileInStream.java
@@ -286,11 +286,11 @@
    */
   private long getCurrentBlockSize() {
     // If there is only one block in this file.
-    if (mFileLength < mBlockSize) {
+    if (mFileLength <= mBlockSize) {
       return mFileLength;
     }
     // If we are not in the last block, return the block size, else return size of the last block.
-    if (mFileLength - mPos < mBlockSize) {
+    if (mFileLength - mPos >= mBlockSize) {
       return mBlockSize;
     } else {
       return mFileLength % mBlockSize;
