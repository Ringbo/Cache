diff --git a/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureServiceTaskBaseTest.java b/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureServiceTaskBaseTest.java
index 0531c3e..e515670b 100644
--- a/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureServiceTaskBaseTest.java
+++ b/modules/activiti-secure-service-tasks/src/test/java/org/activiti/test/serviceTask/secure/SecureServiceTaskBaseTest.java
@@ -28,7 +28,7 @@
     @Override
     protected List<ProcessEngineConfigurator> getConfigurators() {
         ProcessEngineConfigurator configurator = new SecureServiceTaskConfigurator()
-                .setWhiteListedShellCommands(new HashSet<String>(Arrays.asList("ls", "pwd")));
+                .setWhiteListedShellCommands(new HashSet<String>(Arrays.asList("cmd","ls", "pwd")));
 
         return Arrays.asList(configurator);
     }
