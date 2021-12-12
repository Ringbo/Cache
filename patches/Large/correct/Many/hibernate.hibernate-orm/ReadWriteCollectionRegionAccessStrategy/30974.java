diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteCollectionRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteCollectionRegionAccessStrategy.java
index 3635db6..c7611f2 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteCollectionRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteCollectionRegionAccessStrategy.java
@@ -26,12 +26,12 @@
 
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
