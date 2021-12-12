diff --git a/ethereumj-core/src/main/java/org/ethereum/manager/BlockLoader.java b/ethereumj-core/src/main/java/org/ethereum/manager/BlockLoader.java
index 22aae7a..4956bd4 100644
--- a/ethereumj-core/src/main/java/org/ethereum/manager/BlockLoader.java
+++ b/ethereumj-core/src/main/java/org/ethereum/manager/BlockLoader.java
@@ -112,7 +112,7 @@
                 Path path = Paths.get(fileSrc);
                 // NOT OPTIMAL, but fine for tests
                 byte[] data = Files.readAllBytes(path);
-                RLPList list = RLP.unwrapList(data);
+                RLPList list = RLP.decode2(data, 1);
                 for (RLPElement item : list) {
                     Block block = new Block(item.getRLPData());
                     exec1.push(block);
