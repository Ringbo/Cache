diff --git a/solr/solrj/src/test/org/apache/solr/client/solrj/CollectionAdminRequestRequiredParamsTest.java b/solr/solrj/src/test/org/apache/solr/client/solrj/CollectionAdminRequestRequiredParamsTest.java
index 876df2b..0dbd1e6 100644
--- a/solr/solrj/src/test/org/apache/solr/client/solrj/CollectionAdminRequestRequiredParamsTest.java
+++ b/solr/solrj/src/test/org/apache/solr/client/solrj/CollectionAdminRequestRequiredParamsTest.java
@@ -145,12 +145,10 @@
   public void testCreateCollection() {
     // shortest form
     assertContainsParams(CollectionAdminRequest.createCollection("foo", null, 1, 1).getParams(),
-                         ACTION, NAME, ZkStateReader.NUM_SHARDS_PROP,
-                         "replicationFactor", ZkStateReader.NRT_REPLICAS);
+                         ACTION, NAME, ZkStateReader.NUM_SHARDS_PROP, ZkStateReader.NRT_REPLICAS);
     // shortest form w/ "explicitly" choosing "implicit" router
     assertContainsParams(CollectionAdminRequest.createCollectionWithImplicitRouter("foo", null, "bar", 1).getParams(),
-                         ACTION, NAME, "shards", "router.name",
-                         "replicationFactor", ZkStateReader.NRT_REPLICAS);
+                         ACTION, NAME, "shards", "router.name", ZkStateReader.NRT_REPLICAS);
   }
   
   public void testReloadCollection() {
