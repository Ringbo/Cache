diff --git a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-data-provider-instance/src/main/java/com/liferay/dynamic/data/mapping/data/provider/instance/WorkflowDefinitionsDataProvider.java b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-data-provider-instance/src/main/java/com/liferay/dynamic/data/mapping/data/provider/instance/WorkflowDefinitionsDataProvider.java
index bca0bc1..8152217 100644
--- a/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-data-provider-instance/src/main/java/com/liferay/dynamic/data/mapping/data/provider/instance/WorkflowDefinitionsDataProvider.java
+++ b/modules/apps/forms-and-workflow/dynamic-data-mapping/dynamic-data-mapping-data-provider-instance/src/main/java/com/liferay/dynamic/data/mapping/data/provider/instance/WorkflowDefinitionsDataProvider.java
@@ -69,7 +69,7 @@
 
 		data.add(
 			new KeyValuePair(
-				LanguageUtil.get(locale, "no-workflow"), "no-workflow"));
+				"no-workflow", LanguageUtil.get(locale, "no-workflow")));
 
 		if (!_workflowEngineManager.isDeployed()) {
 			return DDMDataProviderResponse.of(
