diff --git a/server/sonar-server/src/main/java/org/sonar/server/rule/index/RuleIndex.java b/server/sonar-server/src/main/java/org/sonar/server/rule/index/RuleIndex.java
index c008bd9..12bfa36 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/rule/index/RuleIndex.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/rule/index/RuleIndex.java
@@ -191,9 +191,9 @@
   }
 
   /* Build main filter (match based) */
-  protected HashMap<String, FilterBuilder> getFilters(RuleQuery query, QueryContext options) {
+  protected Map<String, FilterBuilder> getFilters(RuleQuery query, QueryContext options) {
 
-    HashMap<String, FilterBuilder> filters = new HashMap<String, FilterBuilder>();
+    Map<String, FilterBuilder> filters = new HashMap<String, FilterBuilder>();
 
     /* Add enforced filter on rules that are REMOVED */
     filters.put(RuleNormalizer.RuleField.STATUS.field(),
@@ -331,7 +331,7 @@
     return filters;
   }
 
-  protected Map<String, AggregationBuilder> getFacets(QueryBuilder query, HashMap<String, FilterBuilder> filters) {
+  protected Map<String, AggregationBuilder> getFacets(QueryBuilder query, Map<String, FilterBuilder> filters) {
     Map<String, AggregationBuilder> aggregations = new HashMap<String, AggregationBuilder>();
 
     BoolFilterBuilder langFacetFilter = FilterBuilders.boolFilter().must(FilterBuilders.queryFilter(query));
@@ -413,7 +413,7 @@
     }
 
     QueryBuilder qb = this.getQuery(query);
-    HashMap<String, FilterBuilder> filters = this.getFilters(query, options);
+    Map<String, FilterBuilder> filters = this.getFilters(query, options);
 
     if (options.isFacet()) {
       for (AggregationBuilder aggregation : getFacets(qb, filters).values()) {
