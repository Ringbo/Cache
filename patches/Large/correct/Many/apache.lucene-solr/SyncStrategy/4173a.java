diff --git a/solr/core/src/java/org/apache/solr/cloud/SyncStrategy.java b/solr/core/src/java/org/apache/solr/cloud/SyncStrategy.java
index 54ae5f6..3a886da 100644
--- a/solr/core/src/java/org/apache/solr/cloud/SyncStrategy.java
+++ b/solr/core/src/java/org/apache/solr/cloud/SyncStrategy.java
@@ -150,8 +150,7 @@
   private boolean syncWithReplicas(ZkController zkController, SolrCore core,
       ZkNodeProps props, String collection, String shardId, boolean peerSyncOnlyWithActive) {
     List<ZkCoreNodeProps> nodes = zkController.getZkStateReader()
-        .getReplicaProps(collection, shardId,core.getCoreDescriptor().getCloudDescriptor().getCoreNodeName(),
-            props.getStr(ZkStateReader.CORE_NAME_PROP));
+        .getReplicaProps(collection, shardId,core.getCoreDescriptor().getCloudDescriptor().getCoreNodeName());
     
     if (nodes == null) {
       // I have no replicas
@@ -178,8 +177,7 @@
     List<ZkCoreNodeProps> nodes = zkController
         .getZkStateReader()
         .getReplicaProps(collection, shardId,
-            cd.getCloudDescriptor().getCoreNodeName(),
-            leaderProps.getStr(ZkStateReader.CORE_NAME_PROP));
+            cd.getCloudDescriptor().getCoreNodeName());
     if (nodes == null) {
       log.info(ZkCoreNodeProps.getCoreUrl(leaderProps) + " has no replicas");
       return;
