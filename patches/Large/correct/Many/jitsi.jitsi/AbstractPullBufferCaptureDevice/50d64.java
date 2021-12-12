diff --git a/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractPullBufferCaptureDevice.java b/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractPullBufferCaptureDevice.java
index 233fee1..b3d9923 100644
--- a/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractPullBufferCaptureDevice.java
+++ b/src/net/java/sip/communicator/impl/neomedia/jmfext/media/protocol/AbstractPullBufferCaptureDevice.java
@@ -348,7 +348,7 @@
      */
     public PullBufferStream[] getStreams()
     {
-        return impl.getStreams(AbstractPullBufferStream.class);
+        return impl.getStreams(PullBufferStream.class);
     }
 
     /**
