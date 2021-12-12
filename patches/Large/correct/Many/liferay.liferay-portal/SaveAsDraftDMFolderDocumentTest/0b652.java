diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/mydocuments/dmdocument/saveasdraftdmfolderdocument/SaveAsDraftDMFolderDocumentTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/mydocuments/dmdocument/saveasdraftdmfolderdocument/SaveAsDraftDMFolderDocumentTest.java
index f0ad0ac..313b765 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/mydocuments/dmdocument/saveasdraftdmfolderdocument/SaveAsDraftDMFolderDocumentTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/mydocuments/dmdocument/saveasdraftdmfolderdocument/SaveAsDraftDMFolderDocumentTest.java
@@ -39,7 +39,7 @@
 			"DM Folder Name");
 		assertEquals(RuntimeVariables.replace("DM Folder Name"),
 			selenium.getText("//li[@class='folder selected']/a"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Add"),
 			selenium.getText("//span[@title='Add']/ul/li/strong/a/span"));
 		selenium.clickAt("//span[@title='Add']/ul/li/strong/a/span",
