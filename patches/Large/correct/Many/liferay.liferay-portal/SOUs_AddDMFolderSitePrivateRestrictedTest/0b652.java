diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SOUs_AddDMFolderSitePrivateRestrictedTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SOUs_AddDMFolderSitePrivateRestrictedTest.java
index eefee32..03cdec8 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SOUs_AddDMFolderSitePrivateRestrictedTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SOUs_AddDMFolderSitePrivateRestrictedTest.java
@@ -31,7 +31,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -43,7 +43,7 @@
 		selenium.clickAt("//nav/ul/li[contains(.,'Documents')]/a/span",
 			RuntimeVariables.replace("Documents"));
 		selenium.waitForPageToLoad("30000");
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Add"),
 			selenium.getText("//span[@title='Add']/ul/li/strong/a/span"));
 		selenium.clickAt("//span[@title='Add']/ul/li/strong/a/span",
