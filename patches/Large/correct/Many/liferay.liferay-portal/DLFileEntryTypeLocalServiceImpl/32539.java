diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryTypeLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryTypeLocalServiceImpl.java
index 80a0f8a..898ec8b 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryTypeLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryTypeLocalServiceImpl.java
@@ -134,11 +134,12 @@
 		DLFileEntryType dlFileEntryType =
 			dlFileEntryTypePersistence.findByPrimaryKey(fileEntryTypeId);
 
-		DDMStructure ddmStructure = ddmStructureService.fetchStructure(
+		DDMStructure ddmStructure = ddmStructureLocalService.fetchStructure(
 			dlFileEntryType.getGroupId(), "auto_" + fileEntryTypeId);
 
 		if (ddmStructure != null) {
-			ddmStructureService.deleteStructure(ddmStructure.getStructureId());
+			ddmStructureLocalService.deleteStructure(
+				ddmStructure.getStructureId());
 		}
 
 		dlFileEntryTypePersistence.remove(fileEntryTypeId);
@@ -419,19 +420,19 @@
 
 		String xsd = ParamUtil.getString(serviceContext, "xsd");
 
-		DDMStructure ddmStructure = ddmStructureService.fetchStructure(
+		DDMStructure ddmStructure = ddmStructureLocalService.fetchStructure(
 			groupId, ddmStructureKey);
 
 		try {
 			if (ddmStructure == null) {
-				ddmStructure = ddmStructureService.addStructure(
-					groupId,
+				ddmStructure = ddmStructureLocalService.addStructure(
+					serviceContext.getUserId(), groupId,
 					PortalUtil.getClassNameId(DLFileEntryMetadata.class),
 					ddmStructureKey, nameMap, descriptionMap, xsd, "xml",
 					serviceContext);
 			}
 			else {
-				ddmStructure = ddmStructureService.updateStructure(
+				ddmStructure = ddmStructureLocalService.updateStructure(
 					ddmStructure.getStructureId(), nameMap, descriptionMap, xsd,
 					serviceContext);
 			}
@@ -440,7 +441,7 @@
 		}
 		catch (StructureXsdException sxe) {
 			if (ddmStructure != null) {
-				ddmStructureService.deleteStructure(
+				ddmStructureLocalService.deleteStructure(
 					ddmStructure.getStructureId());
 			}
 		}
