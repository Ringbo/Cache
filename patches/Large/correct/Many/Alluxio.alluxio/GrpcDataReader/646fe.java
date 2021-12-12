diff --git a/core/client/fs/src/main/java/alluxio/client/block/stream/GrpcDataReader.java b/core/client/fs/src/main/java/alluxio/client/block/stream/GrpcDataReader.java
index af0a271..1c1b1ab 100644
--- a/core/client/fs/src/main/java/alluxio/client/block/stream/GrpcDataReader.java
+++ b/core/client/fs/src/main/java/alluxio/client/block/stream/GrpcDataReader.java
@@ -142,10 +142,10 @@
     }
     mPosToRead += buffer.readableBytes();
     try {
-      mStream.send(ReadRequest.newBuilder().setOffsetReceived(mPosToRead).build());
+      mStream.send(mReadRequest.toBuilder().setOffsetReceived(mPosToRead).build());
     } catch (Exception e) {
       // nothing is done as the receipt is sent at best effort
-      LOG.warn("Failed to send receipt of data to worker {} for request {}: {}.", mAddress,
+      LOG.debug("Failed to send receipt of data to worker {} for request {}: {}.", mAddress,
           mReadRequest, e.getMessage());
     }
     Preconditions.checkState(mPosToRead - mReadRequest.getOffset() <= mReadRequest.getLength());
