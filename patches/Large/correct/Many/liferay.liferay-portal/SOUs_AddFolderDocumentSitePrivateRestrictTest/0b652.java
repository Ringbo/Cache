diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SOUs_AddFolderDocumentSitePrivateRestrictTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SOUs_AddFolderDocumentSitePrivateRestrictTest.java
index 618ed1c..d5e9586 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SOUs_AddFolderDocumentSitePrivateRestrictTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SOUs_AddFolderDocumentSitePrivateRestrictTest.java
@@ -31,7 +31,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private Restricted"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Restricted Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -52,7 +52,7 @@
 			"DM Folder Name");
 		assertEquals(RuntimeVariables.replace("DM Folder Name"),
 			selenium.getText("//li[@class='folder selected']/a"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Add"),
 			selenium.getText("//span[@title='Add']/ul/li/strong/a/span"));
 		selenium.clickAt("//span[@title='Add']/ul/li/strong/a/span",
