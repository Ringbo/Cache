diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchthreaddeletesiteprivaterestrict/SOUs_PostNewMBThreadSiteTypePrivateRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchthreaddeletesiteprivaterestrict/SOUs_PostNewMBThreadSiteTypePrivateRestrictedTest.java
index b87b6cc..70bfcce 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchthreaddeletesiteprivaterestrict/SOUs_PostNewMBThreadSiteTypePrivateRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchthreaddeletesiteprivaterestrict/SOUs_PostNewMBThreadSiteTypePrivateRestrictedTest.java
@@ -32,7 +32,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
