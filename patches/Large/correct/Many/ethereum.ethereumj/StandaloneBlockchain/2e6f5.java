diff --git a/ethereumj-core/src/test/java/org/ethereum/tools/bc/StandaloneBlockchain.java b/ethereumj-core/src/test/java/org/ethereum/tools/bc/StandaloneBlockchain.java
index 1ac4da6..6fa5d5f 100644
--- a/ethereumj-core/src/test/java/org/ethereum/tools/bc/StandaloneBlockchain.java
+++ b/ethereumj-core/src/test/java/org/ethereum/tools/bc/StandaloneBlockchain.java
@@ -251,7 +251,7 @@
 
     private BlockchainImpl createBlockchain(Genesis genesis) {
         IndexedBlockStore blockStore = new IndexedBlockStore();
-        blockStore.init(new HashMap<Long, List<IndexedBlockStore.BlockInfo>>(), new HashMapDB(), null, null);
+        blockStore.init(new HashMapDB(), new HashMapDB());
 
         Repository repository = new RepositoryImpl(new HashMapDB(), new HashMapDB());
 
