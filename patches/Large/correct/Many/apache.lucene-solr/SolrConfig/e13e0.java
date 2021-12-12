diff --git a/solr/core/src/java/org/apache/solr/core/SolrConfig.java b/solr/core/src/java/org/apache/solr/core/SolrConfig.java
index 078682c..606554d 100644
--- a/solr/core/src/java/org/apache/solr/core/SolrConfig.java
+++ b/solr/core/src/java/org/apache/solr/core/SolrConfig.java
@@ -194,7 +194,7 @@
       indexConfigPrefix = "indexConfig";
     }
     assertWarnOrFail("The <nrtMode> config has been discontinued and NRT mode is always used by Solr." +
-            " This config will be removed in future versions.", getNode(indexConfigPrefix + "/nrtMode", false) != null,
+            " This config will be removed in future versions.", getNode(indexConfigPrefix + "/nrtMode", false) == null,
         false
     );
 
