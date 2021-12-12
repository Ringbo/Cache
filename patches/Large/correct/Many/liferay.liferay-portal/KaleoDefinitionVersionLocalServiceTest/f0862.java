diff --git a/modules/apps/forms-and-workflow/portal-workflow/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoDefinitionVersionLocalServiceTest.java b/modules/apps/forms-and-workflow/portal-workflow/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoDefinitionVersionLocalServiceTest.java
index 498f2d2..1c62922 100644
--- a/modules/apps/forms-and-workflow/portal-workflow/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoDefinitionVersionLocalServiceTest.java
+++ b/modules/apps/forms-and-workflow/portal-workflow/portal-workflow-kaleo-test/src/testIntegration/java/com/liferay/portal/workflow/kaleo/service/test/KaleoDefinitionVersionLocalServiceTest.java
@@ -165,7 +165,8 @@
 
 		kaleoDefinition =
 			KaleoDefinitionLocalServiceUtil.incrementKaleoDefinition(
-				definition, StringUtil.randomString(), _serviceContext);
+				definition, kaleoDefinition.getName(),
+				StringUtil.randomString(), _serviceContext);
 
 		KaleoDefinitionLocalServiceUtil.activateKaleoDefinition(
 			kaleoDefinition.getKaleoDefinitionId(), _serviceContext);
