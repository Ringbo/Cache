diff --git a/solr/test-framework/src/java/org/apache/solr/SolrTestCaseJ4.java b/solr/test-framework/src/java/org/apache/solr/SolrTestCaseJ4.java
index 19bf601..437679d 100644
--- a/solr/test-framework/src/java/org/apache/solr/SolrTestCaseJ4.java
+++ b/solr/test-framework/src/java/org/apache/solr/SolrTestCaseJ4.java
@@ -1948,7 +1948,7 @@
     SolrDocument solrDocument1 = (SolrDocument) expected;
     SolrDocument solrDocument2 = (SolrDocument) actual;
 
-    if(solrDocument1.getFieldNames().size() != solrDocument1.getFieldNames().size()) {
+    if(solrDocument1.getFieldNames().size() != solrDocument2.getFieldNames().size()) {
       return false;
     }
 
