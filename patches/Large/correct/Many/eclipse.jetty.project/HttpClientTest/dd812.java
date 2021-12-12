diff --git a/jetty-spdy/spdy-http-client-transport/src/test/java/org/eclipse/jetty/spdy/client/http/HttpClientTest.java b/jetty-spdy/spdy-http-client-transport/src/test/java/org/eclipse/jetty/spdy/client/http/HttpClientTest.java
index 4fa7017..871e9d7 100644
--- a/jetty-spdy/spdy-http-client-transport/src/test/java/org/eclipse/jetty/spdy/client/http/HttpClientTest.java
+++ b/jetty-spdy/spdy-http-client-transport/src/test/java/org/eclipse/jetty/spdy/client/http/HttpClientTest.java
@@ -243,7 +243,7 @@
         ContentResponse response = client.POST(scheme + "://localhost:" + connector.getLocalPort() + "/?b=1")
                 .param(paramName, paramValue)
                 .content(new BytesContentProvider(content))
-                .timeout(555, TimeUnit.SECONDS)
+                .timeout(5, TimeUnit.SECONDS)
                 .send();
 
         Assert.assertNotNull(response);
