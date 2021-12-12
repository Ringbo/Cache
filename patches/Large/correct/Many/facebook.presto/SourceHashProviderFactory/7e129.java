diff --git a/presto-main/src/main/java/com/facebook/presto/operator/SourceHashProviderFactory.java b/presto-main/src/main/java/com/facebook/presto/operator/SourceHashProviderFactory.java
index b9d438c..621b4e0 100644
--- a/presto-main/src/main/java/com/facebook/presto/operator/SourceHashProviderFactory.java
+++ b/presto-main/src/main/java/com/facebook/presto/operator/SourceHashProviderFactory.java
@@ -12,7 +12,7 @@
 {
     private final IdentityHashMap<JoinNode, SourceHashProvider> joinHashes = new IdentityHashMap<>();
 
-    public SourceHashProvider getSourceHashProvider(JoinNode node, ExecutionPlanner executionPlanner)
+    public synchronized SourceHashProvider getSourceHashProvider(JoinNode node, ExecutionPlanner executionPlanner)
     {
         SourceHashProvider hashProvider = joinHashes.get(node);
         if (hashProvider == null) {
