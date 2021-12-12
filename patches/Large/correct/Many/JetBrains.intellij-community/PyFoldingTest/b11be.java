diff --git a/python/testSrc/com/jetbrains/python/PyFoldingTest.java b/python/testSrc/com/jetbrains/python/PyFoldingTest.java
index 3bb3678..3d58fe9 100644
--- a/python/testSrc/com/jetbrains/python/PyFoldingTest.java
+++ b/python/testSrc/com/jetbrains/python/PyFoldingTest.java
@@ -7,7 +7,7 @@
  */
 public class PyFoldingTest extends PyLightFixtureTestCase {
   private void doTest() {
-    myFixture.testFolding(getTestDataPath() + "/folding/" + getTestName(false) + ".py");
+    myFixture.testFolding(getTestDataPath() + "/folding/" + getTestName(true) + ".py");
   }
 
   public void testClassTrailingSpace() {  // PY-2544
