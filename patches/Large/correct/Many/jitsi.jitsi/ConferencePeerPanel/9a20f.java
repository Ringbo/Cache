diff --git a/src/net/java/sip/communicator/impl/gui/main/call/conference/ConferencePeerPanel.java b/src/net/java/sip/communicator/impl/gui/main/call/conference/ConferencePeerPanel.java
index 2e47a68..a5e285e 100644
--- a/src/net/java/sip/communicator/impl/gui/main/call/conference/ConferencePeerPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/call/conference/ConferencePeerPanel.java
@@ -385,11 +385,15 @@
      * Sets the state of the contained call peer by specifying the
      * state name.
      *
-     * @param state the state of the contained call peer
+     * @param oldState the previous state of the peer
+     * @param newState the new state of the peer
+     * @param stateString the state of the contained call peer
      */
-    public void setPeerState(CallPeerState peerState, String state)
+    public void setPeerState(   CallPeerState oldState,
+                                CallPeerState newState,
+                                String stateString)
     {
-        this.setParticipantState(state);
+        this.setParticipantState(stateString);
     }
 
     /**
