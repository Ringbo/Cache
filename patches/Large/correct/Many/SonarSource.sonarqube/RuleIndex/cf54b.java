diff --git a/server/sonar-server/src/main/java/org/sonar/server/rule/index/RuleIndex.java b/server/sonar-server/src/main/java/org/sonar/server/rule/index/RuleIndex.java
index b24e673..968c9b4 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/rule/index/RuleIndex.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/rule/index/RuleIndex.java
@@ -335,9 +335,9 @@
   protected Map<String, AggregationBuilder> getFacets(QueryBuilder query, HashMap<String, FilterBuilder> filters) {
     Map<String, AggregationBuilder> aggregations = new HashMap<String, AggregationBuilder>();
 
-    BoolFilterBuilder langFacetFilter = FilterBuilders.boolFilter();// .must(FilterBuilders.queryFilter(query));
+    BoolFilterBuilder langFacetFilter = FilterBuilders.boolFilter().must(FilterBuilders.queryFilter(query));
     for (Map.Entry<String, FilterBuilder> filter : filters.entrySet()) {
-      if (StringUtils.equals(filter.getKey(), RuleNormalizer.RuleField.LANGUAGE.field())) {
+      if (!StringUtils.equals(filter.getKey(), RuleNormalizer.RuleField.LANGUAGE.field())) {
         langFacetFilter.must(filter.getValue());
       }
     }
@@ -356,9 +356,9 @@
                 .size(10)
                 .minDocCount(1))));
 
-    BoolFilterBuilder tagsFacetFilter = FilterBuilders.boolFilter();// .must(FilterBuilders.queryFilter(query));
+    BoolFilterBuilder tagsFacetFilter = FilterBuilders.boolFilter().must(FilterBuilders.queryFilter(query));
     for (Map.Entry<String, FilterBuilder> filter : filters.entrySet()) {
-      if (StringUtils.equals(filter.getKey(), RuleNormalizer.RuleField._TAGS.field())) {
+      if (!StringUtils.equals(filter.getKey(), RuleNormalizer.RuleField._TAGS.field())) {
         tagsFacetFilter.must(filter.getValue());
       }
     }
@@ -377,9 +377,9 @@
                 .size(10)
                 .minDocCount(1))));
 
-    BoolFilterBuilder repositoriesFacetFilter = FilterBuilders.boolFilter();// .must(FilterBuilders.queryFilter(query));
+    BoolFilterBuilder repositoriesFacetFilter = FilterBuilders.boolFilter().must(FilterBuilders.queryFilter(query));
     for (Map.Entry<String, FilterBuilder> filter : filters.entrySet()) {
-      if (StringUtils.equals(filter.getKey(), RuleNormalizer.RuleField.REPOSITORY.field())) {
+      if (!StringUtils.equals(filter.getKey(), RuleNormalizer.RuleField.REPOSITORY.field())) {
         repositoriesFacetFilter.must(filter.getValue());
       }
     }
