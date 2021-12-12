diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/documents/dmdocument/movedmfolder1documentfolder2site/MoveDMFolder1DocumentFolder2SiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/documents/dmdocument/movedmfolder1documentfolder2site/MoveDMFolder1DocumentFolder2SiteTest.java
index 72ad9ae..5a5eb41 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/documents/dmdocument/movedmfolder1documentfolder2site/MoveDMFolder1DocumentFolder2SiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/documents/dmdocument/movedmfolder1documentfolder2site/MoveDMFolder1DocumentFolder2SiteTest.java
@@ -75,7 +75,7 @@
 			selenium.getText("//a[@id='_20_folderName']"));
 		selenium.clickAt("//input[@value='Select']",
 			RuntimeVariables.replace("Select"));
-		Thread.sleep(1000);
+		Thread.sleep(5000);
 		selenium.selectWindow("title=Documents and Media");
 		selenium.waitForVisible("xPath=(//input[@value='Choose'])[2]");
 		selenium.click("xPath=(//input[@value='Choose'])[2]");
