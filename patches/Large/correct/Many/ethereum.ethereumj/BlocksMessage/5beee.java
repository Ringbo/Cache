diff --git a/ethereumj-core/src/main/java/org/ethereum/net/eth/BlocksMessage.java b/ethereumj-core/src/main/java/org/ethereum/net/eth/BlocksMessage.java
index 6cd8278..b83f54a 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/eth/BlocksMessage.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/eth/BlocksMessage.java
@@ -32,7 +32,7 @@
         RLPList paramsList = (RLPList) RLP.decode2(encoded).get(0);
 
         blocks = new ArrayList<>();
-        for (int i = 1; i < paramsList.size(); ++i) {
+        for (int i = 0; i < paramsList.size(); ++i) {
             RLPList rlpData = ((RLPList) paramsList.get(i));
             Block blockData = new Block(rlpData.getRLPData());
             blocks.add(blockData);
