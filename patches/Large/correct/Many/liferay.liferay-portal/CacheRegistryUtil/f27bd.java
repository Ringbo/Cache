diff --git a/portal-service/src/com/liferay/portal/kernel/cache/CacheRegistryUtil.java b/portal-service/src/com/liferay/portal/kernel/cache/CacheRegistryUtil.java
index f7a290d..e72b30f 100644
--- a/portal-service/src/com/liferay/portal/kernel/cache/CacheRegistryUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/cache/CacheRegistryUtil.java
@@ -139,8 +139,7 @@
 			ServiceReference<CacheRegistryItem> serviceReference,
 			CacheRegistryItem cacheRegistryItem) {
 
-			_cacheRegistryItems.put(
-				cacheRegistryItem.getRegistryName(), cacheRegistryItem);
+			_cacheRegistryItems.remove(cacheRegistryItem.getRegistryName());
 		}
 
 	}
