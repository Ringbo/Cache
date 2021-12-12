diff --git a/portal-impl/src/com/liferay/portal/service/permission/UserPermissionImpl.java b/portal-impl/src/com/liferay/portal/service/permission/UserPermissionImpl.java
index ddc1ce1..5152345 100644
--- a/portal-impl/src/com/liferay/portal/service/permission/UserPermissionImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/permission/UserPermissionImpl.java
@@ -84,7 +84,8 @@
 		long[] organizationIds, String actionId) {
 
 		if (actionId.equals(ActionKeys.IMPERSONATE) &&
-			PortalUtil.isOmniadmin(userId)) {
+			PortalUtil.isOmniadmin(userId) &&
+			!permissionChecker.isOmniadmin()) {
 
 			return false;
 		}
