diff --git a/sulong/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMCallNode.java b/sulong/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMCallNode.java
index b39490f..3c8c059 100644
--- a/sulong/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMCallNode.java
+++ b/sulong/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMCallNode.java
@@ -55,7 +55,7 @@
         @CompilationFinal private LLVMFunctionDescriptor builtinDescriptor;
         @Child private LLVMExpressionNode builtin;
 
-        public IntrinsicDispatch(LLVMFunctionDescriptor descriptor, LLVMExpressionNode[] argumentNodes) {
+        IntrinsicDispatch(LLVMFunctionDescriptor descriptor, LLVMExpressionNode[] argumentNodes) {
             this.builtinDescriptor = descriptor;
             this.builtin = descriptor.getNativeIntrinsic().generateNode(argumentNodes);
         }
