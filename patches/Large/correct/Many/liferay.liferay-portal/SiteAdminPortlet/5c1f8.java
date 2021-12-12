diff --git a/modules/apps/site/site-admin-web/src/main/java/com/liferay/site/admin/web/internal/portlet/SiteAdminPortlet.java b/modules/apps/site/site-admin-web/src/main/java/com/liferay/site/admin/web/internal/portlet/SiteAdminPortlet.java
index 0a684b9..b584468 100644
--- a/modules/apps/site/site-admin-web/src/main/java/com/liferay/site/admin/web/internal/portlet/SiteAdminPortlet.java
+++ b/modules/apps/site/site-admin-web/src/main/java/com/liferay/site/admin/web/internal/portlet/SiteAdminPortlet.java
@@ -713,7 +713,8 @@
 				actionRequest, "name");
 			descriptionMap = LocalizationUtil.getLocalizationMap(
 				actionRequest, "description");
-			type = ParamUtil.getInteger(actionRequest, "type");
+			type = ParamUtil.getInteger(
+				actionRequest, "type", GroupConstants.TYPE_SITE_OPEN);
 			friendlyURL = ParamUtil.getString(actionRequest, "friendlyURL");
 			manualMembership = ParamUtil.getBoolean(
 				actionRequest, "manualMembership", true);
