diff --git a/ethereumj-core/src/main/java/org/ethereum/sync/SyncQueue.java b/ethereumj-core/src/main/java/org/ethereum/sync/SyncQueue.java
index d4622cd..e93f2f0 100644
--- a/ethereumj-core/src/main/java/org/ethereum/sync/SyncQueue.java
+++ b/ethereumj-core/src/main/java/org/ethereum/sync/SyncQueue.java
@@ -275,7 +275,7 @@
 
         List<byte[]> notInChain = new ArrayList<>();
         for (byte[] hash : notInQueue) {
-            if (blockchain.isBlockExist(hash)) {
+            if (!blockchain.isBlockExist(hash)) {
                 notInChain.add(hash);
             }
         }
