diff --git a/presto-main/src/main/java/com/facebook/presto/transaction/InMemoryTransactionManager.java b/presto-main/src/main/java/com/facebook/presto/transaction/InMemoryTransactionManager.java
index c2f8eeb..998fdcc 100644
--- a/presto-main/src/main/java/com/facebook/presto/transaction/InMemoryTransactionManager.java
+++ b/presto-main/src/main/java/com/facebook/presto/transaction/InMemoryTransactionManager.java
@@ -249,7 +249,7 @@
     @Override
     public void trySetInactive(TransactionId transactionId)
     {
-        tryGetTransactionMetadata(transactionId).ifPresent(TransactionMetadata::setInActive);
+        tryGetTransactionMetadata(transactionId).ifPresent(TransactionMetadata::setInactive);
     }
 
     private TransactionMetadata getTransactionMetadata(TransactionId transactionId)
@@ -344,7 +344,7 @@
             idleStartTime.set(null);
         }
 
-        public void setInActive()
+        public void setInactive()
         {
             idleStartTime.set(System.nanoTime());
         }
