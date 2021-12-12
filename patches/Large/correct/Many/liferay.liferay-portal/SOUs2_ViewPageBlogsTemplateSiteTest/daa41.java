diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SOUs2_ViewPageBlogsTemplateSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SOUs2_ViewPageBlogsTemplateSiteTest.java
index b36962c..fb2b386 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SOUs2_ViewPageBlogsTemplateSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/users/teams/addteamsite/SOUs2_ViewPageBlogsTemplateSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
