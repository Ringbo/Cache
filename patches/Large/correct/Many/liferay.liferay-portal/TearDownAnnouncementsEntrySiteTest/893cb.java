diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/addannouncementsentrygeneralsite/TearDownAnnouncementsEntrySiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/addannouncementsentrygeneralsite/TearDownAnnouncementsEntrySiteTest.java
index 2efbd00..37801e1 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/addannouncementsentrygeneralsite/TearDownAnnouncementsEntrySiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/addannouncementsentrygeneralsite/TearDownAnnouncementsEntrySiteTest.java
@@ -35,7 +35,7 @@
 				assertTrue(selenium.isVisible("//input[@class='search-input']"));
 				selenium.type("//input[@class='search-input']",
 					RuntimeVariables.replace("Open"));
-				Thread.sleep(5000);
+				Thread.sleep(1000);
 				assertEquals(RuntimeVariables.replace("Open Site Name"),
 					selenium.getText(
 						"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
