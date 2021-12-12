diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictEntityRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictEntityRegionAccessStrategy.java
index b361770..727b60e 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictEntityRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictEntityRegionAccessStrategy.java
@@ -53,12 +53,12 @@
 
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
 
 	@Override
