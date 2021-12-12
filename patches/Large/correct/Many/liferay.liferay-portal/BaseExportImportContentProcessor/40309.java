diff --git a/modules/apps/export-import/export-import-service/src/com/liferay/exportimport/content/processor/base/BaseExportImportContentProcessor.java b/modules/apps/export-import/export-import-service/src/com/liferay/exportimport/content/processor/base/BaseExportImportContentProcessor.java
index b63c219..1c968bb 100644
--- a/modules/apps/export-import/export-import-service/src/com/liferay/exportimport/content/processor/base/BaseExportImportContentProcessor.java
+++ b/modules/apps/export-import/export-import-service/src/com/liferay/exportimport/content/processor/base/BaseExportImportContentProcessor.java
@@ -78,7 +78,8 @@
 		content = replaceExportDLReferences(
 			portletDataContext, stagedModel, content, exportReferencedContent);
 
-		content = replaceExportLayoutReferences(portletDataContext, content);
+		content = replaceExportLayoutReferences(
+			portletDataContext, stagedModel, content);
 
 		content = replaceExportLinksToLayouts(
 			portletDataContext, stagedModel, content);
@@ -449,7 +450,8 @@
 	}
 
 	protected String replaceExportLayoutReferences(
-			PortletDataContext portletDataContext, String content)
+			PortletDataContext portletDataContext, StagedModel stagedModel,
+			String content)
 		throws Exception {
 
 		Group group = GroupLocalServiceUtil.getGroup(
@@ -641,13 +643,13 @@
 				}
 
 				Element entityElement = portletDataContext.getExportDataElement(
-					entityStagedModel);
+					stagedModel);
 
 				Layout layout = LayoutLocalServiceUtil.fetchLayoutByFriendlyURL(
 					group.getGroupId(), privateLayout, url);
 
 				portletDataContext.addReferenceElement(
-					entityStagedModel, entityElement, layout,
+					stagedModel, entityElement, layout,
 					PortletDataContext.REFERENCE_TYPE_DEPENDENCY, true);
 			}
 			finally {
