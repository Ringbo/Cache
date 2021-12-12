diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/trash/DLFileShortcutTrashHandler.java b/portal-impl/src/com/liferay/portlet/documentlibrary/trash/DLFileShortcutTrashHandler.java
index 2952db7..b817170 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/trash/DLFileShortcutTrashHandler.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/trash/DLFileShortcutTrashHandler.java
@@ -48,7 +48,7 @@
 	public void deleteTrashEntry(long classPK)
 		throws PortalException, SystemException {
 
-		DLFileShortcutLocalServiceUtil.deleteFileShortcut(classPK);
+		DLAppLocalServiceUtil.deleteFileShortcut(classPK);
 	}
 
 	public String getClassName() {
