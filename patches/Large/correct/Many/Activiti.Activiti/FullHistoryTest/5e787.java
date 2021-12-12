diff --git a/modules/activiti-engine/src/test/java/org/activiti/standalone/history/FullHistoryTest.java b/modules/activiti-engine/src/test/java/org/activiti/standalone/history/FullHistoryTest.java
index 48ca3f0..d08b4d9 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/standalone/history/FullHistoryTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/standalone/history/FullHistoryTest.java
@@ -626,7 +626,7 @@
     taskService.complete(task.getId());
     
     assertEquals(1, historyService.createHistoricProcessInstanceQuery().processInstanceId(processInstance.getId()).count());
-    assertEquals(2, historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstance.getId()).count());
+    assertEquals(3, historyService.createHistoricActivityInstanceQuery().processInstanceId(processInstance.getId()).count());
     assertEquals(4, historyService.createHistoricDetailQuery().processInstanceId(processInstance.getId()).count());
     assertEquals(1, historyService.createHistoricTaskInstanceQuery().processInstanceId(processInstance.getId()).count());
     
