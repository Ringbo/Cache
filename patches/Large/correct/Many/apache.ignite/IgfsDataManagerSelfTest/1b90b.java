diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsDataManagerSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsDataManagerSelfTest.java
index d95c876..0ef40d8 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsDataManagerSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/igfs/IgfsDataManagerSelfTest.java
@@ -189,7 +189,7 @@
 
             for (int j = 0; j < NODES_CNT; j++) {
                 GridCacheContext<Object, Object> ctx = GridTestUtils.getFieldValue(grid(j).cachex(DATA_CACHE_NAME),
-                    GridCacheAdapter.class, "ctx");
+                    "ctx");
                 Collection<IgniteInternalTx> txs = ctx.tm().txs();
 
                 assert txs.isEmpty() : "Incomplete transactions: " + txs;
@@ -277,7 +277,7 @@
 
             for (int j = 0; j < NODES_CNT; j++) {
                 GridCacheContext<Object, Object> ctx = GridTestUtils.getFieldValue(grid(j).cachex(DATA_CACHE_NAME),
-                    GridCacheAdapter.class, "ctx");
+                    "ctx");
                 Collection<IgniteInternalTx> txs = ctx.tm().txs();
 
                 assert txs.isEmpty() : "Incomplete transactions: " + txs;
@@ -357,7 +357,7 @@
 
             for (int j = 0; j < NODES_CNT; j++) {
                 GridCacheContext<Object, Object> ctx = GridTestUtils.getFieldValue(grid(j).cachex(DATA_CACHE_NAME),
-                    GridCacheAdapter.class, "ctx");
+                    "ctx");
                 Collection<IgniteInternalTx> txs = ctx.tm().txs();
 
                 assert txs.isEmpty() : "Incomplete transactions: " + txs;
