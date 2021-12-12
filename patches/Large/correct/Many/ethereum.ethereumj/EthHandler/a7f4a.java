diff --git a/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/EthHandler.java b/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/EthHandler.java
index b1cad64..423be3b 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/EthHandler.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/EthHandler.java
@@ -461,7 +461,7 @@
 
         if (newState == HASH_RETRIEVING) {
             syncStats.reset();
-            sendGetBlockHashesByNumber(blockchain.getBestBlock().getNumber(), maxHashesAsk);
+            sendGetBlockHashes();
         }
         if (newState == BLOCK_RETRIEVING) {
             syncStats.reset();
