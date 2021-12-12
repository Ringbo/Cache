diff --git a/solr/core/src/test/org/apache/solr/cloud/TestDeleteCollectionOnDownNodes.java b/solr/core/src/test/org/apache/solr/cloud/TestDeleteCollectionOnDownNodes.java
index 33820b3..cb33e26 100644
--- a/solr/core/src/test/org/apache/solr/cloud/TestDeleteCollectionOnDownNodes.java
+++ b/solr/core/src/test/org/apache/solr/cloud/TestDeleteCollectionOnDownNodes.java
@@ -35,7 +35,7 @@
   @Test
   public void deleteCollectionWithDownNodes() throws Exception {
 
-    CollectionAdminRequest.createCollection("halfdeletedcollection2", "conf", 4, 2)
+    CollectionAdminRequest.createCollection("halfdeletedcollection2", "conf", 4, 3)
         .setMaxShardsPerNode(3)
         .process(cluster.getSolrClient());
 
