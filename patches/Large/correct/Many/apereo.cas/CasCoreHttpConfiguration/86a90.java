diff --git a/core/cas-server-core-web/src/main/java/org/apereo/cas/config/CasCoreHttpConfiguration.java b/core/cas-server-core-web/src/main/java/org/apereo/cas/config/CasCoreHttpConfiguration.java
index 6a11850..765e4a2 100644
--- a/core/cas-server-core-web/src/main/java/org/apereo/cas/config/CasCoreHttpConfiguration.java
+++ b/core/cas-server-core-web/src/main/java/org/apereo/cas/config/CasCoreHttpConfiguration.java
@@ -45,7 +45,7 @@
     @ConditionalOnMissingBean(name = "trustStoreSslSocketFactory")
     @Bean
     public SSLConnectionSocketFactory trustStoreSslSocketFactory() {
-        return new SSLConnectionSocketFactory(sslContext());
+        return new SSLConnectionSocketFactory(sslContext(), hostnameVerifier());
     }
 
     @ConditionalOnMissingBean(name = "sslContext")
