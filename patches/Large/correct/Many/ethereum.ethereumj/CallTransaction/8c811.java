diff --git a/ethereumj-core/src/main/java/org/ethereum/core/CallTransaction.java b/ethereumj-core/src/main/java/org/ethereum/core/CallTransaction.java
index 29a88a6..b50b996 100644
--- a/ethereumj-core/src/main/java/org/ethereum/core/CallTransaction.java
+++ b/ethereumj-core/src/main/java/org/ethereum/core/CallTransaction.java
@@ -304,7 +304,7 @@
                     if (input.type.isDynamicType()) {
                         // If arrays (including string and bytes) are used as indexed arguments,
                         // the Keccak-256 hash of it is stored as topic instead.
-                        decodedTopic = SolidityType.Bytes32Type.decodeBytes32(topicBytes);
+                        decodedTopic = SolidityType.Bytes32Type.decodeBytes32(topicBytes, 0);
                     } else {
                         decodedTopic = input.type.decode(topicBytes);
                     }
