diff --git a/core/src/main/java/org/web3j/tx/FastRawTransactionManager.java b/core/src/main/java/org/web3j/tx/FastRawTransactionManager.java
index d2d9e49..eb95eb0 100644
--- a/core/src/main/java/org/web3j/tx/FastRawTransactionManager.java
+++ b/core/src/main/java/org/web3j/tx/FastRawTransactionManager.java
@@ -38,7 +38,7 @@
     }
 
     @Override
-    synchronized BigInteger getNonce() throws IOException {
+    protected synchronized BigInteger getNonce() throws IOException {
         if (nonce.signum() == -1) {
             // obtain lock
             nonce = super.getNonce();
