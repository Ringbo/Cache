diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrSearchServiceImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrSearchServiceImpl.java
index 16af3fc..917f099 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrSearchServiceImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrSearchServiceImpl.java
@@ -447,7 +447,7 @@
                 new CollectionAdminRequest.Create().setCollectionName(collectionName).setNumShards(solrCloudNumShards)
                         .setConfigName(solrCloudConfigName).process(primary);
 
-                new CollectionAdminRequest.CreateAlias().setAliasName(primary.getDefaultCollection())
+                new CollectionAdminRequest.CreateAlias().setAliasName(reindex.getDefaultCollection())
                         .setAliasedCollections(collectionName).process(primary);
             } else {
                 //Aliases can be mapped to collections that don't exist.... Make sure the collection exists
