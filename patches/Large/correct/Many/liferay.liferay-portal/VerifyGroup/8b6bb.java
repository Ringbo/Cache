diff --git a/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java b/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
index e172fdd..288d805 100644
--- a/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
+++ b/portal-impl/src/com/liferay/portal/verify/VerifyGroup.java
@@ -393,7 +393,9 @@
 			stagingGroup.getGroupId());
 	}
 
-	protected void verifyStagingGroupUserMembership(Group stagingGroup) {
+	protected void verifyStagingGroupUserMembership(Group stagingGroup)
+		throws Exception {
+
 		List<User> stagingGroupUsers = UserLocalServiceUtil.getGroupUsers(
 			stagingGroup.getGroupId());
 
