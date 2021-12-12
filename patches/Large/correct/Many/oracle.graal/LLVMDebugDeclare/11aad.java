diff --git a/projects/com.oracle.truffle.llvm.nodes.impl/src/com/oracle/truffle/llvm/nodes/impl/intrinsics/llvm/debug/LLVMDebugDeclare.java b/projects/com.oracle.truffle.llvm.nodes.impl/src/com/oracle/truffle/llvm/nodes/impl/intrinsics/llvm/debug/LLVMDebugDeclare.java
index 92cd65f..ff7d316 100644
--- a/projects/com.oracle.truffle.llvm.nodes.impl/src/com/oracle/truffle/llvm/nodes/impl/intrinsics/llvm/debug/LLVMDebugDeclare.java
+++ b/projects/com.oracle.truffle.llvm.nodes.impl/src/com/oracle/truffle/llvm/nodes/impl/intrinsics/llvm/debug/LLVMDebugDeclare.java
@@ -43,7 +43,7 @@
 
     @SuppressWarnings("unused")
     @Specialization
-    public void execute(LLVMMetadata m1, LLVMMetadataNode m2) {
+    public void execute(LLVMMetadata m1, LLVMMetadata m2) {
     }
 
 }
