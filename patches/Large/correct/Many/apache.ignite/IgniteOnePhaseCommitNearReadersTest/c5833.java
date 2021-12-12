diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/IgniteOnePhaseCommitNearReadersTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/IgniteOnePhaseCommitNearReadersTest.java
index ed347c1..f796cea 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/IgniteOnePhaseCommitNearReadersTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/IgniteOnePhaseCommitNearReadersTest.java
@@ -208,7 +208,7 @@
             for (TransactionIsolation isolation : TransactionIsolation.values()) {
                 srv = startGrid(0);
 
-                awaitPartitionMapExchange();
+                awaitPartitionMapExchange(true, true, null);
 
                 key = primaryKey(srv.cache(DEFAULT_CACHE_NAME));
 
