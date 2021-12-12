diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
index 938dd8d..066a40b 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
@@ -980,8 +980,8 @@
 
 		dlFileVersionPersistence.update(dlFileVersion, false);
 
-		Map<Long, Fields> fieldsMap =
-			(Map<Long, Fields>)serviceContext.getAttribute("fieldsMap");
+		Map<String, Fields> fieldsMap =
+			(Map<String, Fields>)serviceContext.getAttribute("fieldsMap");
 
 		if (documentTypeId > 0) {
 			dlDocumentMetadataSetLocalService.updateDocumentMetadataSets(
@@ -1509,8 +1509,8 @@
 
 		dlFileVersionPersistence.update(dlFileVersion, false);
 
-		Map<Long, Fields> fieldsMap =
-			(Map<Long, Fields>)serviceContext.getAttribute("fieldsMap");
+		Map<String, Fields> fieldsMap =
+			(Map<String, Fields>)serviceContext.getAttribute("fieldsMap");
 
 		if (documentTypeId > 0) {
 			dlDocumentMetadataSetLocalService.updateDocumentMetadataSets(
