diff --git a/projects/com.oracle.truffle.llvm.nodes.impl/src/com/oracle/truffle/llvm/nodes/impl/intrinsics/llvm/debug/LLVMDebugValue.java b/projects/com.oracle.truffle.llvm.nodes.impl/src/com/oracle/truffle/llvm/nodes/impl/intrinsics/llvm/debug/LLVMDebugValue.java
index ca2d217..565d980 100644
--- a/projects/com.oracle.truffle.llvm.nodes.impl/src/com/oracle/truffle/llvm/nodes/impl/intrinsics/llvm/debug/LLVMDebugValue.java
+++ b/projects/com.oracle.truffle.llvm.nodes.impl/src/com/oracle/truffle/llvm/nodes/impl/intrinsics/llvm/debug/LLVMDebugValue.java
@@ -44,7 +44,7 @@
 
     @SuppressWarnings("unused")
     @Specialization
-    public void execute(LLVMMetadata m1, LLVMI64Node i64, LLVMMetadataNode m2) {
+    public void execute(LLVMMetadata m1, LLVMI64Node i64, LLVMMetadata m2) {
     }
 
 }
