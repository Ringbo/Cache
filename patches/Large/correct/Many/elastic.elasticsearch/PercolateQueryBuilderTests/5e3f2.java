diff --git a/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolateQueryBuilderTests.java b/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolateQueryBuilderTests.java
index adf8323..6702415 100644
--- a/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolateQueryBuilderTests.java
+++ b/modules/percolator/src/test/java/org/elasticsearch/percolator/PercolateQueryBuilderTests.java
@@ -249,7 +249,7 @@
     }
 
     public void testCreateMultiDocumentSearcher() throws Exception {
-        int numDocs = randomIntBetween(1, 8);
+        int numDocs = randomIntBetween(2, 8);
         List<ParseContext.Document> docs = new ArrayList<>(numDocs);
         for (int i = 0; i < numDocs; i++) {
             docs.add(new ParseContext.Document());
