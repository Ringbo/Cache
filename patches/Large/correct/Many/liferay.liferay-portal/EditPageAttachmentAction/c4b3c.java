diff --git a/portal-impl/src/com/liferay/portlet/wiki/action/EditPageAttachmentAction.java b/portal-impl/src/com/liferay/portlet/wiki/action/EditPageAttachmentAction.java
index 5246e67..c6c8c8a 100644
--- a/portal-impl/src/com/liferay/portlet/wiki/action/EditPageAttachmentAction.java
+++ b/portal-impl/src/com/liferay/portlet/wiki/action/EditPageAttachmentAction.java
@@ -219,7 +219,8 @@
 		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(
 			actionRequest);
 
-		long nodeId = ParamUtil.getLong(uploadRequest, "nodeId");
+		long nodeId = ParamUtil.getLong(actionRequest, "nodeId");
+
 		File file = uploadRequest.getFile("file");
 		String sourceFileName = uploadRequest.getFileName("file");
 
