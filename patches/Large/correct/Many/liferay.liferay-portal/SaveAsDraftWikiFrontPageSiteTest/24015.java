diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/saveasdraftwikifrontpagesite/SaveAsDraftWikiFrontPageSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/saveasdraftwikifrontpagesite/SaveAsDraftWikiFrontPageSiteTest.java
index 3440718..102bba0 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/saveasdraftwikifrontpagesite/SaveAsDraftWikiFrontPageSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikipage/saveasdraftwikifrontpagesite/SaveAsDraftWikiFrontPageSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -88,7 +88,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.clickAt("//li[contains(@class, 'social-office-enabled')]/span[2]/a",
 			RuntimeVariables.replace("Open Site Name"));
 		selenium.waitForPageToLoad("30000");
