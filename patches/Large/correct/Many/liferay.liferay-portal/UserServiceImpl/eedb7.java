diff --git a/portal-impl/src/com/liferay/portal/service/impl/UserServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/UserServiceImpl.java
index 0956c6d..1876690 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/UserServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/UserServiceImpl.java
@@ -2102,7 +2102,7 @@
 		}
 
 		if ((userGroupIds != null) &&
-			(!addUserGroupIds.isEmpty() || !removeGroupIds.isEmpty())) {
+			(!addUserGroupIds.isEmpty() || !removeUserGroupIds.isEmpty())) {
 
 			UserGroupMembershipPolicyUtil.propagateMembership(
 				new long[] {user.getUserId()},
