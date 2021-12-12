diff --git a/lucene/src/test/org/apache/lucene/index/TestStressAdvance.java b/lucene/src/test/org/apache/lucene/index/TestStressAdvance.java
index eb6e762..7b99023 100644
--- a/lucene/src/test/org/apache/lucene/index/TestStressAdvance.java
+++ b/lucene/src/test/org/apache/lucene/index/TestStressAdvance.java
@@ -57,7 +57,7 @@
       final List<Integer> aDocIDs = new ArrayList<Integer>();
       final List<Integer> bDocIDs = new ArrayList<Integer>();
 
-      final IndexReader r = w.getReader();
+      final DirectoryReader r = w.getReader();
       final int[] idToDocID = new int[r.maxDoc()];
       for(int docID=0;docID<idToDocID.length;docID++) {
         int id = Integer.parseInt(r.document(docID).get("id"));
@@ -67,7 +67,7 @@
           bDocIDs.add(docID);
         }
       }
-      final TermsEnum te = r.getSequentialSubReaders()[0].fields().terms("field").iterator(null);
+      final TermsEnum te = getOnlySegmentReader(r).fields().terms("field").iterator(null);
       
       DocsEnum de = null;
       for(int iter2=0;iter2<10;iter2++) {
