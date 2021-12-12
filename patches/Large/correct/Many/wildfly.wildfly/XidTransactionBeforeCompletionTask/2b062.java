diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/XidTransactionBeforeCompletionTask.java b/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/XidTransactionBeforeCompletionTask.java
index 00d4472..582f582 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/XidTransactionBeforeCompletionTask.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/XidTransactionBeforeCompletionTask.java
@@ -46,7 +46,7 @@
     @Override
     protected void manageTransaction() throws Throwable {
         // first associate the tx on this thread, by resuming the tx
-        final Transaction transaction = this.transactionsRepository.removeTransaction(this.xidTransactionID);
+        final Transaction transaction = this.transactionsRepository.getTransaction(this.xidTransactionID);
         this.resumeTransaction(transaction);
         try {
             // invoke the beforeCompletion
