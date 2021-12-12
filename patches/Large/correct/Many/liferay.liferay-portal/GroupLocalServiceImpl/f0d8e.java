diff --git a/portal-ejb/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java b/portal-ejb/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
index 8327538..c78cf01 100644
--- a/portal-ejb/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
+++ b/portal-ejb/src/com/liferay/portal/service/impl/GroupLocalServiceImpl.java
@@ -85,10 +85,10 @@
 		User user = UserUtil.findByPrimaryKey(userId);
 
 		if (Validator.isNull(className) || Validator.isNull(classPK)) {
-			validateName(null, user.getCompanyId(), name);
+			validateName(null, user.getActualCompanyId(), name);
 		}
 
-		validateFriendlyURL(null, user.getCompanyId(), friendlyURL);
+		validateFriendlyURL(null, user.getActualCompanyId(), friendlyURL);
 
 		String groupId = Long.toString(CounterServiceUtil.increment(
 			Group.class.getName()));
@@ -99,7 +99,7 @@
 
 		Group group = GroupUtil.create(groupId);
 
-		group.setCompanyId(user.getCompanyId());
+		group.setCompanyId(user.getActualCompanyId());
 		group.setClassName(className);
 		group.setClassPK(classPK);
 		group.setParentGroupId(Group.DEFAULT_PARENT_GROUP_ID);
@@ -111,17 +111,19 @@
 		// Layout sets
 
 		LayoutSetLocalServiceUtil.addLayoutSet(
-			Layout.PRIVATE + groupId, user.getCompanyId());
+			Layout.PRIVATE + groupId, user.getActualCompanyId());
 
 		LayoutSetLocalServiceUtil.addLayoutSet(
-			Layout.PUBLIC + groupId, user.getCompanyId());
+			Layout.PUBLIC + groupId, user.getActualCompanyId());
 
-		if (Validator.isNull(className) && Validator.isNull(classPK)) {
+		if (Validator.isNull(className) && Validator.isNull(classPK) &&
+			!User.isDefaultUser(userId)) {
 
 			// Role
 
 			Role role = RoleLocalServiceUtil.addRole(
-				user.getCompanyId(), "GROUP_" + groupId + "_ADMINISTRATOR",
+				user.getActualCompanyId(), "GROUP_" + groupId +
+					"_ADMINISTRATOR",
 					Group.class.getName(), groupId);
 
 			UserLocalServiceUtil.addRoleUsers(
@@ -160,7 +162,9 @@
 				group = GroupFinder.findByC_N_2(companyId, systemGroups[i]);
 			}
 			catch (NoSuchGroupException nsge) {
-				group = addGroup(companyId, null, null, systemGroups[i], null);
+				group = addGroup(
+					User.getDefaultUserId(companyId), null, null,
+					systemGroups[i], null);
 			}
 
 			if (group.getName().equals(Group.GUEST)) {
