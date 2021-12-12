diff --git a/mockserver-maven-plugin-integration-tests/src/integration-tests/mockserver-initializer-main-classpath/src/test/java/org/mockserver/ClientServerMavenPluginIntegrationTest.java b/mockserver-maven-plugin-integration-tests/src/integration-tests/mockserver-initializer-main-classpath/src/test/java/org/mockserver/ClientServerMavenPluginIntegrationTest.java
index 7a68698..5aabd81 100644
--- a/mockserver-maven-plugin-integration-tests/src/integration-tests/mockserver-initializer-main-classpath/src/test/java/org/mockserver/ClientServerMavenPluginIntegrationTest.java
+++ b/mockserver-maven-plugin-integration-tests/src/integration-tests/mockserver-initializer-main-classpath/src/test/java/org/mockserver/ClientServerMavenPluginIntegrationTest.java
@@ -60,7 +60,7 @@
     }
 
     protected HttpResponse makeRequest(HttpRequest httpRequest) {
-        HttpResponse httpResponse = apacheHttpClient.sendRequest(httpRequest);
+        HttpResponse httpResponse = apacheHttpClient.sendRequest(httpRequest, false);
         List<Header> headers = new ArrayList<Header>();
         for (Header header : httpResponse.getHeaders()) {
             if (!(header.getName().equals("Server") || header.getName().equals("Expires") || header.getName().equals("Date") || header.getName().equals("Connection"))) {
