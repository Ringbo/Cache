diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
index cbb19fb..b984afa 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
@@ -3233,7 +3233,7 @@
 
         boolean wait = waitForCondition(new GridAbsPredicate() {
             @Override public boolean apply() {
-                return cache.localPeek(key, ONHEAP) == null;
+                return cache.localPeek(key) == null;
             }
         }, ttl + 1000);
 
@@ -3814,12 +3814,12 @@
 
         waitForCondition(new GridAbsPredicate() {
             @Override public boolean apply() {
-                return cache.localPeek(key, ONHEAP) == null;
+                return cache.localPeek(key) == null;
             }
         }, ttl + 1000);
 
         // Peek will actually remove entry from cache.
-        assertNull(cache.localPeek(key, ONHEAP));
+        assertNull(cache.localPeek(key));
 
         assert cache.localSize() == 0;
 
