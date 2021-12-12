diff --git a/core/src/main/java/org/bitcoinj/core/Wallet.java b/core/src/main/java/org/bitcoinj/core/Wallet.java
index 7048e3c..d8f2a45 100644
--- a/core/src/main/java/org/bitcoinj/core/Wallet.java
+++ b/core/src/main/java/org/bitcoinj/core/Wallet.java
@@ -2088,7 +2088,7 @@
                     log.warn("  offending input is input {}", tx.getInputs().indexOf(input));
                     log.warn("{}: {}", tx.getHash(), Utils.HEX.encode(tx.unsafeBitcoinSerialize()));
                     Transaction other = output.getSpentBy().getParentTransaction();
-                    log.warn("{}: {}", other.getHash(), Utils.HEX.encode(tx.unsafeBitcoinSerialize()));
+                    log.warn("{}: {}", other.getHash(), Utils.HEX.encode(other.unsafeBitcoinSerialize()));
                 }
             } else if (result == TransactionInput.ConnectionResult.SUCCESS) {
                 // Otherwise we saw a transaction spend our coins, but we didn't try and spend them ourselves yet.
