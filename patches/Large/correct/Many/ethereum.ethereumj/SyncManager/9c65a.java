diff --git a/ethereumj-core/src/main/java/org/ethereum/sync/SyncManager.java b/ethereumj-core/src/main/java/org/ethereum/sync/SyncManager.java
index 57656f4..7c04550 100644
--- a/ethereumj-core/src/main/java/org/ethereum/sync/SyncManager.java
+++ b/ethereumj-core/src/main/java/org/ethereum/sync/SyncManager.java
@@ -200,7 +200,7 @@
                         // to get more chances to receive block body promptly
                         for (BlockHeaderWrapper blockHeaderWrapper : bReq.getBlockHeaders()) {
                             Channel channel = pool.getByNodeId(blockHeaderWrapper.getNodeId());
-                            if (channel != null) {
+                            if (channel != null && channel.isIdle()) {
                                 channel.getEthHandler().sendGetBlockBodies(singletonList(blockHeaderWrapper));
                             }
                         }
