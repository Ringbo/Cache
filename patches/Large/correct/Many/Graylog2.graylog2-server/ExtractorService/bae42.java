diff --git a/src/main/java/org/graylog2/restclient/models/ExtractorService.java b/src/main/java/org/graylog2/restclient/models/ExtractorService.java
index 5b54c57..55d1d39 100644
--- a/src/main/java/org/graylog2/restclient/models/ExtractorService.java
+++ b/src/main/java/org/graylog2/restclient/models/ExtractorService.java
@@ -47,7 +47,7 @@
     }
 
     public void delete(Node node, Input input, String extractorId) throws IOException, APIException {
-        api.path(resource.terminate(input.getId(), extractorId))
+        api.path(resource.removeExtractor(input.getId(), extractorId))
                 .node(node)
                 .expect(Http.Status.NO_CONTENT)
                 .execute();
