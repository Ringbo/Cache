diff --git a/modules/portal/portal-cache-ehcache/src/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheManager.java b/modules/portal/portal-cache-ehcache/src/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheManager.java
index 1136107..7d8ca07 100644
--- a/modules/portal/portal-cache-ehcache/src/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheManager.java
+++ b/modules/portal/portal-cache-ehcache/src/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheManager.java
@@ -183,7 +183,7 @@
 
 		setTransactionalCacheNames(
 			GetterUtil.getStringValues(
-				props.get(PropsKeys.TRANSACTIONAL_CACHE_NAMES)));
+				props.getArray(PropsKeys.TRANSACTIONAL_CACHE_NAMES)));
 
 		if (Validator.isNull(_configFile)) {
 			_configFile = _defaultConfigFile;
