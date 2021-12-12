diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addsaveasdraftwikifrontpagesite/AddSaveAsDraftWikiFrontPageSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addsaveasdraftwikifrontpagesite/AddSaveAsDraftWikiFrontPageSiteTest.java
index 2b4af7b..b9c42fd 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addsaveasdraftwikifrontpagesite/AddSaveAsDraftWikiFrontPageSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addsaveasdraftwikifrontpagesite/AddSaveAsDraftWikiFrontPageSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.clickAt("//li[contains(@class, 'social-office-enabled')]/span[2]/a",
 			RuntimeVariables.replace("Open Site Name"));
 		selenium.waitForPageToLoad("30000");
