diff --git a/src/main/java/org/elasticsearch/rest/action/search/RestSearchAction.java b/src/main/java/org/elasticsearch/rest/action/search/RestSearchAction.java
index 6bed701..f864edf 100644
--- a/src/main/java/org/elasticsearch/rest/action/search/RestSearchAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/search/RestSearchAction.java
@@ -101,7 +101,7 @@
         String searchType = request.param("search_type");
         if (SearchType.fromString(searchType).equals(SearchType.QUERY_AND_FETCH) ||
                 SearchType.fromString(searchType).equals(SearchType.DFS_QUERY_AND_FETCH)) {
-            throw new ElasticsearchIllegalArgumentException("Unsupported search type [" + searchType + "]");
+            throw new IllegalArgumentException("Unsupported search type [" + searchType + "]");
         } else {
             searchRequest.searchType(searchType);
         }
