diff --git a/src/main/java/org/tron/common/runtime/Runtime.java b/src/main/java/org/tron/common/runtime/Runtime.java
index c85b79b..2759cc5 100644
--- a/src/main/java/org/tron/common/runtime/Runtime.java
+++ b/src/main/java/org/tron/common/runtime/Runtime.java
@@ -196,7 +196,7 @@
    **/
   private void create() {
     CreateSmartContract contract = ContractCapsule.getSmartContractFromTransaction(trx);
-    SmartContract newSmartContract = contract.getNewContrect();
+    SmartContract newSmartContract = contract.getNewContract();
     byte[] code = newSmartContract.getBytecode().toByteArray();
     byte[] contractAddress = Wallet.generateContractAddress(trx);
     newSmartContract = newSmartContract.toBuilder()
