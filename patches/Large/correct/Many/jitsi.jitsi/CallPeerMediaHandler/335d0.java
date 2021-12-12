diff --git a/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandler.java b/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandler.java
index 5ed88e7..5bffcf5 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandler.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandler.java
@@ -505,7 +505,8 @@
                             .or(MediaDirection.SENDONLY));
                 audioStream.setMute(locallyOnHold);
             }
-            if(videoStream != null)
+            if(videoStream != null
+                && videoStream.getDirection() != MediaDirection.INACTIVE)
             {
                 videoStream.setDirection(videoStream.getDirection()
                             .or(MediaDirection.SENDONLY));
