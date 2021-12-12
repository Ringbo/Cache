diff --git a/core/src/main/java/com/google/bitcoin/core/FullPrunedBlockChain.java b/core/src/main/java/com/google/bitcoin/core/FullPrunedBlockChain.java
index 6a1bbb0..96efae0 100644
--- a/core/src/main/java/com/google/bitcoin/core/FullPrunedBlockChain.java
+++ b/core/src/main/java/com/google/bitcoin/core/FullPrunedBlockChain.java
@@ -124,7 +124,7 @@
     @Override
     protected TransactionOutputChanges connectTransactions(int height, Block block)
             throws VerificationException, BlockStoreException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         if (block.transactions == null)
             throw new RuntimeException("connectTransactions called with Block that didn't have transactions!");
         if (!params.passesCheckpoint(height, block.getHash()))
@@ -255,7 +255,7 @@
      */
     protected synchronized TransactionOutputChanges connectTransactions(StoredBlock newBlock)
             throws VerificationException, BlockStoreException, PrunedException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         if (!params.passesCheckpoint(newBlock.getHeight(), newBlock.getHeader().getHash()))
             throw new VerificationException("Block failed checkpoint lockin at " + newBlock.getHeight());
         
@@ -392,7 +392,7 @@
      */
     @Override
     protected void disconnectTransactions(StoredBlock oldBlock) throws PrunedException, BlockStoreException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         blockStore.beginDatabaseBatchWrite();
         try {
             StoredUndoableBlock undoBlock = blockStore.getUndoBlock(oldBlock.getHeader().getHash());
@@ -413,7 +413,7 @@
 
     @Override
     protected void doSetChainHead(StoredBlock chainHead) throws BlockStoreException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         blockStore.setVerifiedChainHead(chainHead);
         blockStore.commitDatabaseBatchWrite();
     }
@@ -425,7 +425,7 @@
 
     @Override
     protected StoredBlock getStoredBlockInCurrentScope(Sha256Hash hash) throws BlockStoreException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         return blockStore.getOnceUndoableStoredBlock(hash);
     }
 }
