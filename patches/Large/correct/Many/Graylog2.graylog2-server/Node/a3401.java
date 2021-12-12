diff --git a/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/Node.java b/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/Node.java
index 38b5aaf..2056472 100644
--- a/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/Node.java
+++ b/graylog2-rest-client/src/main/java/org/graylog2/restclient/models/Node.java
@@ -285,11 +285,11 @@
     }
 
     public Map<String, String> getInputTypes() throws IOException, APIException {
-        return api.path(routes.InputsResource().types(), InputTypesResponse.class).node(this).execute().types;
+        return api.path(routes.InputTypesResource().types(), InputTypesResponse.class).node(this).execute().types;
     }
 
     public InputTypeSummaryResponse getInputTypeInformation(String type) throws IOException, APIException {
-        return api.path(routes.InputsResource().info(type), InputTypeSummaryResponse.class).node(this).execute();
+        return api.path(routes.InputTypesResource().info(type), InputTypeSummaryResponse.class).node(this).execute();
     }
 
     public Map<String, InputTypeSummaryResponse> getAllInputTypeInformation() throws IOException, APIException {
