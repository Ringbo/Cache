diff --git a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/interop/LLVMInteropTest.java b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/interop/LLVMInteropTest.java
index d643b0e..fae31a9 100644
--- a/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/interop/LLVMInteropTest.java
+++ b/projects/com.oracle.truffle.llvm.test/src/com/oracle/truffle/llvm/test/interop/LLVMInteropTest.java
@@ -1047,7 +1047,7 @@
         @Resolve(message = "READ")
         abstract static class ReadNode extends Node {
             int access(ForeignObject object, Object key) {
-                Assert.assertEquals(0, key);
+                Assert.assertEquals(0L, key);
                 return object.foo;
             }
         }
@@ -1055,7 +1055,7 @@
         @Resolve(message = "WRITE")
         abstract static class WriteNode extends Node {
             int access(ForeignObject object, Object key, int value) {
-                Assert.assertEquals(0, key);
+                Assert.assertEquals(0L, key);
                 return object.foo = value * 2;
             }
         }
