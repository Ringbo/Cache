diff --git a/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/OperationRunnerImpl.java b/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/OperationRunnerImpl.java
index 5b913c8..bdb27de 100644
--- a/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/OperationRunnerImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/OperationRunnerImpl.java
@@ -219,7 +219,7 @@
         }
 
         if (partitionId != getPartitionId()) {
-            throw new IllegalStateException("wrong partition, expected: " + getPartitionId() + " but found:" + op);
+            throw new IllegalStateException("wrong partition, expected: " + getPartitionId() + " but found:" + partitionId);
         }
 
         if (internalPartition == null) {
