diff --git a/core/src/main/java/com/google/bitcoin/core/PeerGroup.java b/core/src/main/java/com/google/bitcoin/core/PeerGroup.java
index 9180ce0..e8b475b 100644
--- a/core/src/main/java/com/google/bitcoin/core/PeerGroup.java
+++ b/core/src/main/java/com/google/bitcoin/core/PeerGroup.java
@@ -884,7 +884,7 @@
     }
 
     private void setupPingingForNewPeer(final Peer peer) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         if (peer.getPeerVersionMessage().clientVersion < Pong.MIN_PROTOCOL_VERSION)
             return;
         if (getPingIntervalMsec() <= 0)
@@ -930,7 +930,7 @@
     /** Returns true if at least one peer received an inv. */
     private boolean announcePendingWalletTransactions(List<Wallet> announceWallets,
                                                       List<Peer> announceToPeers) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         // Build up an inv announcing the hashes of all pending transactions in all our wallets.
         InventoryMessage inv = new InventoryMessage(params);
         for (Wallet w : announceWallets) {
