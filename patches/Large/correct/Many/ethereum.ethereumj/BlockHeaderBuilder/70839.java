diff --git a/ethereumj-core/src/main/java/org/ethereum/jsontestsuite/builder/BlockHeaderBuilder.java b/ethereumj-core/src/main/java/org/ethereum/jsontestsuite/builder/BlockHeaderBuilder.java
index d5c52c2..823dd32 100644
--- a/ethereumj-core/src/main/java/org/ethereum/jsontestsuite/builder/BlockHeaderBuilder.java
+++ b/ethereumj-core/src/main/java/org/ethereum/jsontestsuite/builder/BlockHeaderBuilder.java
@@ -21,10 +21,10 @@
                 parseData(headerTck.getCoinbase()),
                 parseData(headerTck.getBloom()),
                 parseNumericData(headerTck.getDifficulty()),
-                new BigInteger(parseData(headerTck.getNumber())).longValue(),
+                new BigInteger(1, parseData(headerTck.getNumber())).longValue(),
                 parseData(headerTck.getGasLimit()),
-                new BigInteger(parseData(headerTck.getGasUsed())).longValue(),
-                new BigInteger(parseData(headerTck.getTimestamp())).longValue(),
+                new BigInteger(1, parseData(headerTck.getGasUsed())).longValue(),
+                new BigInteger(1, parseData(headerTck.getTimestamp())).longValue(),
                 parseData(headerTck.getExtraData()),
                 parseData(headerTck.getMixHash()),
                 parseData(headerTck.getNonce())
