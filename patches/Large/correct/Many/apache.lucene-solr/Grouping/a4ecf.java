diff --git a/solr/src/java/org/apache/solr/search/Grouping.java b/solr/src/java/org/apache/solr/search/Grouping.java
index a4d1197..f76616a 100755
--- a/solr/src/java/org/apache/solr/search/Grouping.java
+++ b/solr/src/java/org/apache/solr/search/Grouping.java
@@ -256,7 +256,7 @@
 
         if (numDocs >= docsToGather) break;
       }
-      assert numDocs <= docCount; // make sure we didn't gather too many
+      assert numDocs <= docsToGather; // make sure we didn't gather too many
       
       int[] ids = new int[numDocs];
       float[] scores = needScores ? new float[numDocs] : null;
