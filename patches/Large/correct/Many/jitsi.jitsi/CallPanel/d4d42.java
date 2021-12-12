diff --git a/src/net/java/sip/communicator/impl/gui/main/call/CallPanel.java b/src/net/java/sip/communicator/impl/gui/main/call/CallPanel.java
index 0302303..95c3d19 100644
--- a/src/net/java/sip/communicator/impl/gui/main/call/CallPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/call/CallPanel.java
@@ -268,7 +268,7 @@
         videoButton = new LocalVideoButton(call);
         showHideVideoButton = new ShowHideVideoButton(call);
 
-        showHideVideoButton.setPeerRenderer(((OneToOneCallPanel) callPanel)
+        showHideVideoButton.setPeerRenderer(((CallRenderer) callPanel)
             .getCallPeerRenderer(call.getCallPeers().next()));
 
         // When the local video is enabled/disabled we ensure that the show/hide
