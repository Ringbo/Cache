diff --git a/modules/portal/portal-cache-ehcache/src/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheManager.java b/modules/portal/portal-cache-ehcache/src/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheManager.java
index 129c16b..2e52ad6 100644
--- a/modules/portal/portal-cache-ehcache/src/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheManager.java
+++ b/modules/portal/portal-cache-ehcache/src/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheManager.java
@@ -67,12 +67,13 @@
 
 	@Override
 	public void reconfigureCaches(URL configurationURL) {
-		_configurationPair = EhcacheConfigurationHelperUtil.getConfiguration(
+		ObjectValuePair<Configuration, PortalCacheManagerConfiguration>
+			configurationPair = EhcacheConfigurationHelperUtil.getConfiguration(
 			configurationURL, isClusterAware(), _usingDefault, props);
 
-		reconfigEhcache(_configurationPair.getKey());
+		reconfigEhcache(configurationPair.getKey());
 
-		reconfigPortalCache(_configurationPair.getValue());
+		reconfigPortalCache(configurationPair.getValue());
 	}
 
 	public void setConfigFile(String configFile) {
