diff --git a/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java b/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
index 70a5e10..3486391 100644
--- a/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
+++ b/python/testSrc/com/jetbrains/python/PythonInspectionsTest.java
@@ -11,7 +11,7 @@
  * @author yole
  */
 public class PythonInspectionsTest extends PyLightFixtureTestCase {
-  public void testReturnValueFromInit() throws Throwable {
+  public void testReturnValueFromInit() {
     LocalInspectionTool inspection = new PyReturnFromInitInspection();
     doTest(getTestName(true), inspection);
   }
@@ -41,47 +41,47 @@
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyUnreachableCodeInspection() throws Throwable {
+  public void testPyUnreachableCodeInspection() {
     LocalInspectionTool inspection = new PyUnreachableCodeInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyUnresolvedReferencesInspection() throws Throwable {
+  public void testPyUnresolvedReferencesInspection() {
     LocalInspectionTool inspection = new PyUnresolvedReferencesInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyArgumentListInspection() throws Throwable {
+  public void testPyArgumentListInspection() {
     LocalInspectionTool inspection = new PyArgumentListInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyMethodParametersInspection() throws Throwable {
+  public void testPyMethodParametersInspection() {
     LocalInspectionTool inspection = new PyMethodParametersInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyArgumentListInspection3K() throws Throwable {
+  public void testPyArgumentListInspection3K() {
     LocalInspectionTool inspection = new PyArgumentListInspection();
     doTestWithPy3k(getTestName(false), inspection);
   }
 
-  public void testPyRedeclarationInspection() throws Throwable {
+  public void testPyRedeclarationInspection() {
     LocalInspectionTool inspection = new PyRedeclarationInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyStringFormatInspection() throws Throwable {
+  public void testPyStringFormatInspection() {
     LocalInspectionTool inspection = new PyStringFormatInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyMethodOverridingInspection() throws Throwable {
+  public void testPyMethodOverridingInspection() {
     LocalInspectionTool inspection = new PyMethodOverridingInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyTrailingSemicolonInspection() throws Throwable {
+  public void testPyTrailingSemicolonInspection() {
     LocalInspectionTool inspection = new PyTrailingSemicolonInspection();
     doTest(getTestName(false), inspection);
   }
@@ -101,11 +101,11 @@
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyDictCreationInspection() throws Throwable {
+  public void testPyDictCreationInspection() {
     doHighlightingTest(PyDictCreationInspection.class);
   }
 
-  public void testPyDeprecatedModulesInspection() throws Throwable {
+  public void testPyDeprecatedModulesInspection() {
     PythonLanguageLevelPusher.setForcedLanguageLevel(myFixture.getProject(), LanguageLevel.PYTHON25);
     try {
       LocalInspectionTool inspection = new PyDeprecatedModulesInspection();
@@ -116,22 +116,22 @@
     }
   }
 
-  public void testPyTupleAssignmentBalanceInspection() throws Throwable {
+  public void testPyTupleAssignmentBalanceInspection() {
     LocalInspectionTool inspection = new PyTupleAssignmentBalanceInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyTupleAssignmentBalanceInspection2() throws Throwable {
+  public void testPyTupleAssignmentBalanceInspection2() {
     LocalInspectionTool inspection = new PyTupleAssignmentBalanceInspection();
     doTestWithPy3k(getTestName(false), inspection);
   }
 
-  public void testPyClassicStyleClassInspection() throws Throwable {
+  public void testPyClassicStyleClassInspection() {
     LocalInspectionTool inspection = new PyClassicStyleClassInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyExceptClausesOrderInspection() throws Throwable {
+  public void testPyExceptClausesOrderInspection() {
     PythonLanguageLevelPusher.setForcedLanguageLevel(myFixture.getProject(), LanguageLevel.PYTHON26);
     try {
       myFixture.configureByFile("inspections/" + getTestName(false) + "/test.py");
@@ -143,37 +143,37 @@
     }
   }
 
-  public void testPyExceptionInheritInspection() throws Throwable {
+  public void testPyExceptionInheritInspection() {
     LocalInspectionTool inspection = new PyExceptionInheritInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyDefaultArgumentInspection() throws Throwable {
+  public void testPyDefaultArgumentInspection() {
     LocalInspectionTool inspection = new PyDefaultArgumentInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyRaisingNewStyleClassInspection() throws Throwable {
+  public void testPyRaisingNewStyleClassInspection() {
     LocalInspectionTool inspection = new PyRaisingNewStyleClassInspection();
     doTestWithLanguageLevel(getTestName(false), inspection, LanguageLevel.PYTHON24);
   }
 
-  public void testPyUnboundLocalVariableInspection() throws Throwable {
+  public void testPyUnboundLocalVariableInspection() {
     LocalInspectionTool inspection = new PyUnboundLocalVariableInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyUnboundLocalVariableInspectionPy3k() throws Throwable {
+  public void testPyUnboundLocalVariableInspectionPy3k() {
     LocalInspectionTool inspection = new PyUnboundLocalVariableInspection();
     doTestWithPy3k(getTestName(false), inspection);
   }
 
-  public void testPyDocstringInspection() throws Throwable {
+  public void testPyDocstringInspection() {
     LocalInspectionTool inspection = new PyDocstringInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyStatementEffectInspection() throws Throwable {
+  public void testPyStatementEffectInspection() {
     LocalInspectionTool inspection = new PyStatementEffectInspection();
     doTest(getTestName(false), inspection);
   }
@@ -188,33 +188,33 @@
     myFixture.checkHighlighting(true, false, false);
   }
 
-  public void testPyFromFutureImportInspectionDocString() throws Throwable {
+  public void testPyFromFutureImportInspectionDocString() {
     myFixture.configureByFile("inspections/PyFromFutureImportInspection/module_docstring.py");
     myFixture.enableInspections(PyFromFutureImportInspection.class);
     myFixture.checkHighlighting(true, false, false);
   }
 
-  public void testPyComparisonWithNoneInspection() throws Throwable {
+  public void testPyComparisonWithNoneInspection() {
     LocalInspectionTool inspection = new PyComparisonWithNoneInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyStringExceptionInspection() throws Throwable {
+  public void testPyStringExceptionInspection() {
     LocalInspectionTool inspection = new PyStringExceptionInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPySuperArgumentsInspection() throws Throwable {
+  public void testPySuperArgumentsInspection() {
     LocalInspectionTool inspection = new PySuperArgumentsInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyByteLiteralInspection() throws Throwable {
+  public void testPyByteLiteralInspection() {
     LocalInspectionTool inspection = new PyByteLiteralInspection();
     doTest(getTestName(false), inspection);
   }
 
-  public void testPyTupleItemAssignmentInspection() throws Throwable {
+  public void testPyTupleItemAssignmentInspection() {
     LocalInspectionTool inspection = new PyTupleItemAssignmentInspection();
     doTest(getTestName(false), inspection);
   }
@@ -234,15 +234,15 @@
     myFixture.checkHighlighting(true, false, false);
   }
 
-  public void testPyPropertyAccessInspection() throws Throwable {
+  public void testPyPropertyAccessInspection() {
     doTestWithLanguageLevel(getTestName(false), new PyPropertyAccessInspection(), LanguageLevel.PYTHON26);
   }
 
-  public void testPyPropertyDefinitionInspection25() throws Throwable {
+  public void testPyPropertyDefinitionInspection25() {
     doTestWithLanguageLevel(getTestName(false), new PyPropertyDefinitionInspection(), LanguageLevel.PYTHON25);
   }
 
-  public void testPyPropertyDefinitionInspection26() throws Throwable {
+  public void testPyPropertyDefinitionInspection26() {
     doTestWithLanguageLevel(getTestName(false), new PyPropertyDefinitionInspection(), LanguageLevel.PYTHON26);
   }
 }
