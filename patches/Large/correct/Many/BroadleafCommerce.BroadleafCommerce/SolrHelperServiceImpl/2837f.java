diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrHelperServiceImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrHelperServiceImpl.java
index 7eb5e5e..da8b6cf 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrHelperServiceImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrHelperServiceImpl.java
@@ -257,7 +257,7 @@
     public Long getCategoryId(Long category) {
         Long[] returnId = new Long[1];
         //TODO (qa 607) Need to review the performance of retrieval of the Category instance here every time (using the id version breaks for indexing derived catalogs)
-        ExtensionResultStatusType result = extensionManager.getProxy().getCategoryId(genericEntityDao.readGenericEntity(CategoryImpl.class, category), returnId);
+        ExtensionResultStatusType result = searchExtensionManager.getProxy().getCategoryId(genericEntityDao.readGenericEntity(CategoryImpl.class, category), returnId);
         if (result.equals(ExtensionResultStatusType.HANDLED)) {
             return returnId[0];
         }
