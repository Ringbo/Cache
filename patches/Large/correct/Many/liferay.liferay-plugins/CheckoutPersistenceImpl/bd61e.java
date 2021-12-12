diff --git a/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/CheckoutPersistenceImpl.java b/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/CheckoutPersistenceImpl.java
index 7b6ed07..9790355 100644
--- a/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/CheckoutPersistenceImpl.java
+++ b/portlets/ams-portlet/docroot/WEB-INF/src/com/liferay/ams/service/persistence/CheckoutPersistenceImpl.java
@@ -130,7 +130,7 @@
 			CacheRegistryUtil.clear(CheckoutImpl.class.getName());
 		}
 
-		EntityCacheUtil.clearCache(CheckoutImpl.class);
+		EntityCacheUtil.clearCache(CheckoutImpl.class.getName());
 
 		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
 		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
@@ -302,7 +302,7 @@
 		}
 
 		EntityCacheUtil.putResult(CheckoutModelImpl.ENTITY_CACHE_ENABLED,
-			CheckoutImpl.class, checkout.getPrimaryKey(), checkout, false);
+			CheckoutImpl.class, checkout.getPrimaryKey(), checkout);
 
 		checkout.resetOriginalValues();
 
