diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrSearchServiceImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrSearchServiceImpl.java
index ea5f1e0..2c53790 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrSearchServiceImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrSearchServiceImpl.java
@@ -766,7 +766,8 @@
             searchFacetDTOs.addAll(getCategoryFacets(category));
         }
 
-        if (globalFacetsForCategorySearch) {
+        // if we aren't searching in a category, or globalFacetsForCategorySearch is true, include the global search facets
+        if (globalFacetsForCategorySearch || category == null) {
             searchFacetDTOs.addAll(getSearchFacets());
         }
 
