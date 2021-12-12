diff --git a/java/java-tests/testSrc/com/intellij/java/refactoring/PushDownTest.java b/java/java-tests/testSrc/com/intellij/java/refactoring/PushDownTest.java
index 494e5e6..7f4bfac 100644
--- a/java/java-tests/testSrc/com/intellij/java/refactoring/PushDownTest.java
+++ b/java/java-tests/testSrc/com/intellij/java/refactoring/PushDownTest.java
@@ -67,7 +67,7 @@
   public void testFunctionalExpression() { doTest(true);}
   public void testFunctionalInterface() { doTest(true);}
   public void testFunctionalExpressionDefaultMethod() { doTest();}
-  public void testInlineSuperMethodCall() { BaseRefactoringProcessor.ConflictsInTestsException.withIgnoredConflicts(() -> doTest(true));}
+  public void testInlineSuperMethodCall() { BaseRefactoringProcessor.ConflictsInTestsException.withIgnoredConflicts(() -> doTest());}
   public void testRenameTypeParametersToAvoidHiding() { doTest();}
   public void testNoRenameTypeParametersToAvoidHidingForStatic() { doTest();}
 
