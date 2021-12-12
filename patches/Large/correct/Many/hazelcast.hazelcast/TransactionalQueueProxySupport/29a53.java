diff --git a/hazelcast/src/main/java/com/hazelcast/queue/tx/TransactionalQueueProxySupport.java b/hazelcast/src/main/java/com/hazelcast/queue/tx/TransactionalQueueProxySupport.java
index 9b545c8..ede5dc4 100644
--- a/hazelcast/src/main/java/com/hazelcast/queue/tx/TransactionalQueueProxySupport.java
+++ b/hazelcast/src/main/java/com/hazelcast/queue/tx/TransactionalQueueProxySupport.java
@@ -112,7 +112,7 @@
 
     public Data peekInternal(long timeout) {
         final QueueItem offer = offeredQueue.peek();
-        final TxnPeekOperation operation = new TxnPeekOperation(name, timeout, offer == null ? -1L : offer.getItemId(), tx.getTxnId());
+        final TxnPeekOperation operation = new TxnPeekOperation(name, timeout, offer == null ? -1 : offer.getItemId(), tx.getTxnId());
         try {
             final Invocation invocation = getNodeEngine().getOperationService().createInvocationBuilder(QueueService.SERVICE_NAME, operation, partitionId).build();
             final Future<QueueItem> f = invocation.invoke();
