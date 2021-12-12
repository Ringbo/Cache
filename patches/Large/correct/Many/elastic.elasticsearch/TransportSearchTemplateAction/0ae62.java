diff --git a/modules/lang-mustache/src/main/java/org/elasticsearch/script/mustache/TransportSearchTemplateAction.java b/modules/lang-mustache/src/main/java/org/elasticsearch/script/mustache/TransportSearchTemplateAction.java
index 360e332..7d4dddc 100644
--- a/modules/lang-mustache/src/main/java/org/elasticsearch/script/mustache/TransportSearchTemplateAction.java
+++ b/modules/lang-mustache/src/main/java/org/elasticsearch/script/mustache/TransportSearchTemplateAction.java
@@ -112,7 +112,7 @@
         try (XContentParser parser = XContentFactory.xContent(XContentType.JSON)
                 .createParser(xContentRegistry, LoggingDeprecationHandler.INSTANCE, source)) {
             SearchSourceBuilder builder = SearchSourceBuilder.searchSource();
-            builder.parseXContent(parser, true);
+            builder.parseXContent(parser, false);
             builder.explain(searchTemplateRequest.isExplain());
             builder.profile(searchTemplateRequest.isProfile());
             searchRequest.source(builder);
