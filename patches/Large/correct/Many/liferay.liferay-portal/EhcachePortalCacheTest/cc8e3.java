diff --git a/modules/apps/foundation/portal-cache/portal-cache-ehcache/src/test/java/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheTest.java b/modules/apps/foundation/portal-cache/portal-cache-ehcache/src/test/java/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheTest.java
index 5f8a246..e878f74 100644
--- a/modules/apps/foundation/portal-cache/portal-cache-ehcache/src/test/java/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheTest.java
+++ b/modules/apps/foundation/portal-cache/portal-cache-ehcache/src/test/java/com/liferay/portal/cache/ehcache/internal/EhcachePortalCacheTest.java
@@ -369,7 +369,7 @@
 
 	@Test
 	public void testReconfigEhcache() {
-		Assert.assertSame(_ehcachePortalCache.ehcache, _ehcache);
+		Assert.assertSame(_ehcache, _ehcachePortalCache.ehcache);
 
 		_cacheManager.addCache(_PORTAL_CACHE_NAME_2);
 
@@ -377,7 +377,7 @@
 
 		_ehcachePortalCache.reconfigEhcache(ehcache2);
 
-		Assert.assertSame(_ehcachePortalCache.ehcache, ehcache2);
+		Assert.assertSame(ehcache2, _ehcachePortalCache.ehcache);
 
 		RegisteredEventListeners registeredEventListeners =
 			_ehcache.getCacheEventNotificationService();
