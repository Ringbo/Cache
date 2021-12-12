diff --git a/connections/infinispan/src/main/java/org/keycloak/connections/infinispan/DefaultInfinispanConnectionProviderFactory.java b/connections/infinispan/src/main/java/org/keycloak/connections/infinispan/DefaultInfinispanConnectionProviderFactory.java
index bc2635c..d1e7ac6 100755
--- a/connections/infinispan/src/main/java/org/keycloak/connections/infinispan/DefaultInfinispanConnectionProviderFactory.java
+++ b/connections/infinispan/src/main/java/org/keycloak/connections/infinispan/DefaultInfinispanConnectionProviderFactory.java
@@ -69,7 +69,7 @@
 
                     // Backwards compatibility
                     if (cacheManager.getCacheConfiguration(InfinispanConnectionProvider.OFFLINE_SESSION_CACHE_NAME) == null) {
-                        logger.warnf("No configuration provided for '%s' cache. Using '%s' configuration as template",
+                        logger.debugf("No configuration provided for '%s' cache. Using '%s' configuration as template",
                                 InfinispanConnectionProvider.OFFLINE_SESSION_CACHE_NAME, InfinispanConnectionProvider.SESSION_CACHE_NAME);
 
                         Configuration sessionCacheConfig = cacheManager.getCacheConfiguration(InfinispanConnectionProvider.SESSION_CACHE_NAME);
