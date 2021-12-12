diff --git a/portal-web/test/functional/com/liferay/portalweb/portlet/language/LanguageTests.java b/portal-web/test/functional/com/liferay/portalweb/portlet/language/LanguageTests.java
index 10c847c..154d891 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portlet/language/LanguageTests.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portlet/language/LanguageTests.java
@@ -28,7 +28,7 @@
 		TestSuite testSuite = new TestSuite();
 		testSuite.addTestSuite(AddPageLanguageTest.class);
 		testSuite.addTestSuite(AddPortletLanguageTest.class);
-		testSuite.addTestSuite(LanguageTest.class);
+		testSuite.addTestSuite(ViewLanguageTest.class);
 		testSuite.addTestSuite(InternationalizationJapaneseTest.class);
 		testSuite.addTestSuite(InternationalizationSpanishTest.class);
 		testSuite.addTestSuite(InternationalizationVerifyTest.class);
