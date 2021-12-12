diff --git a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/RemoteTestSuiteBase.java b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/RemoteTestSuiteBase.java
index f6823ca..76480b1 100644
--- a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/RemoteTestSuiteBase.java
+++ b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/RemoteTestSuiteBase.java
@@ -179,7 +179,7 @@
         try {
             List<String> launchRemote = launchRemote(tuple);
             int sulongRetValue = parseAndRemoveReturnValue(launchRemote);
-            String sulongLines = launchRemote.stream().collect(Collectors.joining());
+            String sulongLines = launchRemote.stream().collect(Collectors.joining("\n"));
             ProcessResult processResult = TestHelper.executeLLVMBinary(tuple.getBitCodeFile());
             String expectedLines = processResult.getStdOutput();
             int expectedReturnValue = processResult.getReturnValue();
