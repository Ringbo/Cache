diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addwikifrontpagesite/AddWikiFrontPageSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addwikifrontpagesite/AddWikiFrontPageSiteTest.java
index 56d2553..ade77d2 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addwikifrontpagesite/AddWikiFrontPageSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/addwikifrontpagesite/AddWikiFrontPageSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
