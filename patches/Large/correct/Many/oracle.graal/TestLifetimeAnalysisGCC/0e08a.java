diff --git a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/TestLifetimeAnalysisGCC.java b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/TestLifetimeAnalysisGCC.java
index 518a631..e1ef188 100644
--- a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/TestLifetimeAnalysisGCC.java
+++ b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/TestLifetimeAnalysisGCC.java
@@ -109,7 +109,7 @@
     public static List<TestCaseFiles[]> getTestFiles() throws IOException {
         File configFile = LLVMPaths.GCC_TEST_SUITE_CONFIG;
         File testSuite = LLVMPaths.GCC_TEST_SUITE;
-        List<TestCaseFiles[]> files = getTestCasesFromConfigFile(configFile, testSuite, new TestCaseGeneratorImpl(false));
+        List<TestCaseFiles[]> files = getTestCasesFromConfigFile(configFile, testSuite, new TestCaseGeneratorImpl(false, true));
         return files;
     }
 
