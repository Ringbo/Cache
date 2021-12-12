diff --git a/ethereumj-core/src/main/java/org/ethereum/sync/SyncManager.java b/ethereumj-core/src/main/java/org/ethereum/sync/SyncManager.java
index 4f06a59..a47128d 100644
--- a/ethereumj-core/src/main/java/org/ethereum/sync/SyncManager.java
+++ b/ethereumj-core/src/main/java/org/ethereum/sync/SyncManager.java
@@ -345,7 +345,7 @@
         masterVersion = master.getEthVersion();
 
         if (gapBlock != null) {
-            master.setLastHashToAsk(gapBlock.getParentHash());
+            master.setLastHashToAsk(gapBlock.getHash());
         } else {
             master.setLastHashToAsk(master.getBestKnownHash());
             queue.clearHashes();
