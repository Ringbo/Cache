diff --git a/portal-service/src/com/liferay/portal/security/membershippolicy/BaseOrganizationMembershipPolicy.java b/portal-service/src/com/liferay/portal/security/membershippolicy/BaseOrganizationMembershipPolicy.java
index ffe3bf4..eea43e3 100644
--- a/portal-service/src/com/liferay/portal/security/membershippolicy/BaseOrganizationMembershipPolicy.java
+++ b/portal-service/src/com/liferay/portal/security/membershippolicy/BaseOrganizationMembershipPolicy.java
@@ -179,7 +179,7 @@
 			userId, organization.getGroupId(), roleId);
 
 		UserGroupRole userGroupRole =
-			UserGroupRoleLocalServiceUtil.getUserGroupRole(userGroupRolePK);
+			UserGroupRoleLocalServiceUtil.createUserGroupRole(userGroupRolePK);
 
 		userGroupRoles.add(userGroupRole);
 
