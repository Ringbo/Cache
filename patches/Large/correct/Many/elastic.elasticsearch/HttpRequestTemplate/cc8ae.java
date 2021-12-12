diff --git a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpRequestTemplate.java b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpRequestTemplate.java
index 109d839..d0bf97a 100644
--- a/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpRequestTemplate.java
+++ b/elasticsearch/x-pack/watcher/src/main/java/org/elasticsearch/watcher/support/http/HttpRequestTemplate.java
@@ -132,12 +132,12 @@
             request.setParams(mapBuilder.map());
         }
         if ((headers == null || headers.isEmpty()) && body != null && body.getContentType() != null) {
-            request.setHeaders(singletonMap(HttpHeaders.Names.CONTENT_TYPE, body.getContentType().restContentType()));
+            request.setHeaders(singletonMap(HttpHeaders.Names.CONTENT_TYPE, body.getContentType().mediaType()));
         } else if (headers != null && !headers.isEmpty()) {
             MapBuilder<String, String> mapBuilder = MapBuilder.newMapBuilder();
             if (body != null && body.getContentType() != null) {
                 // putting the content type first, so it can be overridden by custom headers
-                mapBuilder.put(HttpHeaders.Names.CONTENT_TYPE, body.getContentType().restContentType());
+                mapBuilder.put(HttpHeaders.Names.CONTENT_TYPE, body.getContentType().mediaType());
             }
             for (Map.Entry<String, TextTemplate> entry : headers.entrySet()) {
                 mapBuilder.put(entry.getKey(), engine.render(entry.getValue(), model));
