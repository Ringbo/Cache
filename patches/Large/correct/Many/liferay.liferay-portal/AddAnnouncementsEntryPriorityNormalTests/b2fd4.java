diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentryprioritynormal/AddAnnouncementsEntryPriorityNormalTests.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentryprioritynormal/AddAnnouncementsEntryPriorityNormalTests.java
index 42848c9..d89e70a 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentryprioritynormal/AddAnnouncementsEntryPriorityNormalTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/addannouncementsentryprioritynormal/AddAnnouncementsEntryPriorityNormalTests.java
@@ -27,7 +27,7 @@
 	public static Test suite() {
 		TestSuite testSuite = new TestSuite();
 
-		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeTest.class);
+		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeCPMATest.class);
 		testSuite.addTestSuite(AddPageAnnouncementsTest.class);
 		testSuite.addTestSuite(AddPortletAnnouncementsTest.class);
 		testSuite.addTestSuite(AddAnnouncementsEntryPriorityNormalTest.class);
