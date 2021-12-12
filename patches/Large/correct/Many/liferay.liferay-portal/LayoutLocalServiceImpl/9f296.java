diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index 3e21df4..9c6cc70 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -2802,7 +2802,7 @@
 
 	@Override
 	public MissingReferences validateImportPortletInfo(
-			long userId, long groupId, long plid, String portletId,
+			long userId, long plid, long groupId, String portletId,
 			Map<String, String[]> parameterMap, File file)
 		throws PortalException, SystemException {
 
@@ -2810,7 +2810,7 @@
 			PortletImporter portletImporter = new PortletImporter();
 
 			return portletImporter.validateFile(
-				userId, groupId, plid, portletId, parameterMap, file);
+				userId, plid, groupId, portletId, parameterMap, file);
 		}
 		catch (PortalException pe) {
 			Throwable cause = pe.getCause();
