diff --git a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/DLAppLocalServiceTest.java b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/DLAppLocalServiceTest.java
index 52defc5..bb09b57 100644
--- a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/DLAppLocalServiceTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/DLAppLocalServiceTest.java
@@ -226,8 +226,7 @@
 			Folder folder = addFolder(_group.getGroupId(), false, "Old Name");
 
 			DLAppLocalServiceUtil.updateFolder(
-				folder.getGroupId(), folder.getFolderId(),
-				folder.getParentFolderId(), "New Name",
+				folder.getFolderId(), folder.getParentFolderId(), "New Name",
 				RandomTestUtil.randomString(), serviceContext);
 
 			AssetEntry assetEntry = AssetEntryLocalServiceUtil.getEntry(
