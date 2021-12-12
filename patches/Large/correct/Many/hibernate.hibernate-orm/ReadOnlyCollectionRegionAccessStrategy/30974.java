diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyCollectionRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyCollectionRegionAccessStrategy.java
index 1139896..2279170 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyCollectionRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyCollectionRegionAccessStrategy.java
@@ -26,11 +26,11 @@
 
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
 }
