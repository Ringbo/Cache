diff --git a/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/sites/portlet/SitesPortlet.java b/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/sites/portlet/SitesPortlet.java
index 9cded21..b817817 100644
--- a/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/sites/portlet/SitesPortlet.java
+++ b/portlets/so-portlet/docroot/WEB-INF/src/com/liferay/so/sites/portlet/SitesPortlet.java
@@ -504,8 +504,8 @@
 			Group.class.getName(), actionRequest);
 
 		Group group = GroupServiceUtil.addGroup(
-			GroupConstants.DEFAULT_PARENT_GROUP_ID, name, description, type,
-			StringPool.BLANK, true, true, serviceContext);
+			name, description, type, StringPool.BLANK, true, true,
+			serviceContext);
 
 		long layoutSetPrototypeId = ParamUtil.getLong(
 			actionRequest, "layoutSetPrototypeId");
