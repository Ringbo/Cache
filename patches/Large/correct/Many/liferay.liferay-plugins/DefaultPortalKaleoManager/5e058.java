diff --git a/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/manager/DefaultPortalKaleoManager.java b/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/manager/DefaultPortalKaleoManager.java
index 90d29d7..563c660 100644
--- a/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/manager/DefaultPortalKaleoManager.java
+++ b/webs/kaleo-web/docroot/WEB-INF/src/com/liferay/portal/workflow/kaleo/manager/DefaultPortalKaleoManager.java
@@ -230,7 +230,7 @@
 		try {
 			WorkflowDefinitionLinkLocalServiceUtil.
 				getDefaultWorkflowDefinitionLink(
-					company.getCompanyId(), assetClassName, 0);
+					company.getCompanyId(), assetClassName, 0, 0);
 
 			return;
 		}
@@ -256,7 +256,7 @@
 
 		WorkflowDefinitionLinkLocalServiceUtil.addWorkflowDefinitionLink(
 			defaultUser.getUserId(), company.getCompanyId(),
-			companyGroup.getGroupId(), assetClassName, 0,
+			companyGroup.getGroupId(), assetClassName, 0, 0,
 			workflowDefinition.getName(), workflowDefinition.getVersion());
 	}
 
