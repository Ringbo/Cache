diff --git a/python/testSrc/com/jetbrains/python/PythonCompletionTest.java b/python/testSrc/com/jetbrains/python/PythonCompletionTest.java
index 035a674..182fc08 100644
--- a/python/testSrc/com/jetbrains/python/PythonCompletionTest.java
+++ b/python/testSrc/com/jetbrains/python/PythonCompletionTest.java
@@ -11,7 +11,7 @@
 public class PythonCompletionTest extends LightCodeInsightTestCase{
 
   private void doTest() throws Exception {
-    final String testName = getTestName(false);
+    final String testName = getTestName(true);
     configureByFile(testName + ".py");
     new CodeCompletionHandler().invoke(getProject(), getEditor(), getFile());
     checkResultByFile(testName + ".after.py");
