diff --git a/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java b/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
index 288d805..e172fdd 100644
--- a/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
+++ b/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
@@ -393,9 +393,7 @@
 			stagingGroup.getGroupId());
 	}
 
-	protected void verifyStagingGroupUserMembership(Group stagingGroup)
-		throws Exception {
-
+	protected void verifyStagingGroupUserMembership(Group stagingGroup) {
 		List<User> stagingGroupUsers = UserLocalServiceUtil.getGroupUsers(
 			stagingGroup.getGroupId());
 
