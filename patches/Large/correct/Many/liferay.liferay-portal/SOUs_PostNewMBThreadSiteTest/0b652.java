diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchmbthreaddeletesite/SOUs_PostNewMBThreadSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchmbthreaddeletesite/SOUs_PostNewMBThreadSiteTest.java
index cb81847..c50d28f 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchmbthreaddeletesite/SOUs_PostNewMBThreadSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchmbthreaddeletesite/SOUs_PostNewMBThreadSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
