diff --git a/portal-impl/src/com/liferay/portlet/blogs/service/permission/BlogsEntryPermission.java b/portal-impl/src/com/liferay/portlet/blogs/service/permission/BlogsEntryPermission.java
index 998aa45..bb35829 100644
--- a/portal-impl/src/com/liferay/portlet/blogs/service/permission/BlogsEntryPermission.java
+++ b/portal-impl/src/com/liferay/portlet/blogs/service/permission/BlogsEntryPermission.java
@@ -106,7 +106,7 @@
 			String actionId)
 		throws PortalException, SystemException {
 
-		contains(permissionChecker, primaryKey, actionId);
+		check(permissionChecker, primaryKey, actionId);
 	}
 
 }
\ No newline at end of file
