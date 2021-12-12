diff --git a/webs/solr4-web/docroot/WEB-INF/src/com/liferay/portal/search/solr/SolrQuerySuggester.java b/webs/solr4-web/docroot/WEB-INF/src/com/liferay/portal/search/solr/SolrQuerySuggester.java
index b72a89f..4c22208 100644
--- a/webs/solr4-web/docroot/WEB-INF/src/com/liferay/portal/search/solr/SolrQuerySuggester.java
+++ b/webs/solr4-web/docroot/WEB-INF/src/com/liferay/portal/search/solr/SolrQuerySuggester.java
@@ -206,7 +206,7 @@
 	protected long[] getGroupIdsForSuggestions(SearchContext searchContext) {
 		long[] groupIds = searchContext.getGroupIds();
 
-		if (ArrayUtil.isEmpty(groupId)) {
+		if (ArrayUtil.isEmpty(groupIds)) {
 			return new long[] {_GLOBAL_GROUP_ID};
 		}
 
