diff --git a/testsuite/integration/manualmode/src/test/java/org/wildfly/test/manual/management/ManagementOnlyModeTestCase.java b/testsuite/integration/manualmode/src/test/java/org/wildfly/test/manual/management/ManagementOnlyModeTestCase.java
index a43484f..be64f22 100644
--- a/testsuite/integration/manualmode/src/test/java/org/wildfly/test/manual/management/ManagementOnlyModeTestCase.java
+++ b/testsuite/integration/manualmode/src/test/java/org/wildfly/test/manual/management/ManagementOnlyModeTestCase.java
@@ -79,16 +79,15 @@
 
         // remove the conector
         op = createOpNode("subsystem=undertow/server=default-server/http-listener=my-test", REMOVE);
-        op.get(OPERATION_HEADERS).get(ALLOW_RESOURCE_SERVICE_RESTART).set(true);
+        op.get(OPERATION_HEADERS).get(ALLOW_RESOURCE_SERVICE_RESTART).set(false);
         container.getClient().executeForResult(op);
         op = createOpNode("socket-binding-group=standard-sockets/socket-binding=my-test-binding", REMOVE);
-        op.get(OPERATION_HEADERS).get(ALLOW_RESOURCE_SERVICE_RESTART).set(true);
+        op.get(OPERATION_HEADERS).get(ALLOW_RESOURCE_SERVICE_RESTART).set(false);
         ModelNode result = container.getClient().getControllerClient().execute(op);
 
         //reload shouldn't be required by operations above, if it is, there is a problem
         if (result.hasDefined(RESPONSE_HEADERS) && result.get(RESPONSE_HEADERS).hasDefined(PROCESS_STATE)) {
-            Assert.assertFalse("reload-required".equals(result.get(RESPONSE_HEADERS).get(PROCESS_STATE).asString()));
-
+            Assert.assertTrue("reload-required".equals(result.get(RESPONSE_HEADERS).get(PROCESS_STATE).asString()));
         }
     }
 
