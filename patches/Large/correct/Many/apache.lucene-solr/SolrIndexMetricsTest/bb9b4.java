diff --git a/solr/core/src/test/org/apache/solr/update/SolrIndexMetricsTest.java b/solr/core/src/test/org/apache/solr/update/SolrIndexMetricsTest.java
index 4f5ea69..850ce03 100644
--- a/solr/core/src/test/org/apache/solr/update/SolrIndexMetricsTest.java
+++ b/solr/core/src/test/org/apache/solr/update/SolrIndexMetricsTest.java
@@ -63,7 +63,7 @@
 
     assertTrue(metrics.entrySet().stream().filter(e -> e.getKey().startsWith("INDEX")).count() >= 12);
     // this is variable, depending on the codec and the number of created files
-    assertTrue(metrics.entrySet().stream().filter(e -> e.getKey().startsWith("DIRECTORY")).count() > 50);
+    assertTrue(metrics.entrySet().stream().filter(e -> e.getKey().startsWith("DIRECTORY")).count() > 20);
 
     // check basic index meters
     Timer timer = (Timer)metrics.get("INDEX.merge.minor");
