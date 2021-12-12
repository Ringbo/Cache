diff --git a/core/src/main/java/org/bitcoinj/wallet/Wallet.java b/core/src/main/java/org/bitcoinj/wallet/Wallet.java
index 20b5d7d..2b349da 100644
--- a/core/src/main/java/org/bitcoinj/wallet/Wallet.java
+++ b/core/src/main/java/org/bitcoinj/wallet/Wallet.java
@@ -3226,14 +3226,14 @@
     @Deprecated
     public String toString(boolean includePrivateKeys, boolean includeTransactions, boolean includeExtensions,
             @Nullable AbstractBlockChain chain) {
-        return toString(includePrivateKeys, includeTransactions, includeExtensions, chain);
+        return toString(includePrivateKeys, null, includeTransactions, includeExtensions, chain);
     }
 
     /**
      * Formats the wallet as a human readable piece of text. Intended for debugging, the format is not meant to be
      * stable or human readable.
      * @param includePrivateKeys Whether raw private key data should be included.
-     * @param key for decrypting private key data for if the wallet is encrypted.
+     * @param aesKey for decrypting private key data for if the wallet is encrypted.
      * @param includeTransactions Whether to print transaction data.
      * @param includeExtensions Whether to print extension data.
      * @param chain If set, will be used to estimate lock times for block timelocked transactions.
