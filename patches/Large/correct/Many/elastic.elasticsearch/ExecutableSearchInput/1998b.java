diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/watcher/input/search/ExecutableSearchInput.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/watcher/input/search/ExecutableSearchInput.java
index 8672149..460e858 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/watcher/input/search/ExecutableSearchInput.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/watcher/input/search/ExecutableSearchInput.java
@@ -79,7 +79,7 @@
 
         final Payload payload;
         if (input.getExtractKeys() != null) {
-            BytesReference bytes = XContentHelper.toXContent(response, XContentType.JSON);
+            BytesReference bytes = XContentHelper.toXContent(response, XContentType.JSON, false);
             // EMPTY is safe here because we never use namedObject
             try (XContentParser parser = XContentHelper.createParser(NamedXContentRegistry.EMPTY, bytes)) {
                 Map<String, Object> filteredKeys = XContentFilterKeysUtils.filterMapOrdered(input.getExtractKeys(), parser);
