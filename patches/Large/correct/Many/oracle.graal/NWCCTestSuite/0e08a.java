diff --git a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/NWCCTestSuite.java b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/NWCCTestSuite.java
index 819cdf6..5ed44b4 100644
--- a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/NWCCTestSuite.java
+++ b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/NWCCTestSuite.java
@@ -58,7 +58,7 @@
     public static List<TestCaseFiles[]> getTestFiles() throws IOException, AssertionError {
         File configFile = LLVMPaths.NWCC_TEST_SUITE_CONFIG;
         File testSuite = LLVMPaths.NWCC_TEST_SUITE;
-        return getTestCasesFromConfigFile(configFile, testSuite, new TestCaseGeneratorImpl(true));
+        return getTestCasesFromConfigFile(configFile, testSuite, new TestCaseGeneratorImpl(true, true));
     }
 
     @Test
