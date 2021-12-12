diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/organizations/assignorganizationsosites/AssignMembersSOUserOrganizationTest.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/organizations/assignorganizationsosites/AssignMembersSOUserOrganizationTest.java
index 17b4b00..32f41ef 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/organizations/assignorganizationsosites/AssignMembersSOUserOrganizationTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/organizations/assignorganizationsosites/AssignMembersSOUserOrganizationTest.java
@@ -45,7 +45,7 @@
 				selenium.clickAt("//input[@value='Search']",
 					RuntimeVariables.replace("Search"));
 				selenium.waitForPageToLoad("30000");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				assertEquals(RuntimeVariables.replace("Actions"),
 					selenium.getText(
 						"//span[@title='Actions']/ul/li/strong/a/span"));
