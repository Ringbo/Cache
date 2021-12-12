diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs1_RemoveAsConnectionCCUserTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs1_RemoveAsConnectionCCUserTest.java
index edd51c5..7734a05 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs1_RemoveAsConnectionCCUserTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs1_RemoveAsConnectionCCUserTest.java
@@ -40,7 +40,7 @@
 			selenium.getText("//div[contains(@class, 'lfr-contact-name')]/a"));
 		assertEquals(RuntimeVariables.replace("test@liferay.com"),
 			selenium.getText("//div[contains(@class, 'lfr-contact-extra')]"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.clickAt("//div[contains(@class, 'lfr-contact-name')]/a",
 			RuntimeVariables.replace("Bloggs, Joe"));
 		selenium.waitForVisible("//div[contains(@class, 'contacts-profile')]");
@@ -61,7 +61,7 @@
 		assertEquals(RuntimeVariables.replace(
 				"You are not connected to this user anymore."),
 			selenium.getText("//span[@class='portlet-msg-success']"));
-		assertEquals(RuntimeVariables.replace("Add Connection"),
+		assertEquals(RuntimeVariables.replace("Connect"),
 			selenium.getText(
 				"//button[@id='_1_WAR_contactsportlet_addConnectionButton']"));
 		assertFalse(selenium.isVisible(
