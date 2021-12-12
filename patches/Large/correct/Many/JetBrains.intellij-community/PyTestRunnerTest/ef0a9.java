diff --git a/python/testSrc/com/jetbrains/python/testRunner/PyTestRunnerTest.java b/python/testSrc/com/jetbrains/python/testRunner/PyTestRunnerTest.java
index 45be982..9090f14 100644
--- a/python/testSrc/com/jetbrains/python/testRunner/PyTestRunnerTest.java
+++ b/python/testSrc/com/jetbrains/python/testRunner/PyTestRunnerTest.java
@@ -25,14 +25,14 @@
   }
 
   public void testEmptySuite() throws ExecutionException {
-    String[] result = runUTRunner(PathManager.getHomePath());
+    String[] result = runUTRunner(PathManager.getHomePath(), "true");
     assertEquals("##teamcity[testCount count='0']", result [0]);
   }
 
   public void testFile() throws ExecutionException {
     final File testDir = getTestDataDir();
     File testFile = new File(testDir, "unittest1.py");
-    String[] result = runUTRunner(testDir.getPath(), testFile.getPath());
+    String[] result = runUTRunner(testDir.getPath(), testFile.getPath(), "true");
     assertEquals(StringUtil.join(result, "\n"), 10, result.length);
     assertEquals("##teamcity[testCount count='2']", result [0]);
     assertEquals("##teamcity[testSuiteStarted locationHint='python_uttestid://unittest1.BadTest' name='unittest1.BadTest']", result [1]);
@@ -47,26 +47,26 @@
   public void testClass() throws ExecutionException {
     final File testDir = getTestDataDir();
     File testFile = new File(testDir, "unittest1.py");
-    String[] result = runUTRunner(testDir.getPath(), testFile.getPath() + "::GoodTest");
+    String[] result = runUTRunner(testDir.getPath(), testFile.getPath() + "::GoodTest", "true");
     assertEquals(StringUtil.join(result, "\n"), 5, result.length);
   }
 
   public void testMethod() throws ExecutionException {
     final File testDir = getTestDataDir();
     File testFile = new File(testDir, "unittest1.py");
-    String[] result = runUTRunner(testDir.getPath(), testFile.getPath() + "::GoodTest::test_passes");
+    String[] result = runUTRunner(testDir.getPath(), testFile.getPath() + "::GoodTest::test_passes", "true");
     assertEquals(StringUtil.join(result, "\n"), 5, result.length);
   }
 
   public void testFolder() throws ExecutionException {
     final File testDir = getTestDataDir();
-    String[] result = runUTRunner(testDir.getPath(), testDir.getPath() + "/");
+    String[] result = runUTRunner(testDir.getPath(), testDir.getPath() + "/", "true");
     assertEquals(StringUtil.join(result, "\n"), 14, result.length);
   }
 
   public void testDependent() throws ExecutionException {
     final File testDir = new File(PythonTestUtil.getTestDataPath(), "testRunner");
-    String[] result = runUTRunner(testDir.getPath(), new File(testDir, "dependentTests/my_class_test.py").getPath());
+    String[] result = runUTRunner(testDir.getPath(), new File(testDir, "dependentTests/my_class_test.py").getPath(), "true");
     assertEquals(StringUtil.join(result, "\n"), 5, result.length);
   }
 
