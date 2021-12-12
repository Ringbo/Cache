diff --git a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteNaturalIdRegionAccessStrategy.java b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteNaturalIdRegionAccessStrategy.java
index d92ae39..722cb49 100644
--- a/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteNaturalIdRegionAccessStrategy.java
+++ b/hibernate-jcache/src/main/java/org/hibernate/cache/jcache/access/ReadWriteNaturalIdRegionAccessStrategy.java
@@ -71,11 +71,11 @@
 
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
