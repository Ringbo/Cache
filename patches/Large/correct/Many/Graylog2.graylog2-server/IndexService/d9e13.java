diff --git a/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/IndexService.java b/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/IndexService.java
index b838bab..600a4ac 100644
--- a/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/IndexService.java
+++ b/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/IndexService.java
@@ -103,7 +103,7 @@
 
     // Not part an Index model instance method because opening/closing can be applied to indices without calculated ranges.
     public void delete(String index) throws APIException, IOException {
-        api.path(routes.IndicesResource().single(index))
+        api.path(routes.IndicesResource().delete(index))
                 .timeout(apiTimeout("index_delete", 60, TimeUnit.SECONDS))
                 .expect(204)
                 .execute();
