diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteEntityRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteEntityRegionAccessStrategy.java
index b5404e9..75f8f27 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteEntityRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteEntityRegionAccessStrategy.java
@@ -72,11 +72,11 @@
 
 	@Override
 	public Object generateCacheKey(Object id, EntityPersister persister, SessionFactoryImplementor factory, String tenantIdentifier) {
-		return DefaultCacheKeysFactory.createEntityKey( id, persister, factory, tenantIdentifier );
+		return DefaultCacheKeysFactory.staticCreateEntityKey( id, persister, factory, tenantIdentifier );
 	}
 
 	@Override
 	public Object getCacheKeyId(Object cacheKey) {
-		return DefaultCacheKeysFactory.getEntityId( cacheKey );
+		return DefaultCacheKeysFactory.staticGetEntityId( cacheKey );
 	}
 }
