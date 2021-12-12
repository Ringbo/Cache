diff --git a/solr/core/src/test/org/apache/solr/search/TestSearcherReuse.java b/solr/core/src/test/org/apache/solr/search/TestSearcherReuse.java
index af64613..c11153b 100644
--- a/solr/core/src/test/org/apache/solr/search/TestSearcherReuse.java
+++ b/solr/core/src/test/org/apache/solr/search/TestSearcherReuse.java
@@ -89,7 +89,10 @@
         assertU(commit());
       }
     }
-    assertU(commit());
+
+    // with random merge policies, a regular commit can cause a segment to be flushed that can kick off a background merge
+    // that can cause a later commit to actually see changes and open a new searcher.  This should not be possible with optimize
+    assertU(optimize());
 
     // seed a single query into the cache
     assertQ(req("*:*"), "//*[@numFound='"+numDocs+"']");
