diff --git a/shared/solr4-shared/src/com/liferay/portal/search/solr/SolrIndexSearcher.java b/shared/solr4-shared/src/com/liferay/portal/search/solr/SolrIndexSearcher.java
index c56d2b8..8713aae 100644
--- a/shared/solr4-shared/src/com/liferay/portal/search/solr/SolrIndexSearcher.java
+++ b/shared/solr4-shared/src/com/liferay/portal/search/solr/SolrIndexSearcher.java
@@ -145,7 +145,7 @@
 
 				Serializable modified = searchContext.getAttribute("modified");
 
-				if (Validator.isNull(modified)) {
+				if (Validator.isNotNull(modified)) {
 					String facetQuery =
 						facetConfiguration.getFieldName() + StringPool.COLON +
 							GetterUtil.getString(modified);
