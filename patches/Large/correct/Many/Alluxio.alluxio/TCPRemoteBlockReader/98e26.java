diff --git a/clients/unshaded/src/main/java/tachyon/client/tcp/TCPRemoteBlockReader.java b/clients/unshaded/src/main/java/tachyon/client/tcp/TCPRemoteBlockReader.java
index 2a11f6d..66fb717 100644
--- a/clients/unshaded/src/main/java/tachyon/client/tcp/TCPRemoteBlockReader.java
+++ b/clients/unshaded/src/main/java/tachyon/client/tcp/TCPRemoteBlockReader.java
@@ -68,7 +68,7 @@
       LOG.info("Data " + blockId + " from remote machine " + address + " received");
 
       if (recvMsg.getStatus() != RPCResponse.Status.SUCCESS) {
-        LOG.error("Error in response for blockId: " + recvMsg.getBlockId() + " message: "
+        LOG.warn("Error in response for blockId: " + recvMsg.getBlockId() + " message: "
             + recvMsg.getStatus().getMessage());
         return null;
       }
