diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchdmfolderdocumentdeletesite/SOUs_AddDMFolderDocumentSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchdmfolderdocumentdeletesite/SOUs_AddDMFolderDocumentSiteTest.java
index 813d394..79c6a69 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchdmfolderdocumentdeletesite/SOUs_AddDMFolderDocumentSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/site/searchdmfolderdocumentdeletesite/SOUs_AddDMFolderDocumentSiteTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -51,7 +51,7 @@
 			"DM Folder Name");
 		assertEquals(RuntimeVariables.replace("DM Folder Name"),
 			selenium.getText("//li[@class='folder selected']/a"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Add"),
 			selenium.getText("//span[@title='Add']/ul/li/strong/a/span"));
 		selenium.clickAt("//span[@title='Add']/ul/li/strong/a/span",
