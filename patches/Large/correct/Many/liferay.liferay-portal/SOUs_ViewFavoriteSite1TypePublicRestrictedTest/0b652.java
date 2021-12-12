diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/SOUs_ViewFavoriteSite1TypePublicRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/SOUs_ViewFavoriteSite1TypePublicRestrictedTest.java
index 7b75a43..392f2bf 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/SOUs_ViewFavoriteSite1TypePublicRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/sousfavoritesite1typepublicrestricted/SOUs_ViewFavoriteSite1TypePublicRestrictedTest.java
@@ -33,7 +33,7 @@
 			RuntimeVariables.replace("My Favorites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Public Restricted Site1"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -54,7 +54,7 @@
 			RuntimeVariables.replace("My Favorites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Public Restricted Site1 Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site1 Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace(
@@ -109,7 +109,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Public Restricted Site2"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site2 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
