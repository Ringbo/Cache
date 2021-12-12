diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchdmfolderdocumentdeletesitetypeprivate/SOUs_AddDMFolderSiteTypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchdmfolderdocumentdeletesitetypeprivate/SOUs_AddDMFolderSiteTypePrivateTest.java
index 690ff27..d84b9db 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchdmfolderdocumentdeletesitetypeprivate/SOUs_AddDMFolderSiteTypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/searchdmfolderdocumentdeletesitetypeprivate/SOUs_AddDMFolderSiteTypePrivateTest.java
@@ -30,7 +30,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Private"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
@@ -42,7 +42,7 @@
 		selenium.clickAt("//nav/ul/li[contains(.,'Documents')]/a/span",
 			RuntimeVariables.replace("Documents"));
 		selenium.waitForPageToLoad("30000");
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Add"),
 			selenium.getText("//span[@title='Add']/ul/li/strong/a/span"));
 		selenium.clickAt("//span[@title='Add']/ul/li/strong/a/span",
