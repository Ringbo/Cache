diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/history/HistoricActivityInstanceTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/history/HistoricActivityInstanceTest.java
index 2ae8ddf..cf8e5e5 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/history/HistoricActivityInstanceTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/history/HistoricActivityInstanceTest.java
@@ -100,9 +100,9 @@
     assertEquals(0, historyService.createHistoricActivityInstanceQuery().executionId("nonExistingExecutionId").list().size());
     
     if (processEngineConfiguration.getHistoryLevel()==ProcessEngineConfigurationImpl.HISTORYLEVEL_FULL) {
-      assertEquals(2, historyService.createHistoricActivityInstanceQuery().executionId(processInstance.getId()).list().size());
+      assertEquals(3, historyService.createHistoricActivityInstanceQuery().executionId(processInstance.getId()).list().size());
     } else if (processEngineConfiguration.getHistoryLevel()>=ProcessEngineConfigurationImpl.HISTORYLEVEL_ACTIVITY) {
-      assertEquals(1, historyService.createHistoricActivityInstanceQuery().executionId(processInstance.getId()).list().size());
+      assertEquals(3, historyService.createHistoricActivityInstanceQuery().executionId(processInstance.getId()).list().size());
     } else {
       assertEquals(0, historyService.createHistoricActivityInstanceQuery().executionId(processInstance.getId()).list().size());
     }
@@ -110,9 +110,9 @@
     assertEquals(0, historyService.createHistoricActivityInstanceQuery().processInstanceId("nonExistingProcessInstanceId").list().size());
 
     if (processEngineConfiguration.getHistoryLevel()==ProcessEngineConfigurationImpl.HISTORYLEVEL_FULL) {
-      assertEquals(2, historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstance.getId()).list().size());
+      assertEquals(3, historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstance.getId()).list().size());
     } else if (processEngineConfiguration.getHistoryLevel()>=ProcessEngineConfigurationImpl.HISTORYLEVEL_ACTIVITY) {
-      assertEquals(1, historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstance.getId()).list().size());
+      assertEquals(3, historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstance.getId()).list().size());
     } else {
       assertEquals(0, historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstance.getId()).list().size());
     }
@@ -120,9 +120,9 @@
     assertEquals(0, historyService.createHistoricActivityInstanceQuery().processDefinitionId("nonExistingProcessDefinitionId").list().size());
 
     if (processEngineConfiguration.getHistoryLevel()==ProcessEngineConfigurationImpl.HISTORYLEVEL_FULL) {
-      assertEquals(2, historyService.createHistoricActivityInstanceQuery().processDefinitionId(processInstance.getProcessDefinitionId()).list().size());
+      assertEquals(3, historyService.createHistoricActivityInstanceQuery().processDefinitionId(processInstance.getProcessDefinitionId()).list().size());
     } else if (processEngineConfiguration.getHistoryLevel()>=ProcessEngineConfigurationImpl.HISTORYLEVEL_ACTIVITY) {
-      assertEquals(1, historyService.createHistoricActivityInstanceQuery().processDefinitionId(processInstance.getProcessDefinitionId()).list().size());
+      assertEquals(3, historyService.createHistoricActivityInstanceQuery().processDefinitionId(processInstance.getProcessDefinitionId()).list().size());
     } else {
       assertEquals(0, historyService.createHistoricActivityInstanceQuery().processDefinitionId(processInstance.getProcessDefinitionId()).list().size());
     }
@@ -130,9 +130,9 @@
     assertEquals(0, historyService.createHistoricActivityInstanceQuery().unfinished().list().size());
 
     if (processEngineConfiguration.getHistoryLevel()==ProcessEngineConfigurationImpl.HISTORYLEVEL_FULL) {
-      assertEquals(2, historyService.createHistoricActivityInstanceQuery().finished().list().size());
+      assertEquals(3, historyService.createHistoricActivityInstanceQuery().finished().list().size());
     } else if (processEngineConfiguration.getHistoryLevel()>=ProcessEngineConfigurationImpl.HISTORYLEVEL_ACTIVITY) {
-      assertEquals(1, historyService.createHistoricActivityInstanceQuery().finished().list().size());
+      assertEquals(3, historyService.createHistoricActivityInstanceQuery().finished().list().size());
     } else {
       assertEquals(0, historyService.createHistoricActivityInstanceQuery().finished().list().size());
     }
