diff --git a/ethereumj-core/src/test/java/org/ethereum/core/TransactionTest.java b/ethereumj-core/src/test/java/org/ethereum/core/TransactionTest.java
index 8b9110b..604147e 100644
--- a/ethereumj-core/src/test/java/org/ethereum/core/TransactionTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/core/TransactionTest.java
@@ -656,14 +656,14 @@
     }
 
     protected Transaction createTx(BlockchainImpl blockchain, ECKey sender, byte[] receiveAddress, byte[] data) {
-        return createTx(blockchain, sender, receiveAddress, data, 1);
+        return createTx(blockchain, sender, receiveAddress, data, 0);
     }
     protected Transaction createTx(BlockchainImpl blockchain, ECKey sender, byte[] receiveAddress,
                                    byte[] data, long value) {
         BigInteger nonce = blockchain.getRepository().getNonce(sender.getAddress());
         Transaction tx = new Transaction(
                 ByteUtil.bigIntegerToBytes(nonce),
-                ByteUtil.longToBytesNoLeadZeroes(1),
+                ByteUtil.longToBytesNoLeadZeroes(0),
                 ByteUtil.longToBytesNoLeadZeroes(3_000_000),
                 receiveAddress,
                 ByteUtil.longToBytesNoLeadZeroes(value),
