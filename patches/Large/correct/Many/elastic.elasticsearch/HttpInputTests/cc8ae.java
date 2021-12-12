diff --git a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/input/http/HttpInputTests.java b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/input/http/HttpInputTests.java
index dda4d18..7b65b2e 100644
--- a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/input/http/HttpInputTests.java
+++ b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/input/http/HttpInputTests.java
@@ -99,11 +99,11 @@
                 httpInput = InputBuilders.httpInput(request.build()).expectedResponseXContentType(HttpContentType.YAML).build();
                 break;
             case 3:
-                response = new HttpResponse(123, "{\"key\" : \"value\"}".getBytes(StandardCharsets.UTF_8), singletonMap(HttpHeaders.Names.CONTENT_TYPE, new String[] { XContentType.JSON.restContentType() }));
+                response = new HttpResponse(123, "{\"key\" : \"value\"}".getBytes(StandardCharsets.UTF_8), singletonMap(HttpHeaders.Names.CONTENT_TYPE, new String[] { XContentType.JSON.mediaType() }));
                 httpInput = InputBuilders.httpInput(request.build()).build();
                 break;
             case 4:
-                response = new HttpResponse(123, "key: value".getBytes(StandardCharsets.UTF_8), singletonMap(HttpHeaders.Names.CONTENT_TYPE, new String[] { XContentType.YAML.restContentType() }));
+                response = new HttpResponse(123, "key: value".getBytes(StandardCharsets.UTF_8), singletonMap(HttpHeaders.Names.CONTENT_TYPE, new String[] { XContentType.YAML.mediaType() }));
                 httpInput = InputBuilders.httpInput(request.build()).build();
                 break;
             case 5:
