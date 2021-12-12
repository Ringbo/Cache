diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchmbthreaddeletesitetypeprivate/SOUs_PostNewMBThreadSiteTypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchmbthreaddeletesitetypeprivate/SOUs_PostNewMBThreadSiteTypePrivateTest.java
index 3377242..74d7121 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchmbthreaddeletesitetypeprivate/SOUs_PostNewMBThreadSiteTypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchmbthreaddeletesitetypeprivate/SOUs_PostNewMBThreadSiteTypePrivateTest.java
@@ -31,7 +31,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
