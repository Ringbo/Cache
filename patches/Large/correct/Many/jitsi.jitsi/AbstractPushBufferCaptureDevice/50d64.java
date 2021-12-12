diff --git a/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractPushBufferCaptureDevice.java b/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractPushBufferCaptureDevice.java
index 9afb664..213ff3e 100644
--- a/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractPushBufferCaptureDevice.java
+++ b/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractPushBufferCaptureDevice.java
@@ -369,7 +369,7 @@
      */
     public PushBufferStream[] getStreams()
     {
-        return impl.getStreams(AbstractPushBufferStream.class);
+        return impl.getStreams(PushBufferStream.class);
     }
 
     /**
