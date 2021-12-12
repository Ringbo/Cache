diff --git a/modules/apps/business-productivity/portal-workflow/portal-workflow-kaleo-runtime-impl/src/main/java/com/liferay/portal/workflow/kaleo/runtime/internal/node/TaskNodeExecutor.java b/modules/apps/business-productivity/portal-workflow/portal-workflow-kaleo-runtime-impl/src/main/java/com/liferay/portal/workflow/kaleo/runtime/internal/node/TaskNodeExecutor.java
index 23c6b59d..73e2d59 100644
--- a/modules/apps/business-productivity/portal-workflow/portal-workflow-kaleo-runtime-impl/src/main/java/com/liferay/portal/workflow/kaleo/runtime/internal/node/TaskNodeExecutor.java
+++ b/modules/apps/business-productivity/portal-workflow/portal-workflow-kaleo-runtime-impl/src/main/java/com/liferay/portal/workflow/kaleo/runtime/internal/node/TaskNodeExecutor.java
@@ -158,7 +158,7 @@
 			KaleoNode.class.getName(), currentKaleoNode.getKaleoNodeId(),
 			ExecutionType.ON_ASSIGNMENT, executionContext);
 
-		_notificationHelper.sendKaleoNotifications(
+		notificationHelper.sendKaleoNotifications(
 			KaleoNode.class.getName(), currentKaleoNode.getKaleoNodeId(),
 			ExecutionType.ON_ASSIGNMENT, executionContext);
 
