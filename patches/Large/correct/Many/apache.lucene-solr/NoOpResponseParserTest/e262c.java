diff --git a/solr/solrj/src/test/org/apache/solr/client/solrj/response/NoOpResponseParserTest.java b/solr/solrj/src/test/org/apache/solr/client/solrj/response/NoOpResponseParserTest.java
index 5d28d6f..6c39082 100644
--- a/solr/solrj/src/test/org/apache/solr/client/solrj/response/NoOpResponseParserTest.java
+++ b/solr/solrj/src/test/org/apache/solr/client/solrj/response/NoOpResponseParserTest.java
@@ -85,9 +85,9 @@
     assertResponse(responseString);
   }
 
-  private void assertResponse(String responseString) {
+  private void assertResponse(String responseString) throws IOException {
     ResponseParser xmlResponseParser = new XMLResponseParser();
-    NamedList expectedResponse = xmlResponseParser.processResponse(IOUtils.toInputStream(responseString), "UTF-8");
+    NamedList expectedResponse = xmlResponseParser.processResponse(IOUtils.toInputStream(responseString, "UTF-8"), "UTF-8");
     List<SolrDocument> documentList = (List<SolrDocument>) expectedResponse.getAll("response").get(0);
     assertEquals(1, documentList.size());
     SolrDocument solrDocument = documentList.get(0);
