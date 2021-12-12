diff --git a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/TestGCCSuite.java b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/TestGCCSuite.java
index 1de06c5..9b32e52 100644
--- a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/TestGCCSuite.java
+++ b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/TestGCCSuite.java
@@ -46,7 +46,7 @@
 @RunWith(Parameterized.class)
 public class TestGCCSuite extends TestSuiteBase {
 
-    private static final int UNSIGNED_BYTE_MAX_VALUE = 256;
+    private static final int UNSIGNED_BYTE_MAX_VALUE = 0xff;
     private TestCaseFiles tuple;
     private File byteCodeFile;
 
@@ -93,7 +93,7 @@
     }
 
     private static int truncate(int retValue) {
-        return retValue & (UNSIGNED_BYTE_MAX_VALUE - 1);
+        return retValue & UNSIGNED_BYTE_MAX_VALUE;
     }
 
 }
