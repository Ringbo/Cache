diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_ViewFavoriteSite1Test.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_ViewFavoriteSite1Test.java
index 7b60f41..ebd548e 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_ViewFavoriteSite1Test.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_ViewFavoriteSite1Test.java
@@ -32,7 +32,7 @@
 			RuntimeVariables.replace("My Favorites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open Site1"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -53,7 +53,7 @@
 			RuntimeVariables.replace("My Favorites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Open Site1 Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site1 Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace("Open Site1 Description"),
@@ -107,7 +107,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open Site2"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site2 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
