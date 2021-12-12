diff --git a/src/main/java/org/elasticsearch/index/search/child/ChildCollector.java b/src/main/java/org/elasticsearch/index/search/child/ChildCollector.java
index 974cd1e..33e7366 100644
--- a/src/main/java/org/elasticsearch/index/search/child/ChildCollector.java
+++ b/src/main/java/org/elasticsearch/index/search/child/ChildCollector.java
@@ -80,13 +80,13 @@
             return;
         }
         for (Tuple<AtomicReader, IdReaderTypeCache> tuple : readers) {
-            IndexReader indexReader = tuple.v1();
+            AtomicReader indexReader = tuple.v1();
             IdReaderTypeCache idReaderTypeCache = tuple.v2();
             if (idReaderTypeCache == null) { // might be if we don't have that doc with that type in this reader
                 continue;
             }
             int parentDocId = idReaderTypeCache.docById(parentId);
-            if (parentDocId != -1) {
+            if (parentDocId != -1 && (indexReader.getLiveDocs() == null || indexReader.getLiveDocs().get(parentDocId))) {
                 FixedBitSet docIdSet = parentDocs().get(indexReader.getCoreCacheKey());
                 if (docIdSet == null) {
                     docIdSet = new FixedBitSet(indexReader.maxDoc());
