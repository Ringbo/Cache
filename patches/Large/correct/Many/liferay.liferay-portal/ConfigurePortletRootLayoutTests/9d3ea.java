diff --git a/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/configureportletrootlayout/ConfigurePortletRootLayoutTests.java b/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/configureportletrootlayout/ConfigurePortletRootLayoutTests.java
index 2aa2ca9..db41614 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/configureportletrootlayout/ConfigurePortletRootLayoutTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/configureportletrootlayout/ConfigurePortletRootLayoutTests.java
@@ -32,7 +32,7 @@
 		testSuite.addTestSuite(AddPageSMTest.class);
 		testSuite.addTestSuite(AddPortletSMTest.class);
 		testSuite.addTestSuite(AddChildPageTest.class);
-		testSuite.addTestSuite(ConfigurePortletRootLayoutTest.class);
+		testSuite.addTestSuite(ConfigurePortletSMRootLayoutTest.class);
 		testSuite.addTestSuite(TearDownPageTest.class);
 
 		return testSuite;
