diff --git a/modules/apps/foundation/user-groups-admin/user-groups-admin-web/src/main/java/com/liferay/user/groups/admin/web/portlet/configuration/icon/ProfilePagesPortletConfigurationIcon.java b/modules/apps/foundation/user-groups-admin/user-groups-admin-web/src/main/java/com/liferay/user/groups/admin/web/portlet/configuration/icon/ProfilePagesPortletConfigurationIcon.java
index 0220cb1..713b30d 100644
--- a/modules/apps/foundation/user-groups-admin/user-groups-admin-web/src/main/java/com/liferay/user/groups/admin/web/portlet/configuration/icon/ProfilePagesPortletConfigurationIcon.java
+++ b/modules/apps/foundation/user-groups-admin/user-groups-admin-web/src/main/java/com/liferay/user/groups/admin/web/portlet/configuration/icon/ProfilePagesPortletConfigurationIcon.java
@@ -91,7 +91,7 @@
 			Group group = userGroup.getGroup();
 
 			if (GroupPermissionUtil.contains(
-					themeDisplay.getPermissionChecker(), userGroupGroup,
+					themeDisplay.getPermissionChecker(), group,
 					ActionKeys.VIEW) &&
 				(group.getPublicLayoutsPageCount() > 0)) {
 
