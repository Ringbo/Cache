diff --git a/solr/test-framework/src/java/org/apache/solr/cloud/AbstractFullDistribZkTestBase.java b/solr/test-framework/src/java/org/apache/solr/cloud/AbstractFullDistribZkTestBase.java
index 558b0f4..5d46ba1 100644
--- a/solr/test-framework/src/java/org/apache/solr/cloud/AbstractFullDistribZkTestBase.java
+++ b/solr/test-framework/src/java/org/apache/solr/cloud/AbstractFullDistribZkTestBase.java
@@ -757,7 +757,7 @@
         zkStateReader.getClusterState().getSlice(DEFAULT_COLLECTION, shard)
             .getShards().size(), solrJetties.size());
 
-    SolrServer lastClient = null;
+    CloudJettyRunner lastJetty = null;
     for (CloudJettyRunner cjetty : solrJetties) {
       ZkNodeProps props = cjetty.info;
       if (verbose) System.err.println("client" + cnt++);
@@ -790,7 +790,7 @@
           ZkStateReader.ACTIVE);
       if (active && live) {
         if (lastNum > -1 && lastNum != num && failMessage == null) {
-          failMessage = shard + " is not consistent.  Got " + lastNum + " from " + lastClient + "lastClient"
+          failMessage = shard + " is not consistent.  Got " + lastNum + " from " + lastJetty.url + "lastClient"
               + " and got " + num + " from " + cjetty.url;
 
           if (verbose || true) {
@@ -801,15 +801,15 @@
             query.set("rows","1000");
             query.set("sort","id asc");
 
-            SolrDocumentList lst1 = lastClient.query(query).getResults();
+            SolrDocumentList lst1 = lastJetty.client.solrClient.query(query).getResults();
             SolrDocumentList lst2 = cjetty.client.solrClient.query(query).getResults();
 
-            showDiff(lst1, lst2, lastClient.toString(), cjetty.client.solrClient.toString());
+            showDiff(lst1, lst2, lastJetty.toString(), cjetty.client.solrClient.toString());
           }
 
         }
         lastNum = num;
-        lastClient = cjetty.client.solrClient;
+        lastJetty = cjetty;
       }
     }
     return failMessage;
