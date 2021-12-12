diff --git a/src/main/java/org/elasticsearch/watcher/support/WatcherUtils.java b/src/main/java/org/elasticsearch/watcher/support/WatcherUtils.java
index cc81423..0d858dc 100644
--- a/src/main/java/org/elasticsearch/watcher/support/WatcherUtils.java
+++ b/src/main/java/org/elasticsearch/watcher/support/WatcherUtils.java
@@ -189,7 +189,7 @@
                                 throw new SearchRequestParseException("could not read search request. unexpected template field [" + currentFieldName + "]");
                             }
                         } else if (token == XContentParser.Token.START_OBJECT) {
-                            if (TEMPLATE_TYPE_FIELD.getPreferredName().equals(currentFieldName)) {
+                            if (TEMPLATE_PARAMS_FIELD.getPreferredName().equals(currentFieldName)) {
                                 searchRequest.templateParams(flattenModel(parser.map()));
                             }
                         } else {
