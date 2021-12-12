diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SelectSiteSOUser1Test.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SelectSiteSOUser1Test.java
index c322c73..384fd77 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SelectSiteSOUser1Test.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SelectSiteSOUser1Test.java
@@ -81,7 +81,7 @@
 					selenium.getText("//div[4]/span/a/span"));
 				selenium.clickAt("//div[4]/span/a/span",
 					RuntimeVariables.replace("Select"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				selenium.selectWindow("title=Users and Organizations");
 				selenium.waitForText("//h1[@class='header-title']/span", "Sites");
 				assertEquals(RuntimeVariables.replace("Sites"),
