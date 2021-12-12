diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/db/DuplicateVariableInsertTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/db/DuplicateVariableInsertTest.java
index 85a4e58..c1f49a4 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/db/DuplicateVariableInsertTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/db/DuplicateVariableInsertTest.java
@@ -35,7 +35,7 @@
 	 * a barrier for starting and a barrier for completing the command, so they each insert a new variable guaranteed.
 	 */
 	public void testDuplicateVariableInsertOnExecution() throws Exception {
-		String processDefinitionId = deployOneTaskProcess();
+		String processDefinitionId = deployOneTaskTestProcess();
 		final ProcessInstance processInstance = runtimeService.startProcessInstanceById(processDefinitionId);
 		
 		final CyclicBarrier startBarrier = new CyclicBarrier(2);
@@ -88,7 +88,7 @@
 	 * a barrier for starting and a barrier for completing the command, so they each insert a new variable guaranteed.
 	 */
 	public void testDuplicateVariableInsertOnTask() throws Exception {
-		String processDefinitionId = deployOneTaskProcess();
+		String processDefinitionId = deployOneTaskTestProcess();
 		final ProcessInstance processInstance = runtimeService.startProcessInstanceById(processDefinitionId);
 		final Task task = taskService.createTaskQuery().processInstanceId(processInstance.getId()).singleResult();
 		
