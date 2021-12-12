diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/searchthreaddeletesitepublicrestrict/SOUs_PostNewMBThreadSiteTypePublicRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/searchthreaddeletesitepublicrestrict/SOUs_PostNewMBThreadSiteTypePublicRestrictedTest.java
index 8926f63..480c605 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/searchthreaddeletesitepublicrestrict/SOUs_PostNewMBThreadSiteTypePublicRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/publicrestrictedsite/searchthreaddeletesitepublicrestrict/SOUs_PostNewMBThreadSiteTypePublicRestrictedTest.java
@@ -32,7 +32,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Public Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Public Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
