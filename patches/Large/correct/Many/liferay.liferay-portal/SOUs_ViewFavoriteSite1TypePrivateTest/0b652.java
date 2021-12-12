diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/SOUs_ViewFavoriteSite1TypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/SOUs_ViewFavoriteSite1TypePrivateTest.java
index 95d2a89..8529a37 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/SOUs_ViewFavoriteSite1TypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/SOUs_ViewFavoriteSite1TypePrivateTest.java
@@ -33,7 +33,7 @@
 			RuntimeVariables.replace("My Favorites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Site1"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -54,7 +54,7 @@
 			RuntimeVariables.replace("My Favorites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Site1 Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site1 Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace("Private Site1 Description"),
@@ -108,7 +108,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Site2"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site2 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
