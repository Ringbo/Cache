diff --git a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridCacheNearOneNodeSelfTest.java b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridCacheNearOneNodeSelfTest.java
index 25adeea..0e583e5 100644
--- a/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridCacheNearOneNodeSelfTest.java
+++ b/modules/core/src/test/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridCacheNearOneNodeSelfTest.java
@@ -213,7 +213,7 @@
             assertEquals("1", dht().peek(1));
 
             assertEquals("1", near.get(1));
-            assertEquals("1", near.remove(1));
+            assertEquals("1", near.getAndRemove(1));
 
             assertNull(near.localPeek(1));
             assertNull(dht().peek(1));
@@ -248,7 +248,7 @@
 
             try {
                 assertEquals("1", near.get(1));
-                assertEquals("1", near.remove(1));
+                assertEquals("1", near.getAndRemove(1));
 
                 assertNull(near.localPeek(1));
                 assertNull(dht().peek(1));
