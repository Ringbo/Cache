diff --git a/core/src/main/java/org/bitcoinj/wallet/Wallet.java b/core/src/main/java/org/bitcoinj/wallet/Wallet.java
index 26dd685..7b779a8 100644
--- a/core/src/main/java/org/bitcoinj/wallet/Wallet.java
+++ b/core/src/main/java/org/bitcoinj/wallet/Wallet.java
@@ -4640,7 +4640,7 @@
                     // Only add long (at least 64 bit) data to the bloom filter.
                     // If any long constants become popular in scripts, we will need logic
                     // here to exclude them.
-                    if (!chunk.isOpCode() && chunk.data.length >= MINIMUM_BLOOM_DATA_LENGTH) {
+                    if (!chunk.isOpCode() && (chunk.data != null) && chunk.data.length >= MINIMUM_BLOOM_DATA_LENGTH) {
                         filter.insert(chunk.data);
                     }
                 }
