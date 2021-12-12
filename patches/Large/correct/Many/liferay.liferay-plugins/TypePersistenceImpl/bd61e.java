diff --git a/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/TypePersistenceImpl.java b/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/TypePersistenceImpl.java
index 47f82bb..f81d1a5 100644
--- a/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/TypePersistenceImpl.java
+++ b/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/TypePersistenceImpl.java
@@ -129,7 +129,7 @@
 			CacheRegistryUtil.clear(TypeImpl.class.getName());
 		}
 
-		EntityCacheUtil.clearCache(TypeImpl.class);
+		EntityCacheUtil.clearCache(TypeImpl.class.getName());
 
 		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
 		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
@@ -298,7 +298,7 @@
 		}
 
 		EntityCacheUtil.putResult(TypeModelImpl.ENTITY_CACHE_ENABLED,
-			TypeImpl.class, type.getPrimaryKey(), type, false);
+			TypeImpl.class, type.getPrimaryKey(), type);
 
 		type.resetOriginalValues();
 
