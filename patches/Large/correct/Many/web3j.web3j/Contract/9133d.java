diff --git a/core/src/main/java/org/web3j/tx/Contract.java b/core/src/main/java/org/web3j/tx/Contract.java
index 8c03e39..a399d19 100644
--- a/core/src/main/java/org/web3j/tx/Contract.java
+++ b/core/src/main/java/org/web3j/tx/Contract.java
@@ -404,7 +404,7 @@
             Web3j web3j, TransactionManager transactionManager,
             BigInteger gasPrice, BigInteger gasLimit,
             String binary, String encodedConstructor, BigInteger value)
-            throws IOException, TransactionException {
+            throws RuntimeException, TransactionException {
 
         return deploy(type, web3j, transactionManager,
                 new StaticGasProvider(gasPrice, gasLimit),
