diff --git a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/GridCacheLockAbstractTest.java b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/GridCacheLockAbstractTest.java
index 639534b..44c86e5 100644
--- a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/GridCacheLockAbstractTest.java
+++ b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/GridCacheLockAbstractTest.java
@@ -352,7 +352,7 @@
 
                 info("Put key-value pair into cache: 1='2'");
 
-                assertEquals("2", cache1.remove(1));
+                assertEquals("2", cache1.getAndRemove(1));
 
                 l2.countDown();
 
