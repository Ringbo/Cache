diff --git a/lucene/facet/src/java/org/apache/lucene/facet/RandomSamplingFacetsCollector.java b/lucene/facet/src/java/org/apache/lucene/facet/RandomSamplingFacetsCollector.java
index a7e3519..dcc366a 100644
--- a/lucene/facet/src/java/org/apache/lucene/facet/RandomSamplingFacetsCollector.java
+++ b/lucene/facet/src/java/org/apache/lucene/facet/RandomSamplingFacetsCollector.java
@@ -215,7 +215,7 @@
       
       return new MatchingDocs(docs.context, new BitDocIdSet(sampleDocs), docs.totalHits, null);
     } catch (IOException e) {
-      throw new RuntimeException();
+      throw new RuntimeException(e);
     }
   }
   
