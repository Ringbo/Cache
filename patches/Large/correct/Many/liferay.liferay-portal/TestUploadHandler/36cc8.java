diff --git a/modules/portal/portal-portlet-container-test/src/testIntegration/java/com/liferay/portal/portlet/container/upload/test/TestUploadHandler.java b/modules/portal/portal-portlet-container-test/src/testIntegration/java/com/liferay/portal/portlet/container/upload/test/TestUploadHandler.java
index 0c64172..73094e0 100644
--- a/modules/portal/portal-portlet-container-test/src/testIntegration/java/com/liferay/portal/portlet/container/upload/test/TestUploadHandler.java
+++ b/modules/portal/portal-portlet-container-test/src/testIntegration/java/com/liferay/portal/portlet/container/upload/test/TestUploadHandler.java
@@ -43,12 +43,12 @@
 		String contentType, InputStream inputStream, long size,
 		ServiceContext serviceContext) {
 
-		FileEntry fileEntry = new TestFileEntry(
+		TestFileEntry testFileEntry = new TestFileEntry(
 			fileName, folderId, groupId, inputStream);
 
-		_testUploadPortlet.put(fileEntry);
+		_testUploadPortlet.put(testFileEntry);
 
-		return fileEntry;
+		return testFileEntry;
 	}
 
 	@Override
