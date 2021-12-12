diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrHelperServiceImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrHelperServiceImpl.java
index c6cbdbf..9d270dd 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrHelperServiceImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrHelperServiceImpl.java
@@ -150,7 +150,7 @@
                 new CollectionAdminRequest.CreateAlias().setAliasName(primary.getDefaultCollection())
                         .setAliasedCollections(reindexCollectionName).process(primary);
                 new CollectionAdminRequest.CreateAlias().setAliasName(reindex.getDefaultCollection())
-                        .setAliasedCollections(primaryCollectionName).process(primary);
+                        .setAliasedCollections(primaryCollectionName).process(reindex);
             } catch (Exception e) {
                 LOG.error("An exception occured swapping cores.", e);
                 throw new ServiceException("Unable to swap SolrCloud collections after a full reindex.", e);
