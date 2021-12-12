diff --git a/src/main/java/com/ning/http/client/SimpleAsyncHttpClient.java b/src/main/java/com/ning/http/client/SimpleAsyncHttpClient.java
index cb35755..8377fbe 100644
--- a/src/main/java/com/ning/http/client/SimpleAsyncHttpClient.java
+++ b/src/main/java/com/ning/http/client/SimpleAsyncHttpClient.java
@@ -407,12 +407,12 @@
             return this;
         }
 
-        public DerivedBuilder setMaximumConnectionsPerHost(int defaultMaxConnectionPerHost) {
+        public Builder setMaximumConnectionsPerHost(int defaultMaxConnectionPerHost) {
             configBuilder.setMaximumConnectionsPerHost(defaultMaxConnectionPerHost);
             return this;
         }
 
-        public DerivedBuilder setConnectionTimeoutInMs(int connectionTimeuot) {
+        public Builder setConnectionTimeoutInMs(int connectionTimeuot) {
             configBuilder.setConnectionTimeoutInMs(connectionTimeuot);
             return this;
         }
@@ -427,52 +427,52 @@
             return this;
         }
 
-        public DerivedBuilder setMaximumNumberOfRedirects(int maxDefaultRedirects) {
+        public Builder setMaximumNumberOfRedirects(int maxDefaultRedirects) {
             configBuilder.setMaximumNumberOfRedirects(maxDefaultRedirects);
             return this;
         }
 
-        public DerivedBuilder setCompressionEnabled(boolean compressionEnabled) {
+        public Builder setCompressionEnabled(boolean compressionEnabled) {
             configBuilder.setCompressionEnabled(compressionEnabled);
             return this;
         }
 
-        public DerivedBuilder setUserAgent(String userAgent) {
+        public Builder setUserAgent(String userAgent) {
             configBuilder.setUserAgent(userAgent);
             return this;
         }
 
-        public DerivedBuilder setAllowPoolingConnection(boolean allowPoolingConnection) {
+        public Builder setAllowPoolingConnection(boolean allowPoolingConnection) {
             configBuilder.setAllowPoolingConnection(allowPoolingConnection);
             return this;
         }
 
-        public DerivedBuilder setScheduledExecutorService(ScheduledExecutorService reaper) {
+        public Builder setScheduledExecutorService(ScheduledExecutorService reaper) {
             configBuilder.setScheduledExecutorService(reaper);
             return this;
         }
 
-        public DerivedBuilder setExecutorService(ExecutorService applicationThreadPool) {
+        public Builder setExecutorService(ExecutorService applicationThreadPool) {
             configBuilder.setExecutorService(applicationThreadPool);
             return this;
         }
 
-        public DerivedBuilder setSSLEngineFactory(SSLEngineFactory sslEngineFactory) {
+        public Builder setSSLEngineFactory(SSLEngineFactory sslEngineFactory) {
             configBuilder.setSSLEngineFactory(sslEngineFactory);
             return this;
         }
 
-        public DerivedBuilder setSSLContext(final SSLContext sslContext) {
+        public Builder setSSLContext(final SSLContext sslContext) {
             configBuilder.setSSLContext(sslContext);
             return this;
         }
 
-        public DerivedBuilder setRequestCompressionLevel(int requestCompressionLevel) {
+        public Builder setRequestCompressionLevel(int requestCompressionLevel) {
             configBuilder.setRequestCompressionLevel(requestCompressionLevel);
             return this;
         }
 
-        public DerivedBuilder setRealmDomain(String domain) {
+        public Builder setRealmDomain(String domain) {
             realm().setDomain(domain);
             return this;
         }
@@ -482,27 +482,27 @@
             return this;
         }
 
-        public DerivedBuilder setRealmPassword(String password) {
+        public Builder setRealmPassword(String password) {
             realm().setPassword(password);
             return this;
         }
 
-        public DerivedBuilder setRealmScheme(Realm.AuthScheme scheme) {
+        public Builder setRealmScheme(Realm.AuthScheme scheme) {
             realm().setScheme(scheme);
             return this;
         }
 
-        public DerivedBuilder setRealmName(String realmName) {
+        public Builder setRealmName(String realmName) {
             realm().setRealmName(realmName);
             return this;
         }
 
-        public DerivedBuilder setRealmUsePreemptiveAuth(boolean usePreemptiveAuth) {
+        public Builder setRealmUsePreemptiveAuth(boolean usePreemptiveAuth) {
             realm().setUsePreemptiveAuth(usePreemptiveAuth);
             return this;
         }
 
-        public DerivedBuilder setRealmEnconding(String enc) {
+        public Builder setRealmEnconding(String enc) {
             realm().setEnconding(enc);
             return this;
         }
@@ -517,22 +517,22 @@
             return this;
         }
 
-        public DerivedBuilder setProxyPrincipal(String principal) {
+        public Builder setProxyPrincipal(String principal) {
             this.proxyPrincipal = principal;
             return this;
         }
 
-        public DerivedBuilder setProxyPassword(String password) {
+        public Builder setProxyPassword(String password) {
             this.proxyPassword = password;
             return this;
         }
 
-        public DerivedBuilder setProxyPort(int port) {
+        public Builder setProxyPort(int port) {
             this.proxyPort = port;
             return this;
         }
         
-        public DerivedBuilder setDefaultThrowableHandler(ThrowableHandler throwableHandler)
+        public Builder setDefaultThrowableHandler(ThrowableHandler throwableHandler)
         {
             this.defaultThrowableHandler = throwableHandler;
             return this;
