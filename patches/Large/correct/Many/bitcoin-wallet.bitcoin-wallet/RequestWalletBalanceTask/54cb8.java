diff --git a/wallet/src/de/schildbach/wallet/ui/send/RequestWalletBalanceTask.java b/wallet/src/de/schildbach/wallet/ui/send/RequestWalletBalanceTask.java
index 8e75b1e..22f4664 100644
--- a/wallet/src/de/schildbach/wallet/ui/send/RequestWalletBalanceTask.java
+++ b/wallet/src/de/schildbach/wallet/ui/send/RequestWalletBalanceTask.java
@@ -164,7 +164,7 @@
 
 							final TransactionOutput output = new TransactionOutput(Constants.NETWORK_PARAMETERS, tx, uxtoValue, uxtoScriptBytes);
 
-							if (tx.getOutputs().size() >= uxtoIndex)
+							if (tx.getOutputs().size() > uxtoIndex)
 							{
 								// Work around not being able to replace outputs on transactions
 								final List<TransactionOutput> outputs = new ArrayList<TransactionOutput>(tx.getOutputs());
