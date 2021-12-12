diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/repository/DeployInvalidXmlTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/repository/DeployInvalidXmlTest.java
index 66a75c0..630be40 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/repository/DeployInvalidXmlTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/repository/DeployInvalidXmlTest.java
@@ -27,7 +27,7 @@
   protected void setUp() throws Exception {
     super.setUp();
     
-    processEngineConfiguration.setEnableSafeBpmnXml(false); // Needs to be enabled to test this
+    processEngineConfiguration.setEnableSafeBpmnXml(true); // Needs to be enabled to test this
   }
   
   @Override
