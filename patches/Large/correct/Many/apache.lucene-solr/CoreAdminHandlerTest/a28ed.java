diff --git a/solr/core/src/test/org/apache/solr/handler/admin/CoreAdminHandlerTest.java b/solr/core/src/test/org/apache/solr/handler/admin/CoreAdminHandlerTest.java
index 58d7b76..41b02a1 100644
--- a/solr/core/src/test/org/apache/solr/handler/admin/CoreAdminHandlerTest.java
+++ b/solr/core/src/test/org/apache/solr/handler/admin/CoreAdminHandlerTest.java
@@ -200,10 +200,10 @@
     copySolrHomeToTemp(solrHomeDirectory, "corex", true);
     File corex = new File(solrHomeDirectory, "corex");
     FileUtils.write(new File(corex, "core.properties"), "", Charsets.UTF_8.toString());
-    JettySolrRunner runner = new JettySolrRunner(solrHomeDirectory.getAbsolutePath(), "/solr", 0);
+    JettySolrRunner runner = new JettySolrRunner(solrHomeDirectory.getAbsolutePath(), "/solr", 0, null, null, true, null, sslConfig);
     runner.start();
 
-    try (HttpSolrClient client = new HttpSolrClient("http://localhost:" + runner.getLocalPort() + "/solr/corex")) {
+    try (HttpSolrClient client = new HttpSolrClient(runner.getBaseUrl() + "/corex")) {
       client.setConnectionTimeout(SolrTestCaseJ4.DEFAULT_CONNECTION_TIMEOUT);
       client.setSoTimeout(SolrTestCaseJ4.DEFAULT_CONNECTION_TIMEOUT);
       SolrInputDocument doc = new SolrInputDocument();
@@ -212,7 +212,7 @@
       client.commit();
     }
 
-    try (HttpSolrClient client = new HttpSolrClient("http://localhost:" + runner.getLocalPort() + "/solr")) {
+    try (HttpSolrClient client = new HttpSolrClient(runner.getBaseUrl().toString())) {
       client.setConnectionTimeout(SolrTestCaseJ4.DEFAULT_CONNECTION_TIMEOUT);
       client.setSoTimeout(SolrTestCaseJ4.DEFAULT_CONNECTION_TIMEOUT);
       CoreAdminRequest.Unload req = new CoreAdminRequest.Unload(false);
