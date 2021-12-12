diff --git a/solr/contrib/uima/src/java/org/apache/solr/uima/processor/UIMAToSolrMapper.java b/solr/contrib/uima/src/java/org/apache/solr/uima/processor/UIMAToSolrMapper.java
index 59bf196..4a4cd38 100644
--- a/solr/contrib/uima/src/java/org/apache/solr/uima/processor/UIMAToSolrMapper.java
+++ b/solr/contrib/uima/src/java/org/apache/solr/uima/processor/UIMAToSolrMapper.java
@@ -54,7 +54,7 @@
    * @param typeName             name of UIMA type to map
    * @param featureFieldsmapping
    */
-  public void map(String typeName, Map<String, MapField> featureFieldsmapping) throws FieldMappingException {
+  void map(String typeName, Map<String, MapField> featureFieldsmapping) throws FieldMappingException {
     try {
       Type type = cas.getTypeSystem().getType(typeName);
       for (FSIterator<FeatureStructure> iterator = cas.getFSIndexRepository().getAllIndexedFS(type); iterator
