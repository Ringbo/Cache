diff --git a/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java b/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
index 5aafa59..15b7a43 100644
--- a/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
+++ b/core/src/main/java/com/google/bitcoin/core/AbstractBlockChain.java
@@ -399,7 +399,7 @@
     private void connectBlock(final Block block, StoredBlock storedPrev, boolean expensiveChecks,
                               @Nullable final List<Sha256Hash> filteredTxHashList,
                               @Nullable final Map<Sha256Hash, Transaction> filteredTxn) throws BlockStoreException, VerificationException, PrunedException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         boolean filtered = filteredTxHashList != null && filteredTxn != null;
         boolean fullBlock = block.transactions != null && !filtered;
         // If !filtered and !fullBlock then we have just a header.
@@ -576,7 +576,7 @@
      */
     private void handleNewBestChain(StoredBlock storedPrev, StoredBlock newChainHead, Block block, boolean expensiveChecks)
             throws BlockStoreException, VerificationException, PrunedException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         // This chain has overtaken the one we currently believe is best. Reorganize is required.
         //
         // Firstly, calculate the block at which the chain diverged. We only need to examine the
@@ -733,7 +733,7 @@
      * For each block in orphanBlocks, see if we can now fit it on top of the chain and if so, do so.
      */
     private void tryConnectingOrphans() throws VerificationException, BlockStoreException, PrunedException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         // For each block in our orphan list, try and fit it onto the head of the chain. If we succeed remove it
         // from the list and keep going. If we changed the head of the list at the end of the round try again until
         // we can't fit anything else on the top.
@@ -773,7 +773,7 @@
      * Throws an exception if the blocks difficulty is not correct.
      */
     private void checkDifficultyTransitions(StoredBlock storedPrev, Block nextBlock) throws BlockStoreException, VerificationException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         Block prev = storedPrev.getHeader();
         
         // Is this supposed to be a difficulty transition point?
@@ -842,7 +842,7 @@
     }
 
     private void checkTestnetDifficulty(StoredBlock storedPrev, Block prev, Block next) throws VerificationException, BlockStoreException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         // After 15th February 2012 the rules on the testnet change to avoid people running up the difficulty
         // and then leaving, making it too hard to mine a block. On non-difficulty transition points, easy
         // blocks are allowed if there has been a span of 20 minutes without one.
