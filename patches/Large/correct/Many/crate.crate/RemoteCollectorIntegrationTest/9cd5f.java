diff --git a/sql/src/test/java/io/crate/integrationtests/RemoteCollectorIntegrationTest.java b/sql/src/test/java/io/crate/integrationtests/RemoteCollectorIntegrationTest.java
index b3e9ff7..628b3cc 100644
--- a/sql/src/test/java/io/crate/integrationtests/RemoteCollectorIntegrationTest.java
+++ b/sql/src/test/java/io/crate/integrationtests/RemoteCollectorIntegrationTest.java
@@ -72,7 +72,7 @@
 
         client().admin().cluster().prepareHealth("t")
             .setWaitForEvents(Priority.LANGUID)
-            .setWaitForNoRelocatingShards(false)
+            .setWaitForNoRelocatingShards(true)
             .setTimeout(TimeValue.timeValueSeconds(5)).execute().actionGet();
 
         execute(plan).getResult();
