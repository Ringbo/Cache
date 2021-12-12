diff --git a/portal-impl/src/com/liferay/portal/service/impl/GroupServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/GroupServiceImpl.java
index 8e0201a..8febc3e 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/GroupServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/GroupServiceImpl.java
@@ -99,7 +99,7 @@
 		throws PortalException, SystemException {
 
 		if (parentGroupId == GroupConstants.DEFAULT_PARENT_GROUP_ID) {
-			PortalPermissionUtil.contains(
+			PortalPermissionUtil.check(
 				getPermissionChecker(), ActionKeys.ADD_COMMUNITY);
 		}
 		else {
