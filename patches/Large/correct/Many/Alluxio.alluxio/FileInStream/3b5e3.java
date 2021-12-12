diff --git a/core/client/fs/src/main/java/alluxio/client/file/FileInStream.java b/core/client/fs/src/main/java/alluxio/client/file/FileInStream.java
index aef527a..451a31d 100644
--- a/core/client/fs/src/main/java/alluxio/client/file/FileInStream.java
+++ b/core/client/fs/src/main/java/alluxio/client/file/FileInStream.java
@@ -63,7 +63,7 @@
       Configuration.getBoolean(PropertyKey.USER_FILE_PASSIVE_CACHE_ENABLED);
   private static final int UNINITIALIZED_BLOCK_INDEX = -1;
   private static final int EOF_DATA = -1;
-  private static final int EOF_BLOCK_ID = -1;
+  private static final long EOF_BLOCK_ID = -1;
 
   /** The instream options. */
   private final InStreamOptions mInStreamOptions;
@@ -201,7 +201,7 @@
 
   private int readInternal() throws IOException {
     if (remainingInternal() <= 0) {
-      return EOF_BLOCK_ID;
+      return EOF_DATA;
     }
     updateStreamsOnRead();
     Preconditions.checkState(mCurrentBlockInStream != null, PreconditionMessage.ERR_UNEXPECTED_EOF);
@@ -442,7 +442,8 @@
   }
 
   /**
-   * @return the current block id based on mBlockIndex, -1 if at the end of the file
+   * @return the current block id based on mBlockIndex, or {@link #EOF_BLOCK_ID} if at the end of
+   *         the file
    */
   private long getCurrentBlockId() {
     if (remainingInternal() <= 0) {
