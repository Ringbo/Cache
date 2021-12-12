diff --git a/server/src/test/java/org/elasticsearch/search/profile/aggregation/AggregationProfileShardResultTests.java b/server/src/test/java/org/elasticsearch/search/profile/aggregation/AggregationProfileShardResultTests.java
index a21eeed..b67caea 100644
--- a/server/src/test/java/org/elasticsearch/search/profile/aggregation/AggregationProfileShardResultTests.java
+++ b/server/src/test/java/org/elasticsearch/search/profile/aggregation/AggregationProfileShardResultTests.java
@@ -57,9 +57,9 @@
 
         AggregationProfileShardResult parsed;
         try (XContentParser parser = createParser(xContentType.xContent(), originalBytes)) {
-            XContentParserUtils.ensureExpectedToken(parser.nextToken(), XContentParser.Token.START_OBJECT, parser::getTokenLocation);
+            XContentParserUtils.ensureExpectedToken(XContentParser.Token.START_OBJECT, parser.nextToken(), parser::getTokenLocation);
             XContentParserUtils.ensureFieldName(parser, parser.nextToken(), AggregationProfileShardResult.AGGREGATIONS);
-            XContentParserUtils.ensureExpectedToken(parser.nextToken(), XContentParser.Token.START_ARRAY, parser::getTokenLocation);
+            XContentParserUtils.ensureExpectedToken(XContentParser.Token.START_ARRAY, parser.nextToken(), parser::getTokenLocation);
             parsed = AggregationProfileShardResult.fromXContent(parser);
             assertEquals(XContentParser.Token.END_OBJECT, parser.nextToken());
             assertNull(parser.nextToken());
