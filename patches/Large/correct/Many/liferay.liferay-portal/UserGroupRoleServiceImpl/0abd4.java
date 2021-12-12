diff --git a/portal-impl/src/com/liferay/portal/service/impl/UserGroupRoleServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/UserGroupRoleServiceImpl.java
index 2f35d59..38fb055 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/UserGroupRoleServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/UserGroupRoleServiceImpl.java
@@ -173,7 +173,7 @@
 
 		if (!filteredOrganizationUserGroupRoles.isEmpty()) {
 			OrganizationMembershipPolicyUtil.checkRoles(
-				null, filteredSiteUserGroupRoles);
+				null, filteredOrganizationUserGroupRoles);
 		}
 
 		if (!filteredSiteUserGroupRoles.isEmpty()) {
