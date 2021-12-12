diff --git a/server/src/main/java/org/elasticsearch/search/profile/ProfileResult.java b/server/src/main/java/org/elasticsearch/search/profile/ProfileResult.java
index d0965bc..e54639b 100644
--- a/server/src/main/java/org/elasticsearch/search/profile/ProfileResult.java
+++ b/server/src/main/java/org/elasticsearch/search/profile/ProfileResult.java
@@ -196,9 +196,9 @@
             } else if (token == XContentParser.Token.START_OBJECT) {
                 if (BREAKDOWN.match(currentFieldName, parser.getDeprecationHandler())) {
                     while ((token = parser.nextToken()) != XContentParser.Token.END_OBJECT) {
-                        ensureExpectedToken(parser.currentToken(), XContentParser.Token.FIELD_NAME, parser::getTokenLocation);
+                        ensureExpectedToken(XContentParser.Token.FIELD_NAME, parser.currentToken(), parser::getTokenLocation);
                         String name = parser.currentName();
-                        ensureExpectedToken(parser.nextToken(), XContentParser.Token.VALUE_NUMBER, parser::getTokenLocation);
+                        ensureExpectedToken(XContentParser.Token.VALUE_NUMBER, parser.nextToken(), parser::getTokenLocation);
                         long value = parser.longValue();
                         timings.put(name, value);
                     }
