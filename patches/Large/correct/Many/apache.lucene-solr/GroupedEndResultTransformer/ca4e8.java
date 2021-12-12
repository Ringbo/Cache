diff --git a/solr/core/src/java/org/apache/solr/search/grouping/endresulttransformer/GroupedEndResultTransformer.java b/solr/core/src/java/org/apache/solr/search/grouping/endresulttransformer/GroupedEndResultTransformer.java
index 026cc4f..0414aff 100644
--- a/solr/core/src/java/org/apache/solr/search/grouping/endresulttransformer/GroupedEndResultTransformer.java
+++ b/solr/core/src/java/org/apache/solr/search/grouping/endresulttransformer/GroupedEndResultTransformer.java
@@ -50,7 +50,7 @@
    */
   @Override
   public void transform(Map<String, ?> result, ResponseBuilder rb, SolrDocumentSource solrDocumentSource) {
-    NamedList<Object> commands = new NamedList<Object>();
+    NamedList<Object> commands = new SimpleOrderedMap<Object>();
     for (Map.Entry<String, ?> entry : result.entrySet()) {
       Object value = entry.getValue();
       if (TopGroups.class.isInstance(value)) {
