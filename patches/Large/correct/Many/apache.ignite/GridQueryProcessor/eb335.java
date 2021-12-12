diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/query/GridQueryProcessor.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/query/GridQueryProcessor.java
index 547b707..63fe7ac 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/query/GridQueryProcessor.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/query/GridQueryProcessor.java
@@ -581,7 +581,7 @@
             }
 
             QueryCursorImpl<List<?>> cursor = new QueryCursorImpl<>(
-                new GridQueryPortableFieldsIterator(res.iterator(), cctx, cctx.keepPortable()));
+                new GridQueryCacheObjectsIterator(res.iterator(), cctx, cctx.keepPortable()));
 
             cursor.fieldsMeta(res.metaData());
 
