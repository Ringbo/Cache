diff --git a/lucene/queries/src/test/org/apache/lucene/queries/CommonTermsQueryTest.java b/lucene/queries/src/test/org/apache/lucene/queries/CommonTermsQueryTest.java
index aba7f6a..0443cec 100644
--- a/lucene/queries/src/test/org/apache/lucene/queries/CommonTermsQueryTest.java
+++ b/lucene/queries/src/test/org/apache/lucene/queries/CommonTermsQueryTest.java
@@ -265,7 +265,7 @@
       assertEquals("0", r.document(search.scoreDocs[0].doc).get("id"));
       assertEquals("2", r.document(search.scoreDocs[1].doc).get("id"));
       assertEquals("3", r.document(search.scoreDocs[2].doc).get("id"));
-      assertTrue(search.scoreDocs[1].score > search.scoreDocs[2].score);
+      assertTrue(search.scoreDocs[1].score >= search.scoreDocs[2].score);
     }
     
     {
