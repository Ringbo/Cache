diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
index bc1b5ef..c246661 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheAdapter.java
@@ -1891,7 +1891,7 @@
         else {
             return asyncOp(tx, new AsyncOp<Map<K1, V1>>(keys) {
                 @Override public IgniteInternalFuture<Map<K1, V1>> op(IgniteTxLocalAdapter tx) {
-                    return tx.getAllAsync(ctx, keys, null, deserializePortable, skipVals, false, readThrough);
+                    return tx.getAllAsync(ctx, keys, null, deserializePortable, skipVals, false, !readThrough);
                 }
             });
         }
