diff --git a/hibernate-core/src/main/java/org/hibernate/cache/spi/support/AbstractReadWriteAccess.java b/hibernate-core/src/main/java/org/hibernate/cache/spi/support/AbstractReadWriteAccess.java
index c3a2e1c..29154d6 100644
--- a/hibernate-core/src/main/java/org/hibernate/cache/spi/support/AbstractReadWriteAccess.java
+++ b/hibernate-core/src/main/java/org/hibernate/cache/spi/support/AbstractReadWriteAccess.java
@@ -64,7 +64,7 @@
 	 */
 	@Override
 	public Object get(SharedSessionContractImplementor session, Object key) {
-		log.debugf( "Getting cached data from region [`%s` (%s)] by key [%s]", getRegion().getName(), key );
+		log.debugf( "Getting cached data from region [`%s` (%s)] by key [%s]", getRegion().getName(), getAccessType(), key );
 		try {
 			readLock.lock();
 			Lockable item = (Lockable) getStorageAccess().getFromCache( key, session );
