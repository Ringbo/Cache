diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/EditTeamPermissionsPageBlogsTemplateSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/EditTeamPermissionsPageBlogsTemplateSiteTest.java
index 1965c4e..507b9d8 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/EditTeamPermissionsPageBlogsTemplateSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/EditTeamPermissionsPageBlogsTemplateSiteTest.java
@@ -36,7 +36,7 @@
 				assertTrue(selenium.isVisible("//input[@class='search-input']"));
 				selenium.type("//input[@class='search-input']",
 					RuntimeVariables.replace("Open"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				assertEquals(RuntimeVariables.replace("Open Site Name"),
 					selenium.getText(
 						"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -63,7 +63,7 @@
 					RuntimeVariables.replace("Page"));
 				selenium.waitForVisible("//iframe[@id='manageContentDialog']");
 				selenium.selectFrame("//iframe[@id='manageContentDialog']");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				selenium.waitForVisible("//button[contains(.,'Permissions')]");
 				assertEquals(RuntimeVariables.replace("Permissions"),
 					selenium.getText("//button[contains(.,'Permissions')]"));
