diff --git a/modules/apps/foundation/user-groups-admin/user-groups-admin-web/src/main/java/com/liferay/user/groups/admin/web/portlet/configuration/icon/DashboardPagesPortletConfigurationIcon.java b/modules/apps/foundation/user-groups-admin/user-groups-admin-web/src/main/java/com/liferay/user/groups/admin/web/portlet/configuration/icon/DashboardPagesPortletConfigurationIcon.java
index eac5de6..f662dc81 100644
--- a/modules/apps/foundation/user-groups-admin/user-groups-admin-web/src/main/java/com/liferay/user/groups/admin/web/portlet/configuration/icon/DashboardPagesPortletConfigurationIcon.java
+++ b/modules/apps/foundation/user-groups-admin/user-groups-admin-web/src/main/java/com/liferay/user/groups/admin/web/portlet/configuration/icon/DashboardPagesPortletConfigurationIcon.java
@@ -91,7 +91,7 @@
 			Group group = userGroup.getGroup();
 
 			if (GroupPermissionUtil.contains(
-					themeDisplay.getPermissionChecker(), userGroupGroup,
+					themeDisplay.getPermissionChecker(), group,
 					ActionKeys.VIEW) &&
 				(group.getPrivateLayoutsPageCount() > 0)) {
 
