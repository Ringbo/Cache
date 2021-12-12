diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/transactions/IgniteTxLocalAdapter.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/transactions/IgniteTxLocalAdapter.java
index 9c00afe..507c0c2 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/transactions/IgniteTxLocalAdapter.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/transactions/IgniteTxLocalAdapter.java
@@ -659,7 +659,7 @@
             cctx.database().checkpointReadLock();
 
             try {
-                if (cctx.wal() != null)
+                if (cctx.wal() != null && !writeEntries().isEmpty())
                     ptr = cctx.wal().log(DataRecord.fromTransaction(this));
 
                 cctx.tm().txContext(this);
