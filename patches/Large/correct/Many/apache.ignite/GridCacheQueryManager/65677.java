diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/query/GridCacheQueryManager.java b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/query/GridCacheQueryManager.java
index f65600d..08bbf5c 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/query/GridCacheQueryManager.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/processors/cache/query/GridCacheQueryManager.java
@@ -846,7 +846,7 @@
                             cctx.localNode(),
                             "SQL fields query result set row read.",
                             EVT_CACHE_QUERY_OBJECT_READ,
-                            org.gridgain.grid.cache.query.GridCacheQueryType.SQL,
+                            org.gridgain.grid.cache.query.GridCacheQueryType.SQL_FIELDS,
                             cctx.namex(),
                             null,
                             qry.clause(),
@@ -1042,11 +1042,11 @@
 
                     switch (type) {
                         case SQL:
-                            if (cctx.gridEvents().isRecordable(EVT_CACHE_OBJECT_READ)) {
+                            if (cctx.gridEvents().isRecordable(EVT_CACHE_QUERY_OBJECT_READ)) {
                                 cctx.gridEvents().record(new GridCacheQueryReadEvent<>(
                                     cctx.localNode(),
                                     "SQL query entry read.",
-                                    EVT_CACHE_OBJECT_READ,
+                                    EVT_CACHE_QUERY_OBJECT_READ,
                                     org.gridgain.grid.cache.query.GridCacheQueryType.SQL,
                                     cctx.namex(),
                                     qry.queryClassName(),
@@ -1088,11 +1088,11 @@
                             break;
 
                         case SCAN:
-                            if (cctx.gridEvents().isRecordable(EVT_CACHE_OBJECT_READ)) {
+                            if (cctx.gridEvents().isRecordable(EVT_CACHE_QUERY_OBJECT_READ)) {
                                 cctx.gridEvents().record(new GridCacheQueryReadEvent<>(
                                     cctx.localNode(),
                                     "Scan query entry read.",
-                                    EVT_CACHE_OBJECT_READ,
+                                    EVT_CACHE_QUERY_OBJECT_READ,
                                     org.gridgain.grid.cache.query.GridCacheQueryType.SCAN,
                                     cctx.namex(),
                                     null,
