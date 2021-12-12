diff --git a/core/src/test/java/org/elasticsearch/search/aggregations/metrics/MaxAggregatorTests.java b/core/src/test/java/org/elasticsearch/search/aggregations/metrics/MaxAggregatorTests.java
index ac29844..c53927a 100644
--- a/core/src/test/java/org/elasticsearch/search/aggregations/metrics/MaxAggregatorTests.java
+++ b/core/src/test/java/org/elasticsearch/search/aggregations/metrics/MaxAggregatorTests.java
@@ -112,7 +112,7 @@
         MaxAggregationBuilder aggregationBuilder = new MaxAggregationBuilder("_name").field("number");
         MappedFieldType fieldType = new NumberFieldMapper.NumberFieldType(NumberFieldMapper.NumberType.LONG);
         fieldType.setName("number");
-        try (MaxAggregator aggregator = createAggregator(aggregationBuilder, fieldType, indexSearcher)) {
+        try (MaxAggregator aggregator = createAggregator(aggregationBuilder, indexSearcher, fieldType)) {
             aggregator.preCollection();
             indexSearcher.search(query, aggregator);
             aggregator.postCollection();
