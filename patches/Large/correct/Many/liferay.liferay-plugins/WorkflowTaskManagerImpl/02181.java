diff --git a/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/WorkflowTaskManagerImpl.java b/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/WorkflowTaskManagerImpl.java
index 7c0223b..fe4dcf5 100644
--- a/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/WorkflowTaskManagerImpl.java
+++ b/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/WorkflowTaskManagerImpl.java
@@ -113,7 +113,7 @@
 				String.valueOf(userId), false, 1000);
 		}
 		catch (PortalException pe) {
-			if (e instanceof DuplicateLockException) {
+			if (pe instanceof DuplicateLockException) {
 				throw new WorkflowException(
 					"Workflow task " + workflowTaskInstanceId +
 						" is locked by user " + userId,
@@ -121,7 +121,7 @@
 			}
 
 			throw new WorkflowException(
-				"Unable to lock workflow task " + workflowTaskInstanceId, e);
+				"Unable to lock workflow task " + workflowTaskInstanceId, pe);
 		}
 
 		try {
