diff --git a/src/test/java/com/github/tomakehurst/wiremock/testsupport/WireMockTestClient.java b/src/test/java/com/github/tomakehurst/wiremock/testsupport/WireMockTestClient.java
old mode 100644
new mode 100755
index 16047a8..984201b
--- a/src/test/java/com/github/tomakehurst/wiremock/testsupport/WireMockTestClient.java
+++ b/src/test/java/com/github/tomakehurst/wiremock/testsupport/WireMockTestClient.java
@@ -77,7 +77,7 @@
     public WireMockResponse get(String url, TestHttpHeader... headers) {
         String actualUrl = URI.create(url).isAbsolute() ? url : mockServiceUrlFor(url);
         HttpUriRequest httpRequest = new HttpGet(actualUrl);
-        return executeMethodAndCovertExceptions(httpRequest, headers);
+        return executeMethodAndConvertExceptions(httpRequest, headers);
     }
 
     public WireMockResponse getViaProxy(String url) {
@@ -111,7 +111,7 @@
 
     public WireMockResponse put(String url, TestHttpHeader... headers) {
         HttpUriRequest httpRequest = new HttpPut(mockServiceUrlFor(url));
-        return executeMethodAndCovertExceptions(httpRequest, headers);
+        return executeMethodAndConvertExceptions(httpRequest, headers);
     }
 
     public WireMockResponse putWithBody(String url, String body, String contentType, TestHttpHeader... headers) {
@@ -127,7 +127,7 @@
     private WireMockResponse requestWithBody(
         HttpEntityEnclosingRequestBase request, String body, String contentType, TestHttpHeader... headers) {
         request.setEntity(new StringEntity(body, ContentType.create(contentType, "utf-8")));
-        return executeMethodAndCovertExceptions(request, headers);
+        return executeMethodAndConvertExceptions(request, headers);
     }
 
     public WireMockResponse postWithBody(String url, String body, String bodyMimeType, String bodyEncoding) {
@@ -141,7 +141,7 @@
     public WireMockResponse post(String url, HttpEntity entity) {
         HttpPost httpPost = new HttpPost(mockServiceUrlFor(url));
         httpPost.setEntity(entity);
-        return executeMethodAndCovertExceptions(httpPost);
+        return executeMethodAndConvertExceptions(httpPost);
     }
 
     public WireMockResponse patchWithBody(String url, String body, String bodyMimeType, String bodyEncoding) {
@@ -151,7 +151,7 @@
     public WireMockResponse patch(String url, HttpEntity entity) {
         HttpPatch httpPatch = new HttpPatch(mockServiceUrlFor(url));
         httpPatch.setEntity(entity);
-        return executeMethodAndCovertExceptions(httpPatch);
+        return executeMethodAndConvertExceptions(httpPatch);
     }
 
     public void addResponse(String responseSpecJson) {
@@ -194,7 +194,7 @@
         return postJsonAndReturnStatus(url, null);
     }
 
-    private WireMockResponse executeMethodAndCovertExceptions(HttpUriRequest httpRequest, TestHttpHeader... headers) {
+    private WireMockResponse executeMethodAndConvertExceptions(HttpUriRequest httpRequest, TestHttpHeader... headers) {
         try {
             for (TestHttpHeader header : headers) {
                 httpRequest.addHeader(header.getName(), header.getValue());
@@ -218,7 +218,7 @@
 
     public WireMockResponse request(final String methodName, String url, TestHttpHeader... headers) {
         HttpUriRequest httpRequest = new GenericHttpUriRequest(methodName, mockServiceUrlFor(url));
-        return executeMethodAndCovertExceptions(httpRequest, headers);
+        return executeMethodAndConvertExceptions(httpRequest, headers);
     }
 
 }
