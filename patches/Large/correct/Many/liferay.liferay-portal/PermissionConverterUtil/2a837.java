diff --git a/portal-service/src/com/liferay/portal/security/permission/PermissionConverterUtil.java b/portal-service/src/com/liferay/portal/security/permission/PermissionConverterUtil.java
index 0ce8d09..e5499c4 100644
--- a/portal-service/src/com/liferay/portal/security/permission/PermissionConverterUtil.java
+++ b/portal-service/src/com/liferay/portal/security/permission/PermissionConverterUtil.java
@@ -42,13 +42,13 @@
 		return _permissionConverter;
 	}
 
-	public List<Permission> convertPermissions(long roleId)
+	public static List<Permission> convertPermissions(long roleId)
 		throws PortalException, SystemException {
 
 		return getPermissionConverter().convertPermissions(roleId);
 	}
 
-	public List<Permission> convertPermissions(
+	public static List<Permission> convertPermissions(
 			long roleId, PermissionConversionFilter permissionConversionFilter)
 		throws PortalException, SystemException {
 
@@ -56,7 +56,7 @@
 			roleId, permissionConversionFilter);
 	}
 
-	public List<Permission> convertPermissions(Role role)
+	public static List<Permission> convertPermissions(Role role)
 		throws PortalException, SystemException {
 
 		return getPermissionConverter().convertPermissions(role);
