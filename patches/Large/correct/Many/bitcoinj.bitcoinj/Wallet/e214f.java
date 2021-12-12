diff --git a/core/src/main/java/org/bitcoinj/core/Wallet.java b/core/src/main/java/org/bitcoinj/core/Wallet.java
index cb7d1b8..51f256a 100644
--- a/core/src/main/java/org/bitcoinj/core/Wallet.java
+++ b/core/src/main/java/org/bitcoinj/core/Wallet.java
@@ -3977,7 +3977,7 @@
      *
      * @param vUTXOProvider The UTXO provider.
      */
-    public void setUTXOProvider(@Nullable FullPrunedBlockStore vUTXOProvider) {
+    public void setUTXOProvider(@Nullable UTXOProvider vUTXOProvider) {
         lock.lock();
         try {
             checkArgument(vUTXOProvider == null ? true : vUTXOProvider.getParams().equals(params));
