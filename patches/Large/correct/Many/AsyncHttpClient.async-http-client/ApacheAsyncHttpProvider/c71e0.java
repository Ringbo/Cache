diff --git a/providers/apache/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java b/providers/apache/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
index 1291eb0..201a377 100644
--- a/providers/apache/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
+++ b/providers/apache/src/main/java/com/ning/http/client/providers/apache/ApacheAsyncHttpProvider.java
@@ -345,7 +345,7 @@
 
             if (proxyServer.getPrincipal() != null) {
                 Credentials defaultcreds = new UsernamePasswordCredentials(proxyServer.getPrincipal(), proxyServer.getPassword());
-                client.getState().setCredentials(new AuthScope(null, -1, AuthScope.ANY_REALM), defaultcreds);
+                client.getState().setProxyCredentials(new AuthScope(null, -1, AuthScope.ANY_REALM), defaultcreds);
             }
 
             ProxyHost proxyHost = proxyServer == null ? null : new ProxyHost(proxyServer.getHost(), proxyServer.getPort());
