diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/XidTransactionPrepareTask.java b/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/XidTransactionPrepareTask.java
index 416a65c..7cdcbf2 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/XidTransactionPrepareTask.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/remote/protocol/versionone/XidTransactionPrepareTask.java
@@ -91,7 +91,7 @@
 
     private int prepareTransaction() throws Throwable {
         // first associate the tx on this thread, by resuming the tx
-        final Transaction transaction = this.transactionsRepository.removeTransaction(this.xidTransactionID);
+        final Transaction transaction = this.transactionsRepository.getTransaction(this.xidTransactionID);
         if(transaction == null) {
             if(EjbLogger.EJB3_INVOCATION_LOGGER.isDebugEnabled()) {
                 //this happens if no ejb invocations where made within the TX
