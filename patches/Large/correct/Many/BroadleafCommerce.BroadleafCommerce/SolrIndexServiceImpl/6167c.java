diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/index/SolrIndexServiceImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/index/SolrIndexServiceImpl.java
index 376b171..3a5e89e 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/index/SolrIndexServiceImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/index/SolrIndexServiceImpl.java
@@ -538,7 +538,7 @@
                 SearchFacet searchFacet = searchFacetDao.readSearchFacetForField(field);
 
                 // If we find a SearchFacet entry for this field, then this field is faceted
-                if (searchFacet != null) {
+                if (searchFacet != null && searchFacet.getFacetFieldType() != null) {
                     // Get the FacetFieldType for the SearchFacet, get the property values, and add a field to the document for each property value
                     FieldType facetType = FieldType.getInstance(searchFacet.getFacetFieldType());
 
