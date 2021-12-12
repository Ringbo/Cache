diff --git a/java/java-tests/testSrc/com/intellij/refactoring/MakeClassStaticTest.java b/java/java-tests/testSrc/com/intellij/refactoring/MakeClassStaticTest.java
index e4d8f00..6fd2354 100644
--- a/java/java-tests/testSrc/com/intellij/refactoring/MakeClassStaticTest.java
+++ b/java/java-tests/testSrc/com/intellij/refactoring/MakeClassStaticTest.java
@@ -25,13 +25,13 @@
     return JavaTestUtil.getJavaTestDataPath();
   }
 
-  public void testSimple() throws Exception { perform(); }
+  public void testSimple1() throws Exception { perform(); }
 
-  public void testSimpleWithFields() throws Exception { performWithFields(); }
+  public void testSimpleFields() throws Exception { performWithFields(); }
 
-  public void testFieldInitializerMovedToConstructor() throws Exception { performWithFields(); }
+  public void testFieldInitializerMovedToTheConstructor() throws Exception { performWithFields(); }
 
-  public void testQualifiedThisInSibling() throws Exception { perform(); }
+  public void testQualifiedThis() throws Exception { perform(); }
 
   public void testIDEADEV3247() throws Exception { perform(); }
 
@@ -39,16 +39,16 @@
 
   public void testIDEADEV12762() throws Exception { perform(); }
 
-  public void testNewExpressionQualifications() throws Exception {perform();}
+  public void testNewExpressionQualifier() throws Exception {perform();}
 
   public void testNonDefaultConstructorAnonymousClass() throws Exception {perform();}
   public void testDefaultConstructorAnonymousClass() throws Exception {perform();}
 
-  public void testRegularReference() throws Exception {
+  public void testRegReference() throws Exception {
     perform();
   }
 
-  public void testFieldWithPrefix() throws Exception {
+  public void testFieldWithMyPrefix() throws Exception {
     final CodeStyleSettings settings = CodeStyleSettingsManager.getSettings(getProject());
     String oldPrefix = settings.FIELD_NAME_PREFIX;
     settings.FIELD_NAME_PREFIX = "my";
@@ -61,7 +61,7 @@
   }
 
   private void perform() throws Exception {
-    configureByFile(TEST_ROOT + getTestName(true) + ".java");
+    configureByFile(TEST_ROOT + getTestName(false) + ".java");
     PsiElement element = TargetElementUtilBase.findTargetElement(myEditor, TargetElementUtilBase.ELEMENT_NAME_ACCEPTED);
     assertTrue(element instanceof PsiClass);
     PsiClass aClass = (PsiClass)element;
@@ -72,11 +72,11 @@
             getProject(),
             aClass,
             new Settings(true, addClassParameter ? "anObject" : null, null)).run();
-    checkResultByFile(TEST_ROOT + getTestName(true) + "_after.java");
+    checkResultByFile(TEST_ROOT + getTestName(false) + "_after.java");
   }
 
   private void performWithFields() throws Exception {
-    configureByFile(TEST_ROOT + getTestName(true) + ".java");
+    configureByFile(TEST_ROOT + getTestName(false) + ".java");
     PsiElement element = TargetElementUtilBase.findTargetElement(myEditor, TargetElementUtilBase.ELEMENT_NAME_ACCEPTED);
     assertTrue(element instanceof PsiClass);
     PsiClass aClass = (PsiClass)element;
@@ -89,6 +89,6 @@
             new Settings(true, addClassParameter ? "anObject" : null,
                          parametersForFields.toArray(
                            new ParameterTablePanel.VariableData[parametersForFields.size()]))).run();
-    checkResultByFile(TEST_ROOT + getTestName(true) + "_after.java");
+    checkResultByFile(TEST_ROOT + getTestName(false) + "_after.java");
   }
 }
