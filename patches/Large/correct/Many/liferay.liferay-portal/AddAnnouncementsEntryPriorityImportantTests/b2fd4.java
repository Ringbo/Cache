diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrypriorityimportant/AddAnnouncementsEntryPriorityImportantTests.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrypriorityimportant/AddAnnouncementsEntryPriorityImportantTests.java
index a8e1627..ea59ced 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrypriorityimportant/AddAnnouncementsEntryPriorityImportantTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentrypriorityimportant/AddAnnouncementsEntryPriorityImportantTests.java
@@ -27,7 +27,7 @@
 	public static Test suite() {
 		TestSuite testSuite = new TestSuite();
 
-		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeTest.class);
+		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeCPMATest.class);
 		testSuite.addTestSuite(AddPageAnnouncementsTest.class);
 		testSuite.addTestSuite(AddPortletAnnouncementsTest.class);
 		testSuite.addTestSuite(
