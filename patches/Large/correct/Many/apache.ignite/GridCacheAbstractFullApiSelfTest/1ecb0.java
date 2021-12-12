diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
index ce45967..0b93da9 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFullApiSelfTest.java
@@ -2681,7 +2681,7 @@
         cache().put("key2", 2);
         cache().put("key3", 3);
 
-        cache().removeAll();
+        cache(1).removeAll();
 
         assert cache().isEmpty();
         long entryCount = hugeRemoveAllEntryCount();
