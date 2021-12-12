diff --git a/testsuite/integration/manualmode/src/test/java/org/jboss/as/test/manualmode/jca/workmanager/distributed/AbstractDwmTestCase.java b/testsuite/integration/manualmode/src/test/java/org/jboss/as/test/manualmode/jca/workmanager/distributed/AbstractDwmTestCase.java
index cceeae5..7b2ef5d 100644
--- a/testsuite/integration/manualmode/src/test/java/org/jboss/as/test/manualmode/jca/workmanager/distributed/AbstractDwmTestCase.java
+++ b/testsuite/integration/manualmode/src/test/java/org/jboss/as/test/manualmode/jca/workmanager/distributed/AbstractDwmTestCase.java
@@ -180,7 +180,7 @@
     }
 
     private static ModelControllerClient createClient2() throws UnknownHostException {
-        return ModelControllerClient.Factory.create(InetAddress.getByName(TestSuiteEnvironment.getServerAddress()),
+        return ModelControllerClient.Factory.create(InetAddress.getByName(TestSuiteEnvironment.getServerAddressNode1()),
                 TestSuiteEnvironment.getServerPort() + 300,
                 Authentication.getCallbackHandler());
     }
@@ -239,7 +239,8 @@
                     new ModelNode[] { removeDwm, removeContext });
             mcc.execute(compositeOp);
             ServerReload.executeReloadAndWaitForCompletion(mcc, 60000, false,
-                    TestSuiteEnvironment.getServerAddress(), serverPort);
+                    CONTAINER_0.equals(containerId) ? TestSuiteEnvironment.getServerAddress() : TestSuiteEnvironment.getServerAddressNode1(),
+                    serverPort);
         }
 
         protected abstract Policy getPolicy();
@@ -333,7 +334,7 @@
     @Before
     public void setUpAdminObjects() throws NamingException {
         server1Proxy = lookupAdminObject(TestSuiteEnvironment.getServerAddress(), "8280");
-        server2Proxy = lookupAdminObject(TestSuiteEnvironment.getServerAddress(), "8380");
+        server2Proxy = lookupAdminObject(TestSuiteEnvironment.getServerAddressNode1(), "8380");
         Assert.assertNotNull(server1Proxy);
         Assert.assertNotNull(server2Proxy);
     }
