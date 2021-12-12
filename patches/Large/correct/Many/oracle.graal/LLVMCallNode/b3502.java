diff --git a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMCallNode.java b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMCallNode.java
index 3ce99d3..7c5b465 100644
--- a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMCallNode.java
+++ b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMCallNode.java
@@ -224,7 +224,7 @@
 
         @Override
         public Object executeGeneric(VirtualFrame frame) {
-            return callNode.call(frame, evaluateArgs(frame));
+            return callNode.call(evaluateArgs(frame));
         }
 
     }
@@ -408,17 +408,17 @@
         }
 
         @Specialization(limit = "INLINE_CACHE_SIZE", guards = "function.getFunctionIndex() == cachedFunction.getFunctionIndex()")
-        protected Object doDirect(VirtualFrame frame, @SuppressWarnings("unused") LLVMFunctionDescriptor function, Object[] arguments, //
+        protected Object doDirect(@SuppressWarnings("unused") LLVMFunctionDescriptor function, Object[] arguments, //
                         @SuppressWarnings("unused") @Cached("function") LLVMFunctionDescriptor cachedFunction, //
                         @Cached("create(getIndirectCallTarget(getContext(), cachedFunction))") DirectCallNode callNode) {
-            return callNode.call(frame, arguments);
+            return callNode.call(arguments);
         }
 
         @Specialization(replaces = "doDirect")
-        protected Object doIndirect(VirtualFrame frame, LLVMFunctionDescriptor function, Object[] arguments, //
+        protected Object doIndirect(LLVMFunctionDescriptor function, Object[] arguments, //
                         @Cached("create()") IndirectCallNode callNode) {
             LLVMPerformance.warn(this, "Exceeded inline cache limit");
-            return callNode.call(frame, getIndirectCallTarget(getContext(), function), arguments);
+            return callNode.call(getIndirectCallTarget(getContext(), function), arguments);
         }
 
         public LLVMContext getContext() {
