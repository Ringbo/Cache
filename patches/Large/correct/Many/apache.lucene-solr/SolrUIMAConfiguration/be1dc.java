diff --git a/solr/contrib/uima/src/java/org/apache/solr/uima/processor/SolrUIMAConfiguration.java b/solr/contrib/uima/src/java/org/apache/solr/uima/processor/SolrUIMAConfiguration.java
index 96f3c46..1f00498 100644
--- a/solr/contrib/uima/src/java/org/apache/solr/uima/processor/SolrUIMAConfiguration.java
+++ b/solr/contrib/uima/src/java/org/apache/solr/uima/processor/SolrUIMAConfiguration.java
@@ -40,7 +40,7 @@
   
   private String logField;
 
-  public SolrUIMAConfiguration(String aePath, String[] fieldsToAnalyze, boolean fieldsMerging,
+  SolrUIMAConfiguration(String aePath, String[] fieldsToAnalyze, boolean fieldsMerging,
           Map<String, Map<String, MapField>> typesFeaturesFieldsMapping,
           Map<String, Object> runtimeParameters, boolean ignoreErrors, String logField) {
     this.aePath = aePath;
@@ -60,7 +60,7 @@
     return fieldsMerging;
   }
 
-  public Map<String, Map<String, MapField>> getTypesFeaturesFieldsMapping() {
+  Map<String, Map<String, MapField>> getTypesFeaturesFieldsMapping() {
     return typesFeaturesFieldsMapping;
   }
 
