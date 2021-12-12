diff --git a/core/src/main/java/com/google/bitcoin/core/MemoryPool.java b/core/src/main/java/com/google/bitcoin/core/MemoryPool.java
index 0d74ab5..bb22917 100644
--- a/core/src/main/java/com/google/bitcoin/core/MemoryPool.java
+++ b/core/src/main/java/com/google/bitcoin/core/MemoryPool.java
@@ -266,7 +266,7 @@
     }
 
     private void markBroadcast(PeerAddress byPeer, Transaction tx) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         final TransactionConfidence confidence = tx.getConfidence();
         confidence.markBroadcastBy(byPeer);
         confidence.queueListeners(TransactionConfidence.Listener.ChangeReason.SEEN_PEERS);
