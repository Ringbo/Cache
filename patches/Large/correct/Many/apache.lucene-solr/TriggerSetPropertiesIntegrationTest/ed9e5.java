diff --git a/solr/core/src/test/org/apache/solr/cloud/autoscaling/TriggerSetPropertiesIntegrationTest.java b/solr/core/src/test/org/apache/solr/cloud/autoscaling/TriggerSetPropertiesIntegrationTest.java
index 47ac227..5f4243f 100644
--- a/solr/core/src/test/org/apache/solr/cloud/autoscaling/TriggerSetPropertiesIntegrationTest.java
+++ b/solr/core/src/test/org/apache/solr/cloud/autoscaling/TriggerSetPropertiesIntegrationTest.java
@@ -54,7 +54,7 @@
 
   @BeforeClass
   public static void setupCluster() throws Exception {
-    configureCluster(5)
+    configureCluster(2)
         .addConfig("conf", configset("cloud-minimal"))
         .configure();
     // disable .scheduled_maintenance
