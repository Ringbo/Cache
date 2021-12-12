diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/PushProjectionThroughExchange.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/PushProjectionThroughExchange.java
index c4efa05..b64aaeb 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/PushProjectionThroughExchange.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/PushProjectionThroughExchange.java
@@ -138,7 +138,7 @@
                 exchange.getPartitioningScheme().getPartitioning(),
                 outputBuilder.build(),
                 exchange.getPartitioningScheme().getHashColumn(),
-                exchange.getPartitioningScheme().isReplicateNulls(),
+                exchange.getPartitioningScheme().isReplicateNullsAndAny(),
                 exchange.getPartitioningScheme().getBucketToPartition());
 
         PlanNode result = new ExchangeNode(
