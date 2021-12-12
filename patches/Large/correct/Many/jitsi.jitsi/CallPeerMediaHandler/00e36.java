diff --git a/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandler.java b/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandler.java
index 8b1dbba..b15f550 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandler.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandler.java
@@ -722,7 +722,7 @@
         }
 
         //fail if all devices were inactive
-        if(mediaDescs.size() == 0)
+        if(mediaDescs.isEmpty())
         {
             ProtocolProviderServiceSipImpl
                 .throwOperationFailedException(
@@ -1162,7 +1162,7 @@
         throws OperationFailedException,
                IllegalArgumentException
     {
-        Vector<MediaDescription> remoteDescriptions = SdpUtils
+        List<MediaDescription> remoteDescriptions = SdpUtils
                         .extractMediaDescriptions(offer);
 
         // prepare to generate answers to all the incoming descriptions
@@ -1421,7 +1421,7 @@
     {
         this.remoteSess = answer;
 
-        Vector<MediaDescription> remoteDescriptions
+        List<MediaDescription> remoteDescriptions
             = SdpUtils.extractMediaDescriptions(answer);
 
         this.setCallInfoURL(SdpUtils.getCallInfoURL(answer));
@@ -1454,7 +1454,7 @@
             {
                 //remote party must have messed up our SDP. throw an exception.
                 ProtocolProviderServiceSipImpl.throwOperationFailedException(
-                    "Remote party sent an invlid SDP answer.",
+                    "Remote party sent an invalid SDP answer.",
                      OperationFailedException.ILLEGAL_ARGUMENT, null, logger);
             }
 
