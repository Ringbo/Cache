diff --git a/webs/jbpm-web/docroot/WEB-INF/src/com/liferay/portal/workflow/jbpm/WorkflowTaskManagerImpl.java b/webs/jbpm-web/docroot/WEB-INF/src/com/liferay/portal/workflow/jbpm/WorkflowTaskManagerImpl.java
index fbbcdd6..0dc91b9 100644
--- a/webs/jbpm-web/docroot/WEB-INF/src/com/liferay/portal/workflow/jbpm/WorkflowTaskManagerImpl.java
+++ b/webs/jbpm-web/docroot/WEB-INF/src/com/liferay/portal/workflow/jbpm/WorkflowTaskManagerImpl.java
@@ -266,23 +266,23 @@
 
 			CustomSession customSession = new CustomSession(jbpmContext);
 
-			for (TaskInstance taskInstance : taskInstances) {
+			for (TaskInstance taskInstance_ : taskInstances) {
 				TaskInstanceExtensionImpl taskInstanceExtensionImpl =
 					customSession.findTaskInstanceExtension(
-						taskInstance.getId());
+						taskInstance_.getId());
 
 				if (taskInstanceExtensionImpl == null) {
 					List<Assignee> assignees =
 						AssigneeRetrievalUtil.getAssignees(
-							companyId, groupId, taskInstance.getActorId(),
-							taskInstance.getPooledActors());
+							companyId, groupId, taskInstance_.getActorId(),
+							taskInstance_.getPooledActors());
 
 					String workflowContextJSON =
 						WorkflowContextUtil.convertToJSON(workflowContext);
 
 					taskInstanceExtensionImpl = new TaskInstanceExtensionImpl(
 						companyId, groupId, userId, assignees,
-						workflowContextJSON, taskInstance);
+						workflowContextJSON, taskInstance_);
 
 					session.save(taskInstanceExtensionImpl);
 				}
