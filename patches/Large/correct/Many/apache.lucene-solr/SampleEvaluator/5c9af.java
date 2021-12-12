diff --git a/solr/solrj/src/java/org/apache/solr/client/solrj/io/eval/SampleEvaluator.java b/solr/solrj/src/java/org/apache/solr/client/solrj/io/eval/SampleEvaluator.java
index 1eccebb..ca35a7d 100644
--- a/solr/solrj/src/java/org/apache/solr/client/solrj/io/eval/SampleEvaluator.java
+++ b/solr/solrj/src/java/org/apache/solr/client/solrj/io/eval/SampleEvaluator.java
@@ -49,7 +49,7 @@
 
     Object second = null;
     if(objects.length > 1) {
-      second = objects[2];
+      second = objects[1];
     }
 
     if(first instanceof RealDistribution) {
