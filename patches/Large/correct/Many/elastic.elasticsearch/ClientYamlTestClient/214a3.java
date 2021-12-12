diff --git a/test/framework/src/main/java/org/elasticsearch/test/rest/yaml/ClientYamlTestClient.java b/test/framework/src/main/java/org/elasticsearch/test/rest/yaml/ClientYamlTestClient.java
index aa51efa..082a4fc 100644
--- a/test/framework/src/main/java/org/elasticsearch/test/rest/yaml/ClientYamlTestClient.java
+++ b/test/framework/src/main/java/org/elasticsearch/test/rest/yaml/ClientYamlTestClient.java
@@ -124,7 +124,7 @@
             if (supportedMethods.contains("GET") && RandomizedTest.rarely()) {
                 logger.debug("sending the request body as source param with GET method");
                 queryStringParams.put("source", body);
-                if (esVersion.after(Version.V_5_3_0_UNRELEASED)) { // TODO make onOrAfter with backport
+                if (esVersion.onOrAfter(Version.V_5_3_0_UNRELEASED)) {
                     queryStringParams.put("source_content_type", ContentType.APPLICATION_JSON.toString());
                 }
                 requestMethod = "GET";
