diff --git a/solr/core/src/test/org/apache/solr/core/TestNRTOpen.java b/solr/core/src/test/org/apache/solr/core/TestNRTOpen.java
index cf5e80b..9ceca36 100644
--- a/solr/core/src/test/org/apache/solr/core/TestNRTOpen.java
+++ b/solr/core/src/test/org/apache/solr/core/TestNRTOpen.java
@@ -129,7 +129,7 @@
   static void assertNRT(int maxDoc) {
     RefCounted<SolrIndexSearcher> searcher = h.getCore().getSearcher();
     try {
-      DirectoryReader ir = searcher.get().getIndexReader();
+      DirectoryReader ir = searcher.get().getRawReader();
       assertEquals(maxDoc, ir.maxDoc());
       assertTrue("expected NRT reader, got: " + ir, ir.toString().contains(":nrt"));
     } finally {
@@ -141,7 +141,7 @@
     RefCounted<SolrIndexSearcher> searcher = h.getCore().getSearcher();
     Set<Object> set = Collections.newSetFromMap(new IdentityHashMap<Object,Boolean>());
     try {
-      DirectoryReader ir = searcher.get().getIndexReader();
+      DirectoryReader ir = searcher.get().getRawReader();
       for (AtomicReaderContext context : ir.leaves()) {
         set.add(context.reader().getCoreCacheKey());
       }
