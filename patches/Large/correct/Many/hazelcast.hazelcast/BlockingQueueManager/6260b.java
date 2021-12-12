diff --git a/hazelcast/src/main/java/com/hazelcast/impl/BlockingQueueManager.java b/hazelcast/src/main/java/com/hazelcast/impl/BlockingQueueManager.java
index 30b475e..543d2e4 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/BlockingQueueManager.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/BlockingQueueManager.java
@@ -477,7 +477,7 @@
     public Iterator iterate(final String name) {
         MasterOp op = new MasterOp(ClusterOperation.BLOCKING_ITERATE, name, 0);
         op.initOp();
-        Keys keys = (Keys) op.getResultAsObject();
+        Keys keys = (Keys) op.getResultAsObject(false);
         final Collection<Data> dataKeys = keys.getKeys();
         final Collection allKeys = new ArrayList(dataKeys);
         TransactionImpl txn = ThreadContext.get().getCallContext().getTransaction();
