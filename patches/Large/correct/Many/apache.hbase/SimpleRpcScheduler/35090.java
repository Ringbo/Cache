diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/ipc/SimpleRpcScheduler.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/ipc/SimpleRpcScheduler.java
index 1f7e8ba..616f741 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/ipc/SimpleRpcScheduler.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/ipc/SimpleRpcScheduler.java
@@ -87,7 +87,7 @@
     } else {
       if (RpcExecutor.isFifoQueueType(callQueueType)) {
         callExecutor = new FastPathBalancedQueueRpcExecutor("deafult.FPBQ", handlerCount,
-            maxPriorityQueueLength, priority, conf, server);
+            maxQueueLength, priority, conf, server);
       } else {
         callExecutor = new BalancedQueueRpcExecutor("deafult.BQ", handlerCount, maxQueueLength,
             priority, conf, server);
