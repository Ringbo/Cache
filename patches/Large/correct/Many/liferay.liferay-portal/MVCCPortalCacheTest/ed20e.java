diff --git a/portal-impl/test/unit/com/liferay/portal/cache/mvcc/MVCCPortalCacheTest.java b/portal-impl/test/unit/com/liferay/portal/cache/mvcc/MVCCPortalCacheTest.java
index c27332b..e2c755c 100644
--- a/portal-impl/test/unit/com/liferay/portal/cache/mvcc/MVCCPortalCacheTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/cache/mvcc/MVCCPortalCacheTest.java
@@ -82,7 +82,7 @@
 				_PORTAL_CACHE_NAME, 16));
 
 		Serializable key = _KEY_1;
-		Object value = new MockMVCCModel(_VERSION_1);
+		MVCCModel value = new MockMVCCModel(_VERSION_1);
 
 		mvccPortalCache.put(key, value);
 		mvccPortalCache.put(key, value, 10);
