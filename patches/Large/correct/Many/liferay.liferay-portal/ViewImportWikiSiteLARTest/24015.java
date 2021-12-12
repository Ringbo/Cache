diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/ViewImportWikiSiteLARTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/ViewImportWikiSiteLARTest.java
index 251bce9..7fec951 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/ViewImportWikiSiteLARTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/wiki/wikilar/importwikisitelar/ViewImportWikiSiteLARTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -70,7 +70,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -109,7 +109,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
