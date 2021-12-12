diff --git a/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore.java b/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore.java
index 785c61a..520ff16 100644
--- a/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore.java
+++ b/activemq-jdbc-store/src/main/java/org/apache/activemq/store/jdbc/JdbcMemoryTransactionStore.java
@@ -106,7 +106,7 @@
                     jdbcPersistenceAdapter.commitAdd(context, message.getMessageId());
                     ((JDBCMessageStore)addMessageCommand.getMessageStore()).onAdd(
                             message.getMessageId(),
-                            (Long)message.getMessageId().getDataLocator(),
+                            (Long)message.getMessageId().getEntryLocator(),
                             message.getPriority());
 
                 }
@@ -163,7 +163,7 @@
 
     public void recoverAdd(long id, byte[] messageBytes) throws IOException {
         final Message message = (Message) ((JDBCPersistenceAdapter)persistenceAdapter).getWireFormat().unmarshal(new ByteSequence(messageBytes));
-        message.getMessageId().setDataLocator(id);
+        message.getMessageId().setEntryLocator(id);
         Tx tx = getPreparedTx(message.getTransactionId());
         tx.add(new AddMessageCommand() {
             @Override
@@ -186,7 +186,7 @@
 
     public void recoverAck(long id, byte[] xid, byte[] message) throws IOException {
         Message msg = (Message) ((JDBCPersistenceAdapter)persistenceAdapter).getWireFormat().unmarshal(new ByteSequence(message));
-        msg.getMessageId().setDataLocator(id);
+        msg.getMessageId().setEntryLocator(id);
         Tx tx = getPreparedTx(new XATransactionId(xid));
         final MessageAck ack = new MessageAck(msg, MessageAck.STANDARD_ACK_TYPE, 1);
         tx.add(new RemoveMessageCommand() {
