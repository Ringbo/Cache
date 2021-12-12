diff --git a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractFullApiSelfTest.java b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractFullApiSelfTest.java
index a9e8395..966b6aa 100644
--- a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractFullApiSelfTest.java
+++ b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/GridCacheAbstractFullApiSelfTest.java
@@ -3480,12 +3480,12 @@
 
             comp.call(new Callable<Boolean>() {
                 @Override public Boolean call() throws Exception {
-                    assert !lock.tryLock(1000, MILLISECONDS);
+                    assert !lock.tryLock();
 
                     latch.countDown();
 
                     try {
-                        assert lock.tryLock();
+                        assert lock.tryLock(2000, MILLISECONDS);
                     }
                     finally {
                         lock.unlock();
