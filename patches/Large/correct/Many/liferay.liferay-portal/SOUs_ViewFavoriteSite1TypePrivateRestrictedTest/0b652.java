diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_ViewFavoriteSite1TypePrivateRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_ViewFavoriteSite1TypePrivateRestrictedTest.java
index 6c58b05..6a67234 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_ViewFavoriteSite1TypePrivateRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/SOUs_ViewFavoriteSite1TypePrivateRestrictedTest.java
@@ -34,7 +34,7 @@
 			RuntimeVariables.replace("My Favorites"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted Site1"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -55,7 +55,7 @@
 			RuntimeVariables.replace("My Favorites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Restricted Site1 Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site1 Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace(
@@ -110,7 +110,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted Site2"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site2 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
