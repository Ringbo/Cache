diff --git a/mockserver-maven-plugin-integration-tests/src/integration-tests/mockserver-initializer-main-classpath/src/test/java/org/mockserver/InitializerMavenPluginTest.java b/mockserver-maven-plugin-integration-tests/src/integration-tests/mockserver-initializer-main-classpath/src/test/java/org/mockserver/InitializerMavenPluginTest.java
index 910dd6e..23bc310 100644
--- a/mockserver-maven-plugin-integration-tests/src/integration-tests/mockserver-initializer-main-classpath/src/test/java/org/mockserver/InitializerMavenPluginTest.java
+++ b/mockserver-maven-plugin-integration-tests/src/integration-tests/mockserver-initializer-main-classpath/src/test/java/org/mockserver/InitializerMavenPluginTest.java
@@ -79,7 +79,7 @@
 
     protected HttpResponse makeRequest(HttpRequest httpRequest, Collection<String> headersToIgnore) {
         int port = (httpRequest.isSecure() ? SERVER_HTTPS_PORT : SERVER_HTTP_PORT);
-        HttpResponse httpResponse = httpClient.sendRequest(outboundRequest("localhost", port, httpRequest));
+        HttpResponse httpResponse = httpClient.sendRequest(outboundRequest("localhost", port, "", httpRequest));
         List<Header> headers = new ArrayList<Header>();
         for (Header header : httpResponse.getHeaders()) {
             if (!headersToIgnore.contains(header.getName().toLowerCase())) {
