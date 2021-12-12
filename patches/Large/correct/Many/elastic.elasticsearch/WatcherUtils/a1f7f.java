diff --git a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/WatcherUtils.java b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/WatcherUtils.java
index 97d7e91..bc3cceb 100644
--- a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/WatcherUtils.java
+++ b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/WatcherUtils.java
@@ -113,7 +113,7 @@
             if (token == XContentParser.Token.FIELD_NAME) {
                 currentFieldName = parser.currentName();
                 if (ParseFieldMatcher.STRICT.match(currentFieldName, BODY_FIELD)) {
-                    searchRequest.source(SearchSourceBuilder.parseSearchSource(parser, context, aggParsers, suggesters));
+                    searchRequest.source(SearchSourceBuilder.fromXContent(parser, context, aggParsers, suggesters));
                 }
             } else if (token == XContentParser.Token.START_ARRAY) {
                 if (ParseFieldMatcher.STRICT.match(currentFieldName, INDICES_FIELD)) {
