diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyEntityRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyEntityRegionAccessStrategy.java
index 4817752..bdbd282 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyEntityRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyEntityRegionAccessStrategy.java
@@ -50,11 +50,11 @@
 
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
