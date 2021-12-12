diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SelectSiteSOUser2Test.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SelectSiteSOUser2Test.java
index ba06dda..313cde8 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SelectSiteSOUser2Test.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SelectSiteSOUser2Test.java
@@ -81,7 +81,7 @@
 					selenium.getText("//div[4]/span/a/span"));
 				selenium.clickAt("//div[4]/span/a/span",
 					RuntimeVariables.replace("Select"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				selenium.selectWindow("title=Users and Organizations");
 				selenium.waitForText("//h1[@class='header-title']/span", "Sites");
 				assertEquals(RuntimeVariables.replace("Sites"),
