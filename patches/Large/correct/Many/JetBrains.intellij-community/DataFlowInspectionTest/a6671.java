diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/DataFlowInspectionTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/DataFlowInspectionTest.java
index fd79036..a283eee 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/DataFlowInspectionTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/DataFlowInspectionTest.java
@@ -95,7 +95,7 @@
   public void testCheckEnumConstantConstructor() { doTest(); }
   public void testCompareToEnumConstant() throws Throwable { doTest(); }
   public void testEqualsConstant() throws Throwable { doTest(); }
-  public void testInternedStringConstants() throws Throwable { doTest(); }
+  public void testInternedStringConstants() { doTest(); }
   public void testDontSaveTypeValue() { doTest(); }
   public void testFinalLoopVariableInstanceof() throws Throwable { doTest(); }
   public void testGreaterIsNotEquals() throws Throwable { doTest(); }
