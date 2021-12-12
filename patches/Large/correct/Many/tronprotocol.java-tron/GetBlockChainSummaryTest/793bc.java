diff --git a/src/test/java/org/tron/core/net/node/GetBlockChainSummaryTest.java b/src/test/java/org/tron/core/net/node/GetBlockChainSummaryTest.java
index ebd3551..f6935ce 100644
--- a/src/test/java/org/tron/core/net/node/GetBlockChainSummaryTest.java
+++ b/src/test/java/org/tron/core/net/node/GetBlockChainSummaryTest.java
@@ -111,7 +111,7 @@
             peer_he.getSyncBlockToFetch().clear();
             for(int i=0; i<4 ;i++){
                 number = dbManager.getDynamicPropertiesStore().getLatestBlockHeaderNumber() + 1;
-                capsule = createTestBlockCapsule(number, dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
+                capsule = createTestBlockCapsule(1533529947843L + 3000L * i, number, dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
                         addressToProvateKeys);
                 toFetch.add(capsule.getBlockId());
             }
@@ -131,18 +131,18 @@
             toFetch.clear();
             peer_he.getSyncBlockToFetch().clear();
             number = dbManager.getDynamicPropertiesStore().getLatestBlockHeaderNumber() + 1;
-            BlockCapsule capsule1 = createTestBlockCapsule(number, dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
+            BlockCapsule capsule1 = createTestBlockCapsule(1533529947843L + 3000L * 6, number, dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
                     addressToProvateKeys);
             dbManager.pushBlock(capsule1);
 
             number = dbManager.getDynamicPropertiesStore().getLatestBlockHeaderNumber() + 1;
-            BlockCapsule capsule2 = createTestBlockCapsule(number, dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
+            BlockCapsule capsule2 = createTestBlockCapsule(1533529947843L + 3000L * 7, number, dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
                     addressToProvateKeys);
             dbManager.pushBlock(capsule2);
 
             for(int i=0; i<2; i++){
                 number = dbManager.getDynamicPropertiesStore().getLatestBlockHeaderNumber() + 1;
-                capsule = createTestBlockCapsule(number, dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
+                capsule = createTestBlockCapsule(1533529947843L + 3000L * 8 + 3000L * i, number, dbManager.getDynamicPropertiesStore().getLatestBlockHeaderHash().getByteString(),
                         addressToProvateKeys);
                 toFetch.add(capsule.getBlockId());
             }
