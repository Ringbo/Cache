diff --git a/core/client/src/main/java/alluxio/client/block/LocalBlockInStream.java b/core/client/src/main/java/alluxio/client/block/LocalBlockInStream.java
index 0f20c1a..79ae72d 100644
--- a/core/client/src/main/java/alluxio/client/block/LocalBlockInStream.java
+++ b/core/client/src/main/java/alluxio/client/block/LocalBlockInStream.java
@@ -67,7 +67,7 @@
       mReader = mCloser.register(new LocalFileBlockReader(result.getBlockPath()));
     } catch (BlockDoesNotExistException e) {
       mCloser.close();
-      throw new IOException(ExceptionMessage.BLOCK_NOT_LOCALLY_AVAILABLE.getMessage(mBlockId));
+      throw new IOException(ExceptionMessage.BLOCK_NOT_LOCALLY_AVAILABLE.getMessage(mBlockId), e);
     } catch (AlluxioException e) {
       mCloser.close();
       throw new IOException(e);
