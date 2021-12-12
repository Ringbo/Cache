diff --git a/src/net/java/sip/communicator/impl/protocol/sip/CallSipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/CallSipImpl.java
index 2853602..f989673 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/CallSipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/CallSipImpl.java
@@ -451,7 +451,8 @@
             serverTran.sendResponse(response);
 
             if(serverTran instanceof SIPTransaction
-                && !((SIPTransaction)serverTran).isReliable())
+                && !((SIPTransaction)serverTran).isReliable()
+                && peer.getState().equals(CallPeerState.INCOMING_CALL))
             {
                 final Timer timer = new Timer();
                 CallPeerAdapter stateListener = new CallPeerAdapter()
