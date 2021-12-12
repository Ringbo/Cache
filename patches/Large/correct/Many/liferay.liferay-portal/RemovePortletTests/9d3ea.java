diff --git a/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/removeportlet/RemovePortletTests.java b/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/removeportlet/RemovePortletTests.java
index b0de286..f7f55fa 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/removeportlet/RemovePortletTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/removeportlet/RemovePortletTests.java
@@ -30,7 +30,7 @@
 		TestSuite testSuite = new TestSuite();
 		testSuite.addTestSuite(AddPageSMTest.class);
 		testSuite.addTestSuite(AddPortletSMTest.class);
-		testSuite.addTestSuite(RemovePortletTest.class);
+		testSuite.addTestSuite(RemovePortletSMTest.class);
 		testSuite.addTestSuite(TearDownPageTest.class);
 
 		return testSuite;
