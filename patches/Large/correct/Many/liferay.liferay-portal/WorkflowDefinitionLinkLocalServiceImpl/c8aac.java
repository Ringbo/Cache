diff --git a/portal-impl/src/com/liferay/portal/service/impl/WorkflowDefinitionLinkLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/WorkflowDefinitionLinkLocalServiceImpl.java
index 43b9db8..76da46e 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/WorkflowDefinitionLinkLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/WorkflowDefinitionLinkLocalServiceImpl.java
@@ -193,7 +193,8 @@
 		if (workflowDefinitionLink == null) {
 			throw new NoSuchWorkflowDefinitionLinkException(
 				StringBundler.concat(
-					"No workflow for groupId=", String.valueOf(groupId),
+					"No workflow for groupId=",
+					String.valueOf(StagingUtil.getLiveGroupId(groupId)),
 					", companyId=", String.valueOf(companyId),
 					" and className=", className));
 		}
@@ -291,7 +292,7 @@
 			return true;
 		}
 
-		return true;
+		return false;
 	}
 
 	@Override
@@ -357,14 +358,15 @@
 
 		WorkflowDefinitionLink workflowDefinitionLink =
 			workflowDefinitionLinkPersistence.fetchByG_C_C_C_T(
-				groupId, companyId,
+				StagingUtil.getLiveGroupId(groupId), companyId,
 				classNameLocalService.getClassNameId(className), classPK,
 				typePK);
 
 		if (workflowDefinitionLink == null) {
 			workflowDefinitionLink = addWorkflowDefinitionLink(
-				userId, companyId, groupId, className, classPK, typePK,
-				workflowDefinitionName, workflowDefinitionVersion);
+				userId, companyId, StagingUtil.getLiveGroupId(groupId),
+				className, classPK, typePK, workflowDefinitionName,
+				workflowDefinitionVersion);
 		}
 
 		workflowDefinitionLink.setGroupId(StagingUtil.getLiveGroupId(groupId));
