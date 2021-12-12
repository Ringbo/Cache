diff --git a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/trash/DLFileShortcutTrashHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/trash/DLFileShortcutTrashHandlerTest.java
index ba8c822..85f773f 100644
--- a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/trash/DLFileShortcutTrashHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/trash/DLFileShortcutTrashHandlerTest.java
@@ -172,7 +172,7 @@
 
 	@Override
 	protected BaseModel<?> getBaseModel(long primaryKey) throws Exception {
-		return DLFileShortcutLocalServiceUtil.fetchDLFileShortcut(primaryKey);
+		return DLFileShortcutLocalServiceUtil.getDLFileShortcut(primaryKey);
 	}
 
 	@Override
