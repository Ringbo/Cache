diff --git a/solr/test-framework/src/java/org/apache/solr/util/TestHarness.java b/solr/test-framework/src/java/org/apache/solr/util/TestHarness.java
index 946eac7..1094cb3 100644
--- a/solr/test-framework/src/java/org/apache/solr/util/TestHarness.java
+++ b/solr/test-framework/src/java/org/apache/solr/util/TestHarness.java
@@ -399,7 +399,7 @@
     if (container != null) {
       for (SolrCore c : container.getCores()) {
         if (c.getOpenCount() > 1)
-          throw new RuntimeException("SolrCore.getOpenCount()=="+core.getOpenCount());
+          throw new RuntimeException("SolrCore.getOpenCount()=="+c.getOpenCount());
       }      
     }
 
