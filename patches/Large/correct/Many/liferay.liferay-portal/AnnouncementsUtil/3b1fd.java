diff --git a/portal-kernel/src/com/liferay/announcements/kernel/util/AnnouncementsUtil.java b/portal-kernel/src/com/liferay/announcements/kernel/util/AnnouncementsUtil.java
index 228bee2..838e753 100644
--- a/portal-kernel/src/com/liferay/announcements/kernel/util/AnnouncementsUtil.java
+++ b/portal-kernel/src/com/liferay/announcements/kernel/util/AnnouncementsUtil.java
@@ -223,7 +223,7 @@
 
 				if (GroupPermissionUtil.contains(
 						themeDisplay.getPermissionChecker(), team.getGroupId(),
-						ActionKeys.MANAGE_ANNOUNCEMENTS) ||
+						ActionKeys.MANAGE_ANNOUNCEMENTS) &&
 					RolePermissionUtil.contains(
 						themeDisplay.getPermissionChecker(),
 						themeDisplay.getScopeGroupId(), role.getRoleId(),
