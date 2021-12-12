diff --git a/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/AssetPersistenceImpl.java b/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/AssetPersistenceImpl.java
index 971a2a6..5aa2f62 100644
--- a/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/AssetPersistenceImpl.java
+++ b/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/AssetPersistenceImpl.java
@@ -131,7 +131,7 @@
 			CacheRegistryUtil.clear(AssetImpl.class.getName());
 		}
 
-		EntityCacheUtil.clearCache(AssetImpl.class);
+		EntityCacheUtil.clearCache(AssetImpl.class.getName());
 
 		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
 		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
@@ -302,7 +302,7 @@
 		}
 
 		EntityCacheUtil.putResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
-			AssetImpl.class, asset.getPrimaryKey(), asset, false);
+			AssetImpl.class, asset.getPrimaryKey(), asset);
 
 		asset.resetOriginalValues();
 
