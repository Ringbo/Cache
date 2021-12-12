diff --git a/portal-web/test/functional/com/liferay/portalweb/socialoffice/setup/SelectRegularRolesSOAdminTest.java b/portal-web/test/functional/com/liferay/portalweb/socialoffice/setup/SelectRegularRolesSOAdminTest.java
index be01384..e222c47 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialoffice/setup/SelectRegularRolesSOAdminTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialoffice/setup/SelectRegularRolesSOAdminTest.java
@@ -86,7 +86,7 @@
 					selenium.getText("//div[6]/span/a/span"));
 				selenium.clickAt("//div[6]/span/a/span",
 					RuntimeVariables.replace("Select"));
-				Thread.sleep(1000);
+				Thread.sleep(5000);
 				selenium.selectWindow("title=Users and Organizations");
 				selenium.waitForText("//h1[@class='header-title']/span", "Roles");
 				assertEquals(RuntimeVariables.replace("Roles"),
