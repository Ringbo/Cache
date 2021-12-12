diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrConfiguration.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrConfiguration.java
index edf806e..3e65b3d 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrConfiguration.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/search/service/solr/SolrConfiguration.java
@@ -177,7 +177,7 @@
                 }
             }
             
-            if (BroadleafCloudSolrClient.class.isAssignableFrom(primaryServer.getClass())) {
+            if (BroadleafCloudSolrClient.class.isAssignableFrom(server.getClass())) {
                 ((BroadleafCloudSolrClient) server).setReindexClient(false);
                 ((BroadleafCloudSolrClient) server).setSolrConfig(this);
             }
@@ -220,7 +220,7 @@
                     }
                 }
             }
-            if (BroadleafCloudSolrClient.class.isAssignableFrom(primaryServer.getClass())) {
+            if (BroadleafCloudSolrClient.class.isAssignableFrom(server.getClass())) {
                 ((BroadleafCloudSolrClient) server).setReindexClient(true);
                 ((BroadleafCloudSolrClient) server).setSolrConfig(this);
             }
