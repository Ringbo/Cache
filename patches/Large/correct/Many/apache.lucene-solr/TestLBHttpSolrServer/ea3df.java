diff --git a/src/test/org/apache/solr/client/solrj/TestLBHttpSolrServer.java b/src/test/org/apache/solr/client/solrj/TestLBHttpSolrServer.java
index a573053..dd40267 100644
--- a/src/test/org/apache/solr/client/solrj/TestLBHttpSolrServer.java
+++ b/src/test/org/apache/solr/client/solrj/TestLBHttpSolrServer.java
@@ -83,7 +83,7 @@
       s[i] = solr[i].getUrl();
     }
     LBHttpSolrServer lbHttpSolrServer = new LBHttpSolrServer(httpClient, s);
-    lbHttpSolrServer.setAliveCheckInterval(1);
+    lbHttpSolrServer.setAliveCheckInterval(1000);
     SolrQuery solrQuery = new SolrQuery("*:*");
     Set<String> names = new HashSet<String>();
     QueryResponse resp = null;
@@ -121,7 +121,7 @@
 
   public void testTwoServers() throws Exception {
     LBHttpSolrServer lbHttpSolrServer = new LBHttpSolrServer(httpClient, solr[0].getUrl(), solr[1].getUrl());
-    lbHttpSolrServer.setAliveCheckInterval(1);
+    lbHttpSolrServer.setAliveCheckInterval(1000);
     SolrQuery solrQuery = new SolrQuery("*:*");
     Set<String> names = new HashSet<String>();
     QueryResponse resp = null;
