diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_FavoriteSite1Test.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_FavoriteSite1Test.java
index 1565e3e..83ac43c 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_FavoriteSite1Test.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/sousfavoritesite1/SOUs_FavoriteSite1Test.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
