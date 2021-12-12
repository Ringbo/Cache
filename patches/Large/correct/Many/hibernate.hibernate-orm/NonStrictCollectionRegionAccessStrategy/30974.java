diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictCollectionRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictCollectionRegionAccessStrategy.java
index 827185a..716e1d7 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictCollectionRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictCollectionRegionAccessStrategy.java
@@ -28,12 +28,12 @@
 
 	@Override
 	public Object generateCacheKey(Object id, CollectionPersister persister, SessionFactoryImplementor factory, String tenantIdentifier) {
-		return DefaultCacheKeysFactory.createCollectionKey( id, persister, factory, tenantIdentifier );
+		return DefaultCacheKeysFactory.staticCreateCollectionKey( id, persister, factory, tenantIdentifier );
 	}
 
 	@Override
 	public Object getCacheKeyId(Object cacheKey) {
-		return DefaultCacheKeysFactory.getCollectionId( cacheKey );
+		return DefaultCacheKeysFactory.staticGetCollectionId( cacheKey );
 	}
 
 	@Override
