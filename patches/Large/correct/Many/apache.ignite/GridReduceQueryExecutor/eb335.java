diff --git a/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/twostep/GridReduceQueryExecutor.java b/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/twostep/GridReduceQueryExecutor.java
index 9195153..fa58c76 100644
--- a/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/twostep/GridReduceQueryExecutor.java
+++ b/modules/indexing/src/main/java/org/apache/ignite/internal/processors/query/h2/twostep/GridReduceQueryExecutor.java
@@ -310,7 +310,7 @@
 //                dropTable(r.conn, tbl.getName()); TODO
             }
 
-            return new QueryCursorImpl<>(new GridQueryPortableFieldsIterator(new Iter(res), cctx, cctx.keepPortable()));
+            return new QueryCursorImpl<>(new GridQueryCacheObjectsIterator(new Iter(res), cctx, cctx.keepPortable()));
         }
         catch (IgniteCheckedException | InterruptedException | RuntimeException e) {
             U.closeQuiet(r.conn);
