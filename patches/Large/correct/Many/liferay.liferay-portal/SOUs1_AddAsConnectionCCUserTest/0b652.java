diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs1_AddAsConnectionCCUserTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs1_AddAsConnectionCCUserTest.java
index d9e74b7..b30547b 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs1_AddAsConnectionCCUserTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs1_AddAsConnectionCCUserTest.java
@@ -42,7 +42,7 @@
 			selenium.getText("//div[contains(@class, 'lfr-contact-name')]/a"));
 		assertEquals(RuntimeVariables.replace("test@liferay.com"),
 			selenium.getText("//div[contains(@class, 'lfr-contact-extra')]"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.clickAt("//div[contains(@class, 'lfr-contact-name')]/a",
 			RuntimeVariables.replace("Bloggs, Joe"));
 		selenium.waitForVisible("//div[contains(@class, 'contacts-profile')]");
@@ -54,11 +54,11 @@
 				"//div[contains(@class, 'contacts-profile')]/div/div[2]/div[3]"));
 		assertTrue(selenium.isElementNotPresent(
 				"//div[contains(@class, 'contacts-center-home-content')]"));
-		assertEquals(RuntimeVariables.replace("Add Connection"),
+		assertEquals(RuntimeVariables.replace("Connect"),
 			selenium.getText(
 				"//button[@id='_1_WAR_contactsportlet_addConnectionButton']"));
 		selenium.clickAt("//button[@id='_1_WAR_contactsportlet_addConnectionButton']",
-			RuntimeVariables.replace("Add Connection"));
+			RuntimeVariables.replace("Connect"));
 		selenium.waitForVisible("//span[@class='portlet-msg-success']");
 		assertEquals(RuntimeVariables.replace(
 				"This user has received a connection request from you."),
