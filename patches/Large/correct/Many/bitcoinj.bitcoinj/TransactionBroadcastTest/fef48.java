diff --git a/core/src/test/java/org/bitcoinj/core/TransactionBroadcastTest.java b/core/src/test/java/org/bitcoinj/core/TransactionBroadcastTest.java
index f9fc0c9..6706672 100644
--- a/core/src/test/java/org/bitcoinj/core/TransactionBroadcastTest.java
+++ b/core/src/test/java/org/bitcoinj/core/TransactionBroadcastTest.java
@@ -72,7 +72,7 @@
     public void fourPeers() throws Exception {
         InboundMessageQueuer[] channels = { connectPeer(1), connectPeer(2), connectPeer(3), connectPeer(4) };
         Transaction tx = new Transaction(params);
-        TransactionBroadcast broadcast = new TransactionBroadcast(peerGroup, tx);
+        TransactionBroadcast broadcast = new TransactionBroadcast(peerGroup, blockChain.getContext(), tx);
         ListenableFuture<Transaction> future = broadcast.broadcast();
         assertFalse(future.isDone());
         // We expect two peers to receive a tx message, and at least one of the others must announce for the future to
