diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
index c1cbf8d..3fd3708 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPHC4Impl.java
@@ -848,7 +848,7 @@
                 if (proxyUser.length() > 0) {                   
                     ((AbstractHttpClient) httpClient).getCredentialsProvider().setCredentials(
                             new AuthScope(proxyHost, proxyPort),
-                            new NTCredentials(proxyUser, proxyPass, localHost, PROXY_DOMAIN));
+                            new NTCredentials(proxyUser, proxyPass, LOCALHOST, PROXY_DOMAIN));
                 }
             }
 
@@ -1132,7 +1132,7 @@
             ((AbstractHttpClient) client).getCredentialsProvider();
         if (authManager != null) {
             if(authManager.hasAuthForURL(url)) {
-                authManager.setupCredentials(client, url, credentialsProvider, localHost);
+                authManager.setupCredentials(client, url, credentialsProvider, LOCALHOST);
             } else {
                 credentialsProvider.clear();
             }
