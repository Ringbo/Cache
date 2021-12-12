diff --git a/server/src/test/java/org/elasticsearch/search/profile/SearchProfileShardResultsTests.java b/server/src/test/java/org/elasticsearch/search/profile/SearchProfileShardResultsTests.java
index 36841c0..2874f85 100644
--- a/server/src/test/java/org/elasticsearch/search/profile/SearchProfileShardResultsTests.java
+++ b/server/src/test/java/org/elasticsearch/search/profile/SearchProfileShardResultsTests.java
@@ -87,9 +87,9 @@
         }
         SearchProfileShardResults parsed;
         try (XContentParser parser = createParser(xContentType.xContent(), mutated)) {
-            ensureExpectedToken(parser.nextToken(), XContentParser.Token.START_OBJECT, parser::getTokenLocation);
+            ensureExpectedToken(XContentParser.Token.START_OBJECT, parser.nextToken(), parser::getTokenLocation);
             ensureFieldName(parser, parser.nextToken(), SearchProfileShardResults.PROFILE_FIELD);
-            ensureExpectedToken(parser.nextToken(), XContentParser.Token.START_OBJECT, parser::getTokenLocation);
+            ensureExpectedToken(XContentParser.Token.START_OBJECT, parser.nextToken(), parser::getTokenLocation);
             parsed = SearchProfileShardResults.fromXContent(parser);
             assertEquals(XContentParser.Token.END_OBJECT, parser.currentToken());
             assertEquals(XContentParser.Token.END_OBJECT, parser.nextToken());
