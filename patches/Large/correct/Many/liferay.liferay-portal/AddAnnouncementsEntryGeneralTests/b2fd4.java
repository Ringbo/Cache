diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrygeneral/AddAnnouncementsEntryGeneralTests.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrygeneral/AddAnnouncementsEntryGeneralTests.java
index 476fdac..4fbcbbd 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrygeneral/AddAnnouncementsEntryGeneralTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrygeneral/AddAnnouncementsEntryGeneralTests.java
@@ -27,7 +27,7 @@
 	public static Test suite() {
 		TestSuite testSuite = new TestSuite();
 
-		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeTest.class);
+		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeCPMATest.class);
 		testSuite.addTestSuite(AddPageAnnouncementsTest.class);
 		testSuite.addTestSuite(AddPortletAnnouncementsTest.class);
 		testSuite.addTestSuite(AddAnnouncementsEntryGeneralTest.class);
