diff --git a/solr/core/src/java/org/apache/solr/update/processor/DistributedUpdateProcessor.java b/solr/core/src/java/org/apache/solr/update/processor/DistributedUpdateProcessor.java
index 667d59e..4f7b52d 100644
--- a/solr/core/src/java/org/apache/solr/update/processor/DistributedUpdateProcessor.java
+++ b/solr/core/src/java/org/apache/solr/update/processor/DistributedUpdateProcessor.java
@@ -623,8 +623,7 @@
 
       forwardToLeader = false;
       List<ZkCoreNodeProps> replicaProps = zkController.getZkStateReader()
-          .getReplicaProps(collection, shardId, leaderReplica.getName(),
-              req.getCore().getName());
+          .getReplicaProps(collection, shardId, leaderReplica.getName());
       if (replicaProps != null) {
         nodes = new ArrayList<>(replicaProps.size());
         for (ZkCoreNodeProps props : replicaProps) {
