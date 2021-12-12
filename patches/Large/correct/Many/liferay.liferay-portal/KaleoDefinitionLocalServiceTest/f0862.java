diff --git a/modules/apps/forms-and-workflow/portal-workflow/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoDefinitionLocalServiceTest.java b/modules/apps/forms-and-workflow/portal-workflow/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoDefinitionLocalServiceTest.java
index b75f006..03038f0 100644
--- a/modules/apps/forms-and-workflow/portal-workflow/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoDefinitionLocalServiceTest.java
+++ b/modules/apps/forms-and-workflow/portal-workflow/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoDefinitionLocalServiceTest.java
@@ -162,7 +162,8 @@
 
 		kaleoDefinition =
 			KaleoDefinitionLocalServiceUtil.incrementKaleoDefinition(
-				definition, StringUtil.randomString(), _serviceContext);
+				definition, kaleoDefinition.getName(),
+				StringUtil.randomString(), _serviceContext);
 
 		KaleoDefinitionLocalServiceUtil.activateKaleoDefinition(
 			kaleoDefinition.getKaleoDefinitionId(), _serviceContext);
