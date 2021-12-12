diff --git a/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/DefinitionPersistenceImpl.java b/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/DefinitionPersistenceImpl.java
index fb7d34e..8686638 100644
--- a/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/DefinitionPersistenceImpl.java
+++ b/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/DefinitionPersistenceImpl.java
@@ -130,7 +130,7 @@
 			CacheRegistryUtil.clear(DefinitionImpl.class.getName());
 		}
 
-		EntityCacheUtil.clearCache(DefinitionImpl.class);
+		EntityCacheUtil.clearCache(DefinitionImpl.class.getName());
 
 		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
 		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
@@ -303,7 +303,7 @@
 		}
 
 		EntityCacheUtil.putResult(DefinitionModelImpl.ENTITY_CACHE_ENABLED,
-			DefinitionImpl.class, definition.getPrimaryKey(), definition, false);
+			DefinitionImpl.class, definition.getPrimaryKey(), definition);
 
 		definition.resetOriginalValues();
 
