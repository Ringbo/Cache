diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousaddannouncementsentrysitesite/SOUs_AddAnnouncementsEntrySiteSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousaddannouncementsentrysitesite/SOUs_AddAnnouncementsEntrySiteSiteTest.java
index 441e3b9..7be381e 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousaddannouncementsentrysitesite/SOUs_AddAnnouncementsEntrySiteSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousaddannouncementsentrysitesite/SOUs_AddAnnouncementsEntrySiteSiteTest.java
@@ -31,7 +31,7 @@
 		assertTrue(selenium.isVisible("//input[@class='search-input']"));
 		selenium.type("//input[@class='search-input']",
 			RuntimeVariables.replace("Open"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
