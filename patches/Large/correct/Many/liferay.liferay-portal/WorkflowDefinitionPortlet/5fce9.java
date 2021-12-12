diff --git a/modules/apps/workflow/workflow-definition-web/src/com/liferay/workflow/definition/web/portlet/WorkflowDefinitionPortlet.java b/modules/apps/workflow/workflow-definition-web/src/com/liferay/workflow/definition/web/portlet/WorkflowDefinitionPortlet.java
index 6fe3801..3f93c41 100644
--- a/modules/apps/workflow/workflow-definition-web/src/com/liferay/workflow/definition/web/portlet/WorkflowDefinitionPortlet.java
+++ b/modules/apps/workflow/workflow-definition-web/src/com/liferay/workflow/definition/web/portlet/WorkflowDefinitionPortlet.java
@@ -77,7 +77,7 @@
 		throws IOException, PortletException {
 
 		try {
-			String path = getPath(renderRequest);
+			String path = getPath(renderRequest, renderResponse);
 
 			if (Validator.equals(path, "/edit_workflow_definition.jsp")) {
 				setWorkflowDefinitionRenderRequestAttribute(renderRequest);
