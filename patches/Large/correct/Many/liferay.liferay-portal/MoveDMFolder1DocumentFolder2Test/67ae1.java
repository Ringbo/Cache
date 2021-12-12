diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/mydocuments/dmdocument/movedmfolder1documentfolder2/MoveDMFolder1DocumentFolder2Test.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/mydocuments/dmdocument/movedmfolder1documentfolder2/MoveDMFolder1DocumentFolder2Test.java
index c014e3a..1fccacf 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/mydocuments/dmdocument/movedmfolder1documentfolder2/MoveDMFolder1DocumentFolder2Test.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/mydocuments/dmdocument/movedmfolder1documentfolder2/MoveDMFolder1DocumentFolder2Test.java
@@ -62,7 +62,7 @@
 			selenium.getText("//a[@id='_20_folderName']"));
 		selenium.clickAt("//input[@value='Select']",
 			RuntimeVariables.replace("Select"));
-		Thread.sleep(1000);
+		Thread.sleep(5000);
 		selenium.selectWindow("title=Documents and Media");
 		selenium.waitForVisible("xPath=(//input[@value='Choose'])[2]");
 		selenium.click("xPath=(//input[@value='Choose'])[2]");
