diff --git a/core/src/test/java/com/google/bitcoin/core/PeerTest.java b/core/src/test/java/com/google/bitcoin/core/PeerTest.java
index 6e3d80c..f539444 100644
--- a/core/src/test/java/com/google/bitcoin/core/PeerTest.java
+++ b/core/src/test/java/com/google/bitcoin/core/PeerTest.java
@@ -467,7 +467,7 @@
         inbound(peer, new Pong(pingMsg.getNonce()));
         elapsed = future.get();
         assertEquals(elapsed, peer.getLastPingTime());
-        assertEquals(14000, peer.getPingTime());
+        assertEquals(7250, peer.getPingTime());
     }
     
     private Message outbound() {
