diff --git a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/interop/LLVMTruffleReadNString.java b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/interop/LLVMTruffleReadNString.java
index ff2d43e..ed7d87f 100644
--- a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/interop/LLVMTruffleReadNString.java
+++ b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/intrinsics/interop/LLVMTruffleReadNString.java
@@ -79,7 +79,7 @@
         for (int i = 0; i < n; i++) {
             Object rawValue;
             try {
-                rawValue = ForeignAccess.sendRead(foreignRead, object, offset + n);
+                rawValue = ForeignAccess.sendRead(foreignRead, object, offset + i);
             } catch (UnknownIdentifierException | UnsupportedMessageException e) {
                 CompilerDirectives.transferToInterpreter();
                 throw new IllegalStateException(e);
