diff --git a/server/src/test/java/org/elasticsearch/search/profile/query/QueryProfileShardResultTests.java b/server/src/test/java/org/elasticsearch/search/profile/query/QueryProfileShardResultTests.java
index 6ffece3..103f8eb 100644
--- a/server/src/test/java/org/elasticsearch/search/profile/query/QueryProfileShardResultTests.java
+++ b/server/src/test/java/org/elasticsearch/search/profile/query/QueryProfileShardResultTests.java
@@ -59,7 +59,7 @@
 
         QueryProfileShardResult parsed;
         try (XContentParser parser = createParser(xContentType.xContent(), originalBytes)) {
-            XContentParserUtils.ensureExpectedToken(parser.nextToken(), XContentParser.Token.START_OBJECT, parser::getTokenLocation);
+            XContentParserUtils.ensureExpectedToken(XContentParser.Token.START_OBJECT, parser.nextToken(), parser::getTokenLocation);
             parsed = QueryProfileShardResult.fromXContent(parser);
             assertEquals(XContentParser.Token.END_OBJECT, parser.currentToken());
             assertNull(parser.nextToken());
