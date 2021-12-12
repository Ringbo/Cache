diff --git a/solr/core/src/java/org/apache/solr/util/SolrCLI.java b/solr/core/src/java/org/apache/solr/util/SolrCLI.java
index da7e63e..3572ea4 100644
--- a/solr/core/src/java/org/apache/solr/util/SolrCLI.java
+++ b/solr/core/src/java/org/apache/solr/util/SolrCLI.java
@@ -2934,7 +2934,7 @@
 
         // wait for execution.
         try {
-          handler.waitFor();
+          handler.waitFor(3000);
         } catch (InterruptedException ie) {
           // safe to ignore ...
           Thread.interrupted();
