diff --git a/modules/apps/collaboration/wiki/wiki-service/src/main/java/com/liferay/wiki/service/permission/WikiPagePermissionChecker.java b/modules/apps/collaboration/wiki/wiki-service/src/main/java/com/liferay/wiki/service/permission/WikiPagePermissionChecker.java
index 466c153..4adb682 100644
--- a/modules/apps/collaboration/wiki/wiki-service/src/main/java/com/liferay/wiki/service/permission/WikiPagePermissionChecker.java
+++ b/modules/apps/collaboration/wiki/wiki-service/src/main/java/com/liferay/wiki/service/permission/WikiPagePermissionChecker.java
@@ -154,7 +154,7 @@
 
 		Boolean hasPermission = StagingPermissionUtil.hasPermission(
 			permissionChecker, page.getGroupId(), WikiPage.class.getName(),
-			page.getPageId(), WikiPortletKeys.WIKI, actionId);
+			page.getResourcePrimKey(), WikiPortletKeys.WIKI, actionId);
 
 		if (hasPermission != null) {
 			return hasPermission.booleanValue();
