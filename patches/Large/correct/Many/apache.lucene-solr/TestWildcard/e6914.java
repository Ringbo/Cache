diff --git a/src/test/org/apache/lucene/search/TestWildcard.java b/src/test/org/apache/lucene/search/TestWildcard.java
index 810bedc..19ea2a5 100644
--- a/src/test/org/apache/lucene/search/TestWildcard.java
+++ b/src/test/org/apache/lucene/search/TestWildcard.java
@@ -104,7 +104,7 @@
     MultiTermQuery wq = new WildcardQuery(new Term("field", ""));
     wq.setRewriteMethod(MultiTermQuery.SCORING_BOOLEAN_QUERY_REWRITE);
     assertMatches(searcher, wq, 0);
-    BooleanQuery expected = new BooleanQuery();
+    BooleanQuery expected = new BooleanQuery(true);
     assertEquals(searcher.rewrite(expected), searcher.rewrite(wq));
   }
   
