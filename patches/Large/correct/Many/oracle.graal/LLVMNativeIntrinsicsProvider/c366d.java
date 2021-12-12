diff --git a/projects/com.oracle.truffle.llvm.parser.factories/src/com/oracle/truffle/llvm/parser/factories/LLVMNativeIntrinsicsProvider.java b/projects/com.oracle.truffle.llvm.parser.factories/src/com/oracle/truffle/llvm/parser/factories/LLVMNativeIntrinsicsProvider.java
index 89eb0a6..52e78dc 100644
--- a/projects/com.oracle.truffle.llvm.parser.factories/src/com/oracle/truffle/llvm/parser/factories/LLVMNativeIntrinsicsProvider.java
+++ b/projects/com.oracle.truffle.llvm.parser.factories/src/com/oracle/truffle/llvm/parser/factories/LLVMNativeIntrinsicsProvider.java
@@ -895,7 +895,7 @@
 
             @Override
             protected RootCallTarget generate(FunctionType type) {
-                return wrap("@pow", LLVMPowNodeGen.create(LLVMArgNodeGen.create(1), LLVMArgNodeGen.create(1), null));
+                return wrap("@pow", LLVMPowNodeGen.create(LLVMArgNodeGen.create(1), LLVMArgNodeGen.create(2), null));
             }
         });
         factories.put("@exp", new LLVMNativeIntrinsicFactory(true, false) {
