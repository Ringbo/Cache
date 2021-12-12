diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/SOUs_FavoriteSite1TypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/SOUs_FavoriteSite1TypePrivateTest.java
index f5d622e..6982534 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/SOUs_FavoriteSite1TypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/sousfavoritesite1typeprivate/SOUs_FavoriteSite1TypePrivateTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
