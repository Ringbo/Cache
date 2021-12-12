diff --git a/src/net/java/sip/communicator/service/protocol/AbstractCallPeer.java b/src/net/java/sip/communicator/service/protocol/AbstractCallPeer.java
index 90e01aa..115df8a 100644
--- a/src/net/java/sip/communicator/service/protocol/AbstractCallPeer.java
+++ b/src/net/java/sip/communicator/service/protocol/AbstractCallPeer.java
@@ -416,7 +416,8 @@
         fireCallPeerChangeEvent(
                 CallPeerChangeEvent.CALL_PEER_STATE_CHANGE,
                 oldState,
-                newState);
+                newState,
+                reason);
     }
 
     /**
