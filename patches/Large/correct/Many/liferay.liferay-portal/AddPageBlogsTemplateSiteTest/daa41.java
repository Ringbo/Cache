diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/AddPageBlogsTemplateSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/AddPageBlogsTemplateSiteTest.java
index 0eb00e7..38725eb 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/AddPageBlogsTemplateSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/AddPageBlogsTemplateSiteTest.java
@@ -35,7 +35,7 @@
 				assertTrue(selenium.isVisible("//input[@class='search-input']"));
 				selenium.type("//input[@class='search-input']",
 					RuntimeVariables.replace("Open"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				assertEquals(RuntimeVariables.replace("Open Site Name"),
 					selenium.getText(
 						"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
