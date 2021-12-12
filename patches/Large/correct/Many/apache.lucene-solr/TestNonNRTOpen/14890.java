diff --git a/solr/core/src/test/org/apache/solr/core/TestNonNRTOpen.java b/solr/core/src/test/org/apache/solr/core/TestNonNRTOpen.java
index e828824..a3bfd7d 100644
--- a/solr/core/src/test/org/apache/solr/core/TestNonNRTOpen.java
+++ b/solr/core/src/test/org/apache/solr/core/TestNonNRTOpen.java
@@ -138,7 +138,7 @@
     RefCounted<SolrIndexSearcher> searcher = core.getSearcher();
     try {
       SolrIndexSearcher s = searcher.get();
-      DirectoryReader ir = s.getIndexReader();
+      DirectoryReader ir = s.getRawReader();
       assertEquals("SOLR-5815? : wrong maxDoc: core=" + core.toString() +" searcher=" + s.toString(),
                    maxDoc, ir.maxDoc());
       assertFalse("SOLR-5815? : expected non-NRT reader, got: " + ir, ir.toString().contains(":nrt"));
@@ -151,7 +151,7 @@
     RefCounted<SolrIndexSearcher> searcher = h.getCore().getSearcher();
     Set<Object> set = Collections.newSetFromMap(new IdentityHashMap<Object,Boolean>());
     try {
-      DirectoryReader ir = searcher.get().getIndexReader();
+      DirectoryReader ir = searcher.get().getRawReader();
       for (AtomicReaderContext context : ir.leaves()) {
         set.add(context.reader().getCoreCacheKey());
       }
