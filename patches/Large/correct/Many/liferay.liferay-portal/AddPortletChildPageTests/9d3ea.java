diff --git a/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/addportletchildpage/AddPortletChildPageTests.java b/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/addportletchildpage/AddPortletChildPageTests.java
index 1273d0b..811d965 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/addportletchildpage/AddPortletChildPageTests.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/sitemap/portlet/addportletchildpage/AddPortletChildPageTests.java
@@ -29,7 +29,7 @@
 		TestSuite testSuite = new TestSuite();
 		testSuite.addTestSuite(AddPageSMTest.class);
 		testSuite.addTestSuite(AddChildPageTest.class);
-		testSuite.addTestSuite(AddPortletChildPageTest.class);
+		testSuite.addTestSuite(AddPortletSMChildPageTest.class);
 		testSuite.addTestSuite(TearDownPageTest.class);
 
 		return testSuite;
