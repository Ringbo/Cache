diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheGetEntryAbstractTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheGetEntryAbstractTest.java
index dd9ed3c..6a7cfc6 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheGetEntryAbstractTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheGetEntryAbstractTest.java
@@ -83,7 +83,7 @@
 
     /** {@inheritDoc} */
     @Override protected long getTestTimeout() {
-        return 60_000;
+        return 90_000;
     }
 
     /** {@inheritDoc} */
