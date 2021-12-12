diff --git a/modules/cpr/src/main/java/org/atmosphere/pool/UnboundedApachePoolableProvider.java b/modules/cpr/src/main/java/org/atmosphere/pool/UnboundedApachePoolableProvider.java
index ce17f15..713aac4 100644
--- a/modules/cpr/src/main/java/org/atmosphere/pool/UnboundedApachePoolableProvider.java
+++ b/modules/cpr/src/main/java/org/atmosphere/pool/UnboundedApachePoolableProvider.java
@@ -66,7 +66,7 @@
 
     @Override
     public PoolableProvider returnBroadcaster(Broadcaster b) {
-        logger.info("Return Object {} now at size {}", b, count.getAndDecrement());
+        logger.trace("Return Object {} now at size {}", b, count.getAndDecrement());
         try {
             genericObjectPool.returnObject(b);
         } catch (IllegalStateException ex) {
@@ -79,7 +79,7 @@
 
         @Override
         public Broadcaster create() {
-            logger.info("Creating Object {}", count.getAndIncrement());
+            logger.trace("Creating Object {}", count.getAndIncrement());
             return PoolableBroadcasterFactory.class.cast(config.getBroadcasterFactory()).createBroadcaster();
         }
 
