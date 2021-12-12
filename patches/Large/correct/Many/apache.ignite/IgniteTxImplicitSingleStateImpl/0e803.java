diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/transactions/IgniteTxImplicitSingleStateImpl.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/transactions/IgniteTxImplicitSingleStateImpl.java
index 886d0d6..10b06d8 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/transactions/IgniteTxImplicitSingleStateImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/transactions/IgniteTxImplicitSingleStateImpl.java
@@ -115,8 +115,9 @@
         Throwable err = topFut.validateCache(cacheCtx, recovery, read, null, entry);
 
         if (err != null) {
-            return new IgniteCheckedException("Failed to perform cache operation (cache topology is not valid): " +
-                U.maskName(cacheCtx.name()));
+            return new IgniteCheckedException(
+                "Failed to perform cache operation (cache topology is not valid): "
+                    + U.maskName(cacheCtx.name()), err);
         }
 
         if (CU.affinityNodes(cacheCtx, topFut.topologyVersion()).isEmpty()) {
