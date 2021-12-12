diff --git a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/interop/LLVMForeignCallNode.java b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/interop/LLVMForeignCallNode.java
index b78bb4d..3858a4e 100644
--- a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/interop/LLVMForeignCallNode.java
+++ b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/interop/LLVMForeignCallNode.java
@@ -69,7 +69,7 @@
                     @Cached("create(getCallTarget(function))") DirectCallNode callNode,
                     @Cached("createToLLVMNodes(function)") ToLLVMNode[] toLLVMNodes, @Cached("arguments.length") int cachedLength) {
         assert function.getReturnType() != LLVMRuntimeType.STRUCT;
-        return callNode.call(frame, packArguments(frame, arguments, toLLVMNodes, cachedLength));
+        return callNode.call(packArguments(frame, arguments, toLLVMNodes, cachedLength));
     }
 
     @Specialization
@@ -77,7 +77,7 @@
                     @Cached("create()") IndirectCallNode callNode, @Cached("arguments.length") int cachedLength) {
         assert function.getReturnType() != LLVMRuntimeType.STRUCT;
         LLVMPerformance.warn(this);
-        return callNode.call(frame, getCallTarget(function), packArguments(frame, function, arguments, cachedLength));
+        return callNode.call(getCallTarget(function), packArguments(frame, function, arguments, cachedLength));
     }
 
     @ExplodeLoop
