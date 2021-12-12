diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyNaturalIdRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyNaturalIdRegionAccessStrategy.java
index 302ba5f..625dc87 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyNaturalIdRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadOnlyNaturalIdRegionAccessStrategy.java
@@ -49,11 +49,11 @@
 
 	@Override
 	public Object generateCacheKey(Object[] naturalIdValues, EntityPersister persister, SharedSessionContractImplementor session) {
-		return DefaultCacheKeysFactory.createNaturalIdKey( naturalIdValues, persister, session );
+		return DefaultCacheKeysFactory.staticCreateNaturalIdKey( naturalIdValues, persister, session );
 	}
 
 	@Override
 	public Object[] getNaturalIdValues(Object cacheKey) {
-		return DefaultCacheKeysFactory.getNaturalIdValues( cacheKey );
+		return DefaultCacheKeysFactory.staticGetNaturalIdValues( cacheKey );
 	}
 }
