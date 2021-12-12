diff --git a/ethereumj-core/src/main/java/org/ethereum/net/eth/message/BlockHashesMessage.java b/ethereumj-core/src/main/java/org/ethereum/net/eth/message/BlockHashesMessage.java
index 224dfe5..17404cd 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/eth/message/BlockHashesMessage.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/eth/message/BlockHashesMessage.java
@@ -33,7 +33,7 @@
         RLPList paramsList = (RLPList) RLP.decode2(encoded).get(0);
 
         blockHashes = new ArrayList<>();
-        for (int i = 1; i < paramsList.size(); ++i) {
+        for (int i = 0; i < paramsList.size(); ++i) {
             RLPItem rlpData = ((RLPItem) paramsList.get(i));
             blockHashes.add(rlpData.getRLPData());
         }
