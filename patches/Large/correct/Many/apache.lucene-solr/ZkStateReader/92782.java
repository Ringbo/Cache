diff --git a/solr/solrj/src/java/org/apache/solr/common/cloud/ZkStateReader.java b/solr/solrj/src/java/org/apache/solr/common/cloud/ZkStateReader.java
index 29a3e9b..44eab6a 100644
--- a/solr/solrj/src/java/org/apache/solr/common/cloud/ZkStateReader.java
+++ b/solr/solrj/src/java/org/apache/solr/common/cloud/ZkStateReader.java
@@ -579,7 +579,7 @@
 
   public List<ZkCoreNodeProps> getReplicaProps(String collection,
       String shardId, String thisCoreNodeName) {
-    return getReplicaProps(collection, shardId, thisCoreNodeName);
+    return getReplicaProps(collection, shardId, thisCoreNodeName, null);
   }
   
   public List<ZkCoreNodeProps> getReplicaProps(String collection,
