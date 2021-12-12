diff --git a/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/HybridClusterIntegrationTest.java b/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/HybridClusterIntegrationTest.java
index 2b91955..efcc4f1 100644
--- a/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/HybridClusterIntegrationTest.java
+++ b/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/HybridClusterIntegrationTest.java
@@ -309,7 +309,7 @@
 
     // Start the Pinot cluster
     ControllerConf config = ControllerTestUtils.getDefaultControllerConfiguration();
-    config.setTenantIsolationEnabled(true);
+    config.setTenantIsolationEnabled(false);
     startController(config);
     startBroker();
     startServers(2);
