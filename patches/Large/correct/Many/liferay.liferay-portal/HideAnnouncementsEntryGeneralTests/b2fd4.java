diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/hideannouncementsentrygeneral/HideAnnouncementsEntryGeneralTests.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/hideannouncementsentrygeneral/HideAnnouncementsEntryGeneralTests.java
index c35d8ab..16c14c5 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/hideannouncementsentrygeneral/HideAnnouncementsEntryGeneralTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/hideannouncementsentrygeneral/HideAnnouncementsEntryGeneralTests.java
@@ -27,7 +27,7 @@
 	public static Test suite() {
 		TestSuite testSuite = new TestSuite();
 
-		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeTest.class);
+		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeCPMATest.class);
 		testSuite.addTestSuite(AddPageAnnouncementsTest.class);
 		testSuite.addTestSuite(AddPortletAnnouncementsTest.class);
 		testSuite.addTestSuite(AddAnnouncementsEntryGeneralTest.class);
