diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/editannouncementsentrygeneral/EditAnnouncementsEntryGeneralTests.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/editannouncementsentrygeneral/EditAnnouncementsEntryGeneralTests.java
index 6d994b4..2da915d 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/editannouncementsentrygeneral/EditAnnouncementsEntryGeneralTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/editannouncementsentrygeneral/EditAnnouncementsEntryGeneralTests.java
@@ -27,7 +27,7 @@
 	public static Test suite() {
 		TestSuite testSuite = new TestSuite();
 
-		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeTest.class);
+		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeCPMATest.class);
 		testSuite.addTestSuite(AddPageAnnouncementsTest.class);
 		testSuite.addTestSuite(AddPortletAnnouncementsTest.class);
 		testSuite.addTestSuite(AddAnnouncementsEntryGeneralTest.class);
