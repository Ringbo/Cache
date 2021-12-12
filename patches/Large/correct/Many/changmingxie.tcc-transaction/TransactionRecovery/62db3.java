diff --git a/tcc-transaction-core/src/main/java/org/mengyun/tcctransaction/recover/TransactionRecovery.java b/tcc-transaction-core/src/main/java/org/mengyun/tcctransaction/recover/TransactionRecovery.java
index 210c2c4..d99cb9c 100644
--- a/tcc-transaction-core/src/main/java/org/mengyun/tcctransaction/recover/TransactionRecovery.java
+++ b/tcc-transaction-core/src/main/java/org/mengyun/tcctransaction/recover/TransactionRecovery.java
@@ -50,7 +50,7 @@
             }
         }
 
-        return transactions;
+        return recoverTransactions;
     }
 
     private void recoverErrorTransactions(List<Transaction> transactions) {
