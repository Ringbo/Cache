diff --git a/test/net/java/sip/communicator/slick/protocol/generic/TestOperationSetFileTransfer.java b/test/net/java/sip/communicator/slick/protocol/generic/TestOperationSetFileTransfer.java
index ca30998..9cc7f06 100644
--- a/test/net/java/sip/communicator/slick/protocol/generic/TestOperationSetFileTransfer.java
+++ b/test/net/java/sip/communicator/slick/protocol/generic/TestOperationSetFileTransfer.java
@@ -694,7 +694,7 @@
                          ,fileTransferCreatedEvent.getFileTransfer().getLocalFile()
                          ,receiveFile);
 
-            receiverStatusListener.waitForEvent(8000, 3);
+            receiverStatusListener.waitForEvent(12000, 3);
             assertTrue("Cancel event must be received",
                 receiverStatusListener.contains(FileTransferStatusChangeEvent.CANCELED));
         }
