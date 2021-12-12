diff --git a/src/net/java/sip/communicator/impl/media/CallSessionImpl.java b/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
index 5b8be00..0611df1 100644
--- a/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
+++ b/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
@@ -1739,8 +1739,7 @@
             mediaDescs.add(am);
         }
         //--------Video media description
-        if(mediaServCallback.getDeviceConfiguration().isVideoCaptureSupported()
-                && supportedVideoEncodings.length> 0)
+        if(supportedVideoEncodings.length> 0)
         {
             //"m=video 22222 RTP/AVP 34";
             MediaDescription vm
@@ -1765,7 +1764,9 @@
 
             byte onHold = this.onHold;
 
-            if (!mediaControl.isLocalVideoAllowed())
+            if (!mediaServCallback.getDeviceConfiguration()
+                    .isVideoCaptureSupported() ||
+                 !mediaControl.isLocalVideoAllowed())
             {
                 /* We don't have anything to send. */
                 onHold |= ON_HOLD_REMOTELY;
