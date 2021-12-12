diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs2_UnfollowCCUserTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs2_UnfollowCCUserTest.java
index f965580..5abb224 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs2_UnfollowCCUserTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/activities/dashboardactivity/viewdashboardactivityactivities/SOUs2_UnfollowCCUserTest.java
@@ -42,7 +42,7 @@
 			selenium.getText("//div[contains(@class, 'lfr-contact-name')]/a"));
 		assertEquals(RuntimeVariables.replace("test@liferay.com"),
 			selenium.getText("//div[contains(@class, 'lfr-contact-extra')]"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		selenium.clickAt("//div[contains(@class, 'lfr-contact-name')]/a",
 			RuntimeVariables.replace("Bloggs, Joe"));
 		selenium.waitForVisible("//div[contains(@class, 'contacts-profile')]");
