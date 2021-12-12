diff --git a/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java b/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
index c570c89..8e78157 100644
--- a/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
+++ b/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
@@ -219,7 +219,7 @@
   private void doHighlightingTest(final Class<? extends PyInspection> inspectionClass) {
     myFixture.configureByFile("inspections/" + getTestName(false) + "/test.py");
     myFixture.enableInspections(inspectionClass);
-    myFixture.checkHighlighting(true, false, false);
+    myFixture.checkHighlighting(true, false, true);
   }
 
   private void doHighlightingTest(final Class<? extends PyInspection> inspectionClass, final LanguageLevel languageLevel) {
