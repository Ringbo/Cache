diff --git a/test/framework/src/main/java/org/elasticsearch/test/rest/yaml/ClientYamlTestResponse.java b/test/framework/src/main/java/org/elasticsearch/test/rest/yaml/ClientYamlTestResponse.java
index f47cfd6..3e30823 100644
--- a/test/framework/src/main/java/org/elasticsearch/test/rest/yaml/ClientYamlTestResponse.java
+++ b/test/framework/src/main/java/org/elasticsearch/test/rest/yaml/ClientYamlTestResponse.java
@@ -83,7 +83,7 @@
         List<String> warningHeaders = new ArrayList<>();
         for (Header header : response.getHeaders()) {
             if (header.getName().equals("Warning")) {
-                if (nodeVersion.after(Version.V_5_3_0_UNRELEASED) && response.getRequestLine().getMethod().equals("GET")
+                if (nodeVersion.onOrAfter(Version.V_5_3_0_UNRELEASED) && response.getRequestLine().getMethod().equals("GET")
                     && response.getRequestLine().getUri().contains("source")
                     && response.getRequestLine().getUri().contains("source_content_type") == false && header.getValue().startsWith(
                         "Deprecated use of the [source] parameter without the [source_content_type] parameter.")) {
