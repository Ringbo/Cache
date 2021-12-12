diff --git a/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/Eth62.java b/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/Eth62.java
index 38ae9c6..b94614b 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/Eth62.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/eth/handler/Eth62.java
@@ -359,7 +359,7 @@
             long blockNumber = max(0, bestNumber - FORK_COVER_BATCH_SIZE);
             sendGetBlockHeaders(blockNumber, FORK_COVER_BATCH_SIZE);
         } else {
-            sendGetBlockHeaders(syncManager.getGapBlock().getHash(), FORK_COVER_BATCH_SIZE, 1, true);
+            sendGetBlockHeaders(syncManager.getGapBlock().getHash(), FORK_COVER_BATCH_SIZE, 0, true);
         }
     }
 
