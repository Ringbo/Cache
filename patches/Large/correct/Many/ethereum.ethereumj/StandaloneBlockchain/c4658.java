diff --git a/ethereumj-core/src/main/java/org/ethereum/util/blockchain/StandaloneBlockchain.java b/ethereumj-core/src/main/java/org/ethereum/util/blockchain/StandaloneBlockchain.java
index 46b7b95..09949f8 100644
--- a/ethereumj-core/src/main/java/org/ethereum/util/blockchain/StandaloneBlockchain.java
+++ b/ethereumj-core/src/main/java/org/ethereum/util/blockchain/StandaloneBlockchain.java
@@ -311,7 +311,7 @@
     public SolidityContract submitNewContractFromJson(String json, String contractName, Object... constructorArgs) {
 		SolidityContractImpl contract;
 		try {
-			contract = createContractFromJson(json, contractName);
+			contract = createContractFromJson(contractName, json);
 			CallTransaction.Function constructor = contract.contract.getConstructor();
 			if (constructor == null && constructorArgs.length > 0) {
 				throw new RuntimeException("No constructor with params found");
