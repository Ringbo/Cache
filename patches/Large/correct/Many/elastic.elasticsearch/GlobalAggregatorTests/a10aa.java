diff --git a/core/src/test/java/org/elasticsearch/search/aggregations/bucket/GlobalAggregatorTests.java b/core/src/test/java/org/elasticsearch/search/aggregations/bucket/GlobalAggregatorTests.java
index 46f512e..571a32b 100644
--- a/core/src/test/java/org/elasticsearch/search/aggregations/bucket/GlobalAggregatorTests.java
+++ b/core/src/test/java/org/elasticsearch/search/aggregations/bucket/GlobalAggregatorTests.java
@@ -78,7 +78,7 @@
         aggregationBuilder.subAggregation(new MinAggregationBuilder("in_global").field("number"));
         MappedFieldType fieldType = new NumberFieldMapper.NumberFieldType(NumberFieldMapper.NumberType.LONG);
         fieldType.setName("number");
-        try (GlobalAggregator aggregator = createAggregator(aggregationBuilder, fieldType, indexSearcher)) {
+        try (GlobalAggregator aggregator = createAggregator(aggregationBuilder, indexSearcher, fieldType)) {
             try {
                 aggregator.preCollection();
                 indexSearcher.search(new MatchAllDocsQuery(), aggregator);
