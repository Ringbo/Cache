diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/AssignSOUser1TeamSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/AssignSOUser1TeamSiteTest.java
index f39ed9a..5b47a24 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/AssignSOUser1TeamSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/AssignSOUser1TeamSiteTest.java
@@ -65,7 +65,7 @@
 		selenium.waitForPageToLoad("30000");
 		assertEquals(RuntimeVariables.replace("Open Site Team Name"),
 			selenium.getText("//tr[3]/td[1]/a"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Actions"),
 			selenium.getText("//span[@title='Actions']/ul/li/strong/a/span"));
 		selenium.clickAt("//span[@title='Actions']/ul/li/strong/a/span",
