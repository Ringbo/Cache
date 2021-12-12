diff --git a/server/sonar-server/src/main/java/org/sonar/server/search/BaseIndex.java b/server/sonar-server/src/main/java/org/sonar/server/search/BaseIndex.java
index 1d957cd..2cf2f6a 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/search/BaseIndex.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/search/BaseIndex.java
@@ -592,7 +592,7 @@
 
   }
 
-  protected AggregationBuilder stickyFacetBuilder(QueryBuilder query, Map<String, FilterBuilder> filters, String fieldName, String facetName, String... selected) {
+  protected AggregationBuilder stickyFacetBuilder(QueryBuilder query, Map<String, FilterBuilder> filters, String fieldName, String facetName, Object... selected) {
     BoolFilterBuilder facetFilter = getStickyFacetFilter(query, filters, fieldName);
     FilterAggregationBuilder facetTopAggregation = buildTopFacetAggregation(fieldName, facetName, facetFilter);
     facetTopAggregation = addSelectedItemsToFacet(fieldName, facetName, facetTopAggregation, selected);
@@ -624,7 +624,7 @@
           .minDocCount(1));
   }
 
-  protected FilterAggregationBuilder addSelectedItemsToFacet(String fieldName, String facetName, FilterAggregationBuilder facetTopAggregation, String... selected) {
+  protected FilterAggregationBuilder addSelectedItemsToFacet(String fieldName, String facetName, FilterAggregationBuilder facetTopAggregation, Object... selected) {
     if (selected.length > 0) {
       facetTopAggregation.subAggregation(
         AggregationBuilders.terms(facetName + "_selected")
