diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/multiinstance/MultiInstanceTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/multiinstance/MultiInstanceTest.java
index 7de37cb..f3ecf77 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/multiinstance/MultiInstanceTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/bpmn/multiinstance/MultiInstanceTest.java
@@ -575,7 +575,7 @@
   @Deployment
   public void testParallelSubProcessCompletionCondition() {
     String procId = runtimeService.startProcessInstanceByKey("miParallelSubprocessCompletionCondition").getId();
-    List<Task> tasks = taskService.createTaskQuery().orderByTaskId().asc().list();
+    List<Task> tasks = taskService.createTaskQuery().orderByExecutionId().asc().list();
     assertEquals(4, tasks.size());
     
     for (int i=0; i<2; i++) {
