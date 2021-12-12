diff --git a/modules/apps/layout/layout-impl/src/main/java/com/liferay/layout/internal/workflow/definition/link/update/handler/LayoutRevisionWorkflowDefinitionLinkUpdateHandler.java b/modules/apps/layout/layout-impl/src/main/java/com/liferay/layout/internal/workflow/definition/link/update/handler/LayoutRevisionWorkflowDefinitionLinkUpdateHandler.java
index 19021cc..a932186 100644
--- a/modules/apps/layout/layout-impl/src/main/java/com/liferay/layout/internal/workflow/definition/link/update/handler/LayoutRevisionWorkflowDefinitionLinkUpdateHandler.java
+++ b/modules/apps/layout/layout-impl/src/main/java/com/liferay/layout/internal/workflow/definition/link/update/handler/LayoutRevisionWorkflowDefinitionLinkUpdateHandler.java
@@ -50,7 +50,7 @@
 		// Workflow definition link was deleted
 
 		List<LayoutRevision> pendingLayoutRevisions =
-			_layoutRevisionLocalService.getLayoutRevisions(
+			_layoutRevisionLocalService.getLayoutRevisionsByStatus(
 				WorkflowConstants.STATUS_PENDING);
 
 		Stream<LayoutRevision> stream = pendingLayoutRevisions.stream();
