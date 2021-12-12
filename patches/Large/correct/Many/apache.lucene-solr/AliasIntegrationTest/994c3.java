diff --git a/solr/core/src/test/org/apache/solr/cloud/AliasIntegrationTest.java b/solr/core/src/test/org/apache/solr/cloud/AliasIntegrationTest.java
index a4aefd8..fa7138f 100644
--- a/solr/core/src/test/org/apache/solr/cloud/AliasIntegrationTest.java
+++ b/solr/core/src/test/org/apache/solr/cloud/AliasIntegrationTest.java
@@ -229,7 +229,7 @@
         "humpty dumpy4 sat on a walls");
     httpclient.add(doc8);
     httpclient.commit();
-    res = client.query(query);
+    res = httpclient.query(query);
     assertEquals(3, res.getResults().getNumFound());
     httpclient.shutdown();
     httpclient = null;
