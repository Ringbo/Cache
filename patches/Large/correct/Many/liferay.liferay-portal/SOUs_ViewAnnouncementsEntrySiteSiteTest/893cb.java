diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousviewannouncementsentrysitesite/SOUs_ViewAnnouncementsEntrySiteSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousviewannouncementsentrysitesite/SOUs_ViewAnnouncementsEntrySiteSiteTest.java
index 5f7d55a..4d6ccfd 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousviewannouncementsentrysitesite/SOUs_ViewAnnouncementsEntrySiteSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousviewannouncementsentrysitesite/SOUs_ViewAnnouncementsEntrySiteSiteTest.java
@@ -31,7 +31,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
