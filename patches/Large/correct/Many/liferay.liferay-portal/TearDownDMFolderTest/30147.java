diff --git a/portal-web/test/functional/com/liferay/portalweb/portlet/documentsandmedia/dmfolder/adddmfolder/TearDownDMFolderTest.java b/portal-web/test/functional/com/liferay/portalweb/portlet/documentsandmedia/dmfolder/adddmfolder/TearDownDMFolderTest.java
index 0423c0a..d0d5048 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portlet/documentsandmedia/dmfolder/adddmfolder/TearDownDMFolderTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portlet/documentsandmedia/dmfolder/adddmfolder/TearDownDMFolderTest.java
@@ -33,11 +33,11 @@
 				selenium.clickAt("link=Documents and Media Test Page",
 					RuntimeVariables.replace("Documents and Media Test Page"));
 				selenium.waitForPageToLoad("30000");
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				selenium.waitForVisible("//button[@title='Icon View']");
 				selenium.clickAt("//button[@title='Icon View']",
 					RuntimeVariables.replace("Icon View"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				selenium.waitForVisible(
 					"//button[contains(@class,'aui-state-active') and @title='Icon View']");
 				assertTrue(selenium.isVisible(
