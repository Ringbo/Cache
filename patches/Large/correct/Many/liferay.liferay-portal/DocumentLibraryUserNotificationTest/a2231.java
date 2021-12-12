diff --git a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/notifications/DocumentLibraryUserNotificationTest.java b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/notifications/DocumentLibraryUserNotificationTest.java
index 81ba1d9..5f2bb61 100644
--- a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/notifications/DocumentLibraryUserNotificationTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/notifications/DocumentLibraryUserNotificationTest.java
@@ -70,7 +70,8 @@
 	@Override
 	protected void subscribeToContainer() throws Exception {
 		DLAppLocalServiceUtil.subscribeFolder(
-			user.getUserId(), group.getGroupId(), _folder.getFolderId());
+			TestPropsValues.getUserId(), group.getGroupId(),
+			_folder.getFolderId());
 	}
 
 	@Override
