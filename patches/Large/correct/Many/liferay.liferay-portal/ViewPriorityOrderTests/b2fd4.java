diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/viewpriorityorder/ViewPriorityOrderTests.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/viewpriorityorder/ViewPriorityOrderTests.java
index bcd7388..f29f6f9 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/viewpriorityorder/ViewPriorityOrderTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/announcementsentry/viewpriorityorder/ViewPriorityOrderTests.java
@@ -27,7 +27,7 @@
 	public static Test suite() {
 		TestSuite testSuite = new TestSuite();
 
-		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeTest.class);
+		testSuite.addTestSuite(SelectTimeZonePacificStandardTimeCPMATest.class);
 		testSuite.addTestSuite(AddPageAnnouncementsTest.class);
 		testSuite.addTestSuite(AddPortletAnnouncementsTest.class);
 		testSuite.addTestSuite(
