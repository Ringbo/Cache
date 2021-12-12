diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SelectDocumentUploaderRoleSOUserTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SelectDocumentUploaderRoleSOUserTest.java
index 8a7d699..4c26831 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SelectDocumentUploaderRoleSOUserTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privaterestrictedsite/searchdocumentdeletesiteprivaterestrict/SelectDocumentUploaderRoleSOUserTest.java
@@ -85,7 +85,7 @@
 					selenium.getText("//div[6]/span[2]/a/span"));
 				selenium.clickAt("//div[6]/span[2]/a/span",
 					RuntimeVariables.replace("Select"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				selenium.selectWindow("title=Users and Organizations");
 				selenium.waitForText("//h1[@class='header-title']/span",
 					"Site Roles");
