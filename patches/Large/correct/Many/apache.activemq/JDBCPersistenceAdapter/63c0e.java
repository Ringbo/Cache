diff --git a/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java b/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
index 43859ed..edfc1a9 100755
--- a/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
+++ b/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
@@ -737,7 +737,7 @@
     public void commitAdd(ConnectionContext context, MessageId messageId) throws IOException {
         TransactionContext c = getTransactionContext(context);
         try {
-            long sequence = (Long)messageId.getDataLocator();
+            long sequence = (Long)messageId.getEntryLocator();
             getAdapter().doCommitAddOp(c, sequence);
         } catch (SQLException e) {
             JDBCPersistenceAdapter.log("JDBC Failure: ", e);
@@ -750,7 +750,7 @@
     public void commitRemove(ConnectionContext context, MessageAck ack) throws IOException {
         TransactionContext c = getTransactionContext(context);
         try {
-            getAdapter().doRemoveMessage(c, (Long)ack.getLastMessageId().getDataLocator(), null);
+            getAdapter().doRemoveMessage(c, (Long)ack.getLastMessageId().getEntryLocator(), null);
         } catch (SQLException e) {
             JDBCPersistenceAdapter.log("JDBC Failure: ", e);
             throw IOExceptionSupport.create("Failed to commit last ack: " + ack + ". Reason: " + e,e);
