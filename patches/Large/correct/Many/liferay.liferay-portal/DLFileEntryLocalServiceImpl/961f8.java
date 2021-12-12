diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
index c628058..0d8155d 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLFileEntryLocalServiceImpl.java
@@ -582,13 +582,13 @@
 					DLFileEntryConstants.PRIVATE_WORKING_COPY_VERSION,
 					existingDLFileVersion.getSize(),
 					WorkflowConstants.STATUS_DRAFT,
-					serviceContext.getModifiedDate(), serviceContext);
+					serviceContext.getModifiedDate(null), serviceContext);
 			}
 			else {
 				long oldDLFileVersionId = dlFileVersion.getFileVersionId();
 
 				dlFileVersion = addFileVersion(
-					user, dlFileEntry, serviceContext.getModifiedDate(),
+					user, dlFileEntry, serviceContext.getModifiedDate(null),
 					dlFileVersion.getExtension(), dlFileVersion.getMimeType(),
 					dlFileVersion.getTitle(), dlFileVersion.getDescription(),
 					dlFileVersion.getChangeLog(),
