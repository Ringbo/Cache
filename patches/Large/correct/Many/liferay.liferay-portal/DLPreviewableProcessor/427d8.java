diff --git a/portal-service/src/com/liferay/portlet/documentlibrary/util/DLPreviewableProcessor.java b/portal-service/src/com/liferay/portlet/documentlibrary/util/DLPreviewableProcessor.java
index 816dff6..2ce8009 100644
--- a/portal-service/src/com/liferay/portlet/documentlibrary/util/DLPreviewableProcessor.java
+++ b/portal-service/src/com/liferay/portlet/documentlibrary/util/DLPreviewableProcessor.java
@@ -360,7 +360,7 @@
 				groupId, fileEntryId, fileVersionId, type);
 
 			try {
-				DLStoreUtil.deleteDirectory(companyId, REPOSITORY_ID, path);
+				DLStoreUtil.deleteFile(companyId, REPOSITORY_ID, path);
 			}
 			catch (Exception e) {
 			}
@@ -702,7 +702,7 @@
 
 		return getPreviewFilePath(
 			fileVersion.getGroupId(), fileVersion.getFileEntryId(),
-			fileVersion.getFileVersionId(), index, getPreviewType());
+			fileVersion.getFileVersionId(), index, type);
 	}
 
 	protected String getPreviewFilePath(FileVersion fileVersion, String type) {
