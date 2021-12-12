diff --git a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridCacheNearMultiNodeSelfTest.java b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridCacheNearMultiNodeSelfTest.java
index f63d2d7..56549e9 100644
--- a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridCacheNearMultiNodeSelfTest.java
+++ b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridCacheNearMultiNodeSelfTest.java
@@ -761,7 +761,7 @@
 
             try {
                 assertEquals(val, near.get(key));
-                assertEquals(val, near.remove(key));
+                assertEquals(val, near.getAndRemove(key));
 
                 assertNull(near.localPeek(key));
                 assertNull(dht(primaryGrid(key)).peek(key));
