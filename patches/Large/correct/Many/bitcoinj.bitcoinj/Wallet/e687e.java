diff --git a/core/src/main/java/com/google/bitcoin/core/Wallet.java b/core/src/main/java/com/google/bitcoin/core/Wallet.java
index 72e9493..e0facf8 100644
--- a/core/src/main/java/com/google/bitcoin/core/Wallet.java
+++ b/core/src/main/java/com/google/bitcoin/core/Wallet.java
@@ -765,7 +765,7 @@
      * the double spent inputs are not ours. Returns the pending tx that was double spent or null if none found.
      */
     private boolean checkForDoubleSpendAgainstPending(Transaction tx, boolean takeAction) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         // Compile a set of outpoints that are spent by tx.
         HashSet<TransactionOutPoint> outpoints = new HashSet<TransactionOutPoint>();
         for (TransactionInput input : tx.getInputs()) {
@@ -824,7 +824,7 @@
 
     private void receive(Transaction tx, StoredBlock block, BlockChain.NewBlockType blockType) throws VerificationException {
         // Runs in a peer thread.
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         BigInteger prevBalance = getBalance();
         Sha256Hash txHash = tx.getHash();
         boolean bestChain = blockType == BlockChain.NewBlockType.BEST_CHAIN;
@@ -989,7 +989,7 @@
      * re-org. Places the tx into the right pool, handles coinbase transactions, handles double-spends and so on.
      */
     private void processTxFromBestChain(Transaction tx) throws VerificationException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         checkState(!pending.containsKey(tx.getHash()));
 
         // This TX may spend our existing outputs even though it was not pending. This can happen in unit
@@ -1049,7 +1049,7 @@
      * @param fromChain If true, the tx appeared on the current best chain, if false it was pending.
      */
     private void updateForSpends(Transaction tx, boolean fromChain) throws VerificationException {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         if (fromChain)
             checkState(!pending.containsKey(tx.getHash()));
         for (TransactionInput input : tx.getInputs()) {
@@ -1160,7 +1160,7 @@
      * If the owned transactions outputs are not all marked as spent, and it's in the spent map, move it.
      */
     private void maybeMovePool(Transaction tx, String context) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         if (tx.isEveryOwnedOutputSpent(this)) {
             // There's nothing left I can spend in this transaction.
             if (unspent.remove(tx.getHash()) != null) {
@@ -1330,7 +1330,7 @@
      * Adds the given transaction to the given pools and registers a confidence change listener on it.
      */
     private void addWalletTransaction(Pool pool, Transaction tx) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         switch (pool) {
         case UNSPENT:
             checkState(unspent.put(tx.getHash(), tx) == null);
@@ -1881,7 +1881,7 @@
     }
 
     private LinkedList<TransactionOutput> calculateSpendCandidates(boolean excludeImmatureCoinbases) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         LinkedList<TransactionOutput> candidates = Lists.newLinkedList();
         for (Transaction tx : Iterables.concat(unspent.values(), pending.values())) {
             // Do not try and spend coinbases that were mined too recently, the protocol forbids it.
@@ -2139,7 +2139,7 @@
 
     private void toStringHelper(StringBuilder builder, Map<Sha256Hash, Transaction> transactionMap,
                                 AbstractBlockChain chain) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         for (Transaction tx : transactionMap.values()) {
             try {
                 builder.append("Sends ");
@@ -2838,7 +2838,7 @@
 
     // Runs any balance futures in the user code thread.
     private void checkBalanceFuturesLocked(@Nullable BigInteger avail) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         BigInteger estimated = null;
         final ListIterator<BalanceFutureRequest> it = balanceFutureRequests.listIterator();
         while (it.hasNext()) {
@@ -2937,7 +2937,7 @@
     // anything and hold no locks).
 
     private void queueOnTransactionConfidenceChanged(final Transaction tx) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         for (final ListenerRegistration<WalletEventListener> registration : eventListeners) {
             registration.executor.execute(new Runnable() {
                 @Override
@@ -2951,7 +2951,7 @@
     private void maybeQueueOnWalletChanged() {
         // Don't invoke the callback in some circumstances, eg, whilst we are re-organizing or fiddling with
         // transactions due to a new block arriving. It will be called later instead.
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         checkState(onWalletChangedSuppressions >= 0);
         if (onWalletChangedSuppressions > 0) return;
         for (final ListenerRegistration<WalletEventListener> registration : eventListeners) {
@@ -2965,7 +2965,7 @@
     }
 
     private void queueOnCoinsReceived(final Transaction tx, final BigInteger balance, final BigInteger newBalance) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         for (final ListenerRegistration<WalletEventListener> registration : eventListeners) {
             registration.executor.execute(new Runnable() {
                 @Override
@@ -2977,7 +2977,7 @@
     }
 
     private void queueOnCoinsSent(final Transaction tx, final BigInteger prevBalance, final BigInteger newBalance) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         for (final ListenerRegistration<WalletEventListener> registration : eventListeners) {
             registration.executor.execute(new Runnable() {
                 @Override
@@ -2989,7 +2989,7 @@
     }
 
     private void queueOnReorganize() {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         checkState(insideReorg);
         for (final ListenerRegistration<WalletEventListener> registration : eventListeners) {
             registration.executor.execute(new Runnable() {
@@ -3002,7 +3002,7 @@
     }
 
     private void queueOnKeysAdded(final List<ECKey> keys) {
-        checkState(lock.isLocked());
+        checkState(lock.isHeldByCurrentThread());
         for (final ListenerRegistration<WalletEventListener> registration : eventListeners) {
             registration.executor.execute(new Runnable() {
                 @Override
