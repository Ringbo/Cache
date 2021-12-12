diff --git a/presto-main/src/main/java/com/facebook/presto/execution/SqlQueryQueueManager.java b/presto-main/src/main/java/com/facebook/presto/execution/SqlQueryQueueManager.java
index e90d8b7..eec85e5 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/SqlQueryQueueManager.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/SqlQueryQueueManager.java
@@ -97,9 +97,9 @@
         checkIsDAG(this.rules);
     }
 
-    private void checkIsDAG(List<QueryQueueRule> rules)
+    private static void checkIsDAG(List<QueryQueueRule> rules)
     {
-        DirectedPseudograph<String, DefaultEdge> graph = new DirectedPseudograph<String, DefaultEdge>(DefaultEdge.class);
+        DirectedPseudograph<String, DefaultEdge> graph = new DirectedPseudograph<>(DefaultEdge.class);
         for (QueryQueueRule rule : rules) {
             String lastQueueName = null;
             for (QueryQueueDefinition queue : rule.getQueues()) {
