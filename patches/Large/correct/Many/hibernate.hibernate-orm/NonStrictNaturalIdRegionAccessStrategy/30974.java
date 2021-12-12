diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictNaturalIdRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictNaturalIdRegionAccessStrategy.java
index 747a7de..23317ac 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictNaturalIdRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/NonStrictNaturalIdRegionAccessStrategy.java
@@ -50,11 +50,11 @@
 
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
