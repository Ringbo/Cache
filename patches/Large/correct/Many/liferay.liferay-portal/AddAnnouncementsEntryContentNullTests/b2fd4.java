diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrycontentnull/AddAnnouncementsEntryContentNullTests.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrycontentnull/AddAnnouncementsEntryContentNullTests.java
index 428ae90..82b0f42 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrycontentnull/AddAnnouncementsEntryContentNullTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrycontentnull/AddAnnouncementsEntryContentNullTests.java
@@ -27,7 +27,7 @@
 	public static Test suite() {
 		TestSuite testSuite = new TestSuite();
 
-		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeTest.class);
+		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeCPMATest.class);
 		testSuite.addTestSuite(AddPageAnnouncementsTest.class);
 		testSuite.addTestSuite(AddPortletAnnouncementsTest.class);
 		testSuite.addTestSuite(AddAnnouncementsEntryContentNullTest.class);
