diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/AcceptMemberRequestSite1TypePrivateRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/AcceptMemberRequestSite1TypePrivateRestrictTest.java
index 83ae37e..0388736c 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/AcceptMemberRequestSite1TypePrivateRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/sousfavoritesite1typeprivaterestricted/AcceptMemberRequestSite1TypePrivateRestrictTest.java
@@ -32,7 +32,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site1 Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
