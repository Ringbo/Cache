diff --git a/modules/apps/export-import/export-import-changeset-web/src/main/java/com/liferay/exportimport/changeset/web/internal/portlet/data/handler/ChangesetPortletDataHandler.java b/modules/apps/export-import/export-import-changeset-web/src/main/java/com/liferay/exportimport/changeset/web/internal/portlet/data/handler/ChangesetPortletDataHandler.java
index 22def21..148c508 100644
--- a/modules/apps/export-import/export-import-changeset-web/src/main/java/com/liferay/exportimport/changeset/web/internal/portlet/data/handler/ChangesetPortletDataHandler.java
+++ b/modules/apps/export-import/export-import-changeset-web/src/main/java/com/liferay/exportimport/changeset/web/internal/portlet/data/handler/ChangesetPortletDataHandler.java
@@ -85,7 +85,7 @@
 		Map<String, String[]> parameterMap =
 			portletDataContext.getParameterMap();
 
-		String[] stagedModelTypesStrings = parameterMap.get("stagedModelTypes");
+		Object[] stagedModelTypesStrings = parameterMap.get("stagedModelTypes");
 
 		if (ArrayUtil.isEmpty(stagedModelTypesStrings)) {
 			return super.exportData(
@@ -97,7 +97,7 @@
 
 		for (int i = 0; i < stagedModelTypesStrings.length; i++) {
 			stagedModelTypes[i] = StagedModelType.parse(
-				stagedModelTypesStrings[i]);
+				String.valueOf(stagedModelTypesStrings[i]));
 		}
 
 		setDeletionSystemEventStagedModelTypes(stagedModelTypes);
