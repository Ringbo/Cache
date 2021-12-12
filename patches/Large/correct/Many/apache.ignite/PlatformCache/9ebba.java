diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/platform/cache/PlatformCache.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/platform/cache/PlatformCache.java
index 558a9b3..c552bae 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/platform/cache/PlatformCache.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/platform/cache/PlatformCache.java
@@ -873,9 +873,9 @@
                 long update = reader.readLong();
                 long access = reader.readLong();
 
-                IgniteCache cache0 = cache.withExpiryPolicy(new InteropExpiryPolicy(create, update, access));
+                IgniteCache cache0 = rawCache.withExpiryPolicy(new InteropExpiryPolicy(create, update, access));
 
-                return new PlatformCache(platformCtx, cache0, keepBinary);
+                return copy(cache0, keepBinary);
             }
 
             case OP_LOC_ITERATOR: {
@@ -1001,14 +1001,14 @@
                 if (cache.isAsync())
                     return this;
 
-                return new PlatformCache(platformCtx, (IgniteCache)cache.withAsync(), keepBinary);
+                return copy(rawCache.withAsync(), keepBinary);
             }
 
             case OP_WITH_KEEP_BINARY: {
                 if (keepBinary)
                     return this;
 
-                return new PlatformCache(platformCtx, cache.withKeepBinary(), true);
+                return copy(rawCache.withKeepBinary(), true);
             }
 
             case OP_WITH_NO_RETRIES: {
@@ -1017,14 +1017,14 @@
                 if (opCtx != null && opCtx.noRetries())
                     return this;
 
-                return new PlatformCache(platformCtx, cache.withNoRetries(), keepBinary);
+                return copy(rawCache.withNoRetries(), keepBinary);
             }
 
             case OP_WITH_SKIP_STORE: {
                 if (cache.delegate().skipStore())
                     return this;
 
-                return new PlatformCache(platformCtx, cache.withSkipStore(), keepBinary);
+                return copy(rawCache.withSkipStore(), keepBinary);
             }
 
             case OP_ITERATOR: {
