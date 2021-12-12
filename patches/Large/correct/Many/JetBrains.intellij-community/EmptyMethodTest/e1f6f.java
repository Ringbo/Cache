diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/EmptyMethodTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/EmptyMethodTest.java
index 0474e20..48db4be 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/EmptyMethodTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/EmptyMethodTest.java
@@ -19,18 +19,18 @@
 
   private void doTest(final boolean checkRange) throws Exception {
     final EmptyMethodInspection tool = new EmptyMethodInspection();
-    doTest("emptyMethod/" + getTestName(false), tool, checkRange);
+    doTest("emptyMethod/" + getTestName(true), tool, checkRange);
   }
 
-  public void testsuperCall() throws Exception {
+  public void testSuperCall() throws Exception {
     doTest();
   }
 
-  public void testsuperCallByRange() throws Exception {
+  public void testSuperCallByRange() throws Exception {
     doTest(true);
   }
 
-  public void testexternalOverride() throws Exception {
+  public void testExternalOverride() throws Exception {
     doTest();
   }
 
@@ -42,7 +42,7 @@
     doTest(true);
   }
 
-  public void testsuperFromAnotherPackageCall() throws Exception {
+  public void testSuperFromAnotherPackageCall() throws Exception {
     doTest();
   }
 }
