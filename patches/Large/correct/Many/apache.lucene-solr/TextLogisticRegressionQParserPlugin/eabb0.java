diff --git a/solr/core/src/java/org/apache/solr/search/TextLogisticRegressionQParserPlugin.java b/solr/core/src/java/org/apache/solr/search/TextLogisticRegressionQParserPlugin.java
index 96f869f..e1d3b7b 100644
--- a/solr/core/src/java/org/apache/solr/search/TextLogisticRegressionQParserPlugin.java
+++ b/solr/core/src/java/org/apache/solr/search/TextLogisticRegressionQParserPlugin.java
@@ -153,7 +153,7 @@
     public void collect(int doc) throws IOException{
       int valuesDocID = leafOutcomeValue.docID();
       if (valuesDocID < doc) {
-        valuesDocID = leafOutcomeValue.advance(valuesDocID);
+        valuesDocID = leafOutcomeValue.advance(doc);
       }
       int outcome;
       if (valuesDocID == doc) {
