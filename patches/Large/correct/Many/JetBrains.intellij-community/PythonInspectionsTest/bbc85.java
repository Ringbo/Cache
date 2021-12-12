diff --git a/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java b/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
index 04e875d..3d453c1 100644
--- a/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
+++ b/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
@@ -131,7 +131,7 @@
 
   public void testPyUnboundLocalVariableInspection() {
     LocalInspectionTool inspection = new PyUnboundLocalVariableInspection();
-    doTest(getTestName(false), inspection);
+    doTestWithLanguageLevel(getTestName(false), inspection, LanguageLevel.PYTHON27);
   }
 
   public void testPyUnboundLocalVariableInspectionPy3k() {
