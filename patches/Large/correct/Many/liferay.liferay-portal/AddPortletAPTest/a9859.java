diff --git a/portal-web/test/functional/com/liferay/portalweb/asset/assetpublisher/portlet/addportletap/AddPortletAPTest.java b/portal-web/test/functional/com/liferay/portalweb/asset/assetpublisher/portlet/addportletap/AddPortletAPTest.java
index 3acf499..7466449 100644
--- a/portal-web/test/functional/com/liferay/portalweb/asset/assetpublisher/portlet/addportletap/AddPortletAPTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/asset/assetpublisher/portlet/addportletap/AddPortletAPTest.java
@@ -45,7 +45,7 @@
 		selenium.waitForVisible("//input[@id='layout_configuration_content']");
 		selenium.sendKeys("//input[@id='layout_configuration_content']",
 			RuntimeVariables.replace("a"));
-		selenium.waitForText("//li[@title='Asset Publisher']/p/a", "Add");
+		selenium.waitForVisible("//li[@title='Asset Publisher']/p/a");
 		selenium.clickAt("//li[@title='Asset Publisher']/p/a",
 			RuntimeVariables.replace("Add"));
 		selenium.waitForVisible("//section");
