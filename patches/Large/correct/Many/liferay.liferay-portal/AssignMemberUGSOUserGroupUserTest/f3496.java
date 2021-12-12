diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/usergroups/assignrolesousergroup/AssignMemberUGSOUserGroupUserTest.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/usergroups/assignrolesousergroup/AssignMemberUGSOUserGroupUserTest.java
index 4ed220f..c0d3d5f 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/usergroups/assignrolesousergroup/AssignMemberUGSOUserGroupUserTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/usergroups/assignrolesousergroup/AssignMemberUGSOUserGroupUserTest.java
@@ -49,7 +49,7 @@
 		assertEquals(RuntimeVariables.replace("UG UserGroup Name"),
 			selenium.getText(
 				"//td[@id='_127_userGroupsSearchContainer_col-name_row-1']/a"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Actions"),
 			selenium.getText("//span[@title='Actions']/ul/li/strong/a/span"));
 		selenium.clickAt("//span[@title='Actions']/ul/li/strong/a/span",
