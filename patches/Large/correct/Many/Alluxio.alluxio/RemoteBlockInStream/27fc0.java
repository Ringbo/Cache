diff --git a/core/client/src/main/java/alluxio/client/block/RemoteBlockInStream.java b/core/client/src/main/java/alluxio/client/block/RemoteBlockInStream.java
index dcd966a..a5bf996 100644
--- a/core/client/src/main/java/alluxio/client/block/RemoteBlockInStream.java
+++ b/core/client/src/main/java/alluxio/client/block/RemoteBlockInStream.java
@@ -78,7 +78,7 @@
       mLockId = result.getLockId();
     } catch (BlockDoesNotExistException e) {
       mCloser.close();
-      throw new IOException(ExceptionMessage.BLOCK_UNAVAILABLE.getMessage(blockId));
+      throw new IOException(ExceptionMessage.BLOCK_UNAVAILABLE.getMessage(blockId), e);
     } catch (AlluxioException e) {
       mCloser.close();
       throw new IOException(e);
