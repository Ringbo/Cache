diff --git a/solr/solrj/src/test/org/apache/solr/client/solrj/impl/CloudSolrServerTest.java b/solr/solrj/src/test/org/apache/solr/client/solrj/impl/CloudSolrServerTest.java
index 3d469b0..3e45fa0 100644
--- a/solr/solrj/src/test/org/apache/solr/client/solrj/impl/CloudSolrServerTest.java
+++ b/solr/solrj/src/test/org/apache/solr/client/solrj/impl/CloudSolrServerTest.java
@@ -238,9 +238,9 @@
     // Calculate a number of shard keys that route to the same shard.
     int n;
     if (TEST_NIGHTLY) {
-      n = random().nextInt(999) + 1;
+      n = random().nextInt(999) + 2;
     } else {
-      n = random().nextInt(9) + 1;
+      n = random().nextInt(9) + 2;
     }
     
     List<String> sameShardRoutes = Lists.newArrayList();
