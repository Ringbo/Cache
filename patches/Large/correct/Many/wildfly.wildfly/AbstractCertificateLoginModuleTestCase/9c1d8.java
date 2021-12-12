diff --git a/testsuite/integration/manualmode/src/test/java/org/jboss/as/test/manualmode/web/ssl/AbstractCertificateLoginModuleTestCase.java b/testsuite/integration/manualmode/src/test/java/org/jboss/as/test/manualmode/web/ssl/AbstractCertificateLoginModuleTestCase.java
index d918349..db54206 100644
--- a/testsuite/integration/manualmode/src/test/java/org/jboss/as/test/manualmode/web/ssl/AbstractCertificateLoginModuleTestCase.java
+++ b/testsuite/integration/manualmode/src/test/java/org/jboss/as/test/manualmode/web/ssl/AbstractCertificateLoginModuleTestCase.java
@@ -219,7 +219,7 @@
 
             ModelNode operation = createOpNode("subsystem=undertow/server=default-server/https-listener=https2",
                     ModelDescriptionConstants.REMOVE);
-            operation.get(OPERATION_HEADERS, ALLOW_RESOURCE_SERVICE_RESTART).set(true);
+            operation.get(OPERATION_HEADERS, ALLOW_RESOURCE_SERVICE_RESTART).set(false);
             Utils.applyUpdate(operation, managementClient.getControllerClient());
 
             operation = createOpNode("socket-binding-group=standard-sockets/socket-binding=https2",
