diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLAppLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLAppLocalServiceImpl.java
index 69f5d6d..39d2e9f 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLAppLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/impl/DLAppLocalServiceImpl.java
@@ -447,7 +447,7 @@
 	public void deleteFileShortcut(long fileShortcutId)
 		throws PortalException, SystemException {
 
-		dlFileShortcutLocalService.deleteDLFileShortcut(fileShortcutId);
+		dlFileShortcutLocalService.deleteFileShortcut(fileShortcutId);
 	}
 
 	/**
