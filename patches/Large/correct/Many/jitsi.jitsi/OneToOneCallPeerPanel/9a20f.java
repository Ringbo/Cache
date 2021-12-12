diff --git a/src/net/java/sip/communicator/impl/gui/main/call/OneToOneCallPeerPanel.java b/src/net/java/sip/communicator/impl/gui/main/call/OneToOneCallPeerPanel.java
index 04a3678..e35d772 100644
--- a/src/net/java/sip/communicator/impl/gui/main/call/OneToOneCallPeerPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/call/OneToOneCallPeerPanel.java
@@ -598,16 +598,20 @@
 
     /**
      * Sets the state of the contained call peer by specifying the
-     * state name and icon.
+     * state name.
      *
-     * @param peerState the peer state
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
-        this.callStatusLabel.setText(state);
+        this.callStatusLabel.setText(stateString);
 
-        if (peerState == CallPeerState.CONNECTED)
+        if (newState == CallPeerState.CONNECTED
+            && !CallPeerState.isOnHold(oldState))
         {
             initSecurityStatusLabel();
         }
