diff --git a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/notifications/DocumentLibraryUserNotificationTest.java b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/notifications/DocumentLibraryUserNotificationTest.java
index bd81bc8..cc96f48 100644
--- a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/notifications/DocumentLibraryUserNotificationTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/notifications/DocumentLibraryUserNotificationTest.java
@@ -70,8 +70,7 @@
 	@Override
 	protected void subscribeToContainer() throws Exception {
 		DLAppLocalServiceUtil.subscribeFolder(
-			TestPropsValues.getUserId(), group.getGroupId(),
-			_folder.getFolderId());
+			user.getUserId(), group.getGroupId(), _folder.getFolderId());
 	}
 
 	@Override
