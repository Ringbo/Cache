diff --git a/portal-impl/src/com/liferay/portlet/layoutsadmin/action/EditLayoutsAction.java b/portal-impl/src/com/liferay/portlet/layoutsadmin/action/EditLayoutsAction.java
index 881a78e..5a5cb00 100644
--- a/portal-impl/src/com/liferay/portlet/layoutsadmin/action/EditLayoutsAction.java
+++ b/portal-impl/src/com/liferay/portlet/layoutsadmin/action/EditLayoutsAction.java
@@ -799,7 +799,8 @@
 			uploadPortletRequest, "copyLayoutId");
 
 		String layoutTemplateId = ParamUtil.getString(
-			uploadPortletRequest, "layoutTemplateId");
+			uploadPortletRequest, "layoutTemplateId",
+			PropsValues.DEFAULT_LAYOUT_TEMPLATE_ID);
 
 		ServiceContext serviceContext = ServiceContextFactory.getInstance(
 			Layout.class.getName(), actionRequest);
