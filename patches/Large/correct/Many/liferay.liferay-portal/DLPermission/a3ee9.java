diff --git a/portal-impl/src/com/liferay/portlet/documentlibrary/service/permission/DLPermission.java b/portal-impl/src/com/liferay/portlet/documentlibrary/service/permission/DLPermission.java
index f82b8c1..f91f39e 100644
--- a/portal-impl/src/com/liferay/portlet/documentlibrary/service/permission/DLPermission.java
+++ b/portal-impl/src/com/liferay/portlet/documentlibrary/service/permission/DLPermission.java
@@ -60,7 +60,7 @@
 					ResourceConstants.SCOPE_INDIVIDUAL,
 					String.valueOf(groupId));
 
-			if (count > 0) {
+			if (count <= 0) {
 				ResourceLocalServiceUtil.addResources(
 					permissionChecker.getCompanyId(), groupId, 0, RESOURCE_NAME,
 					groupId, false, true, true);
