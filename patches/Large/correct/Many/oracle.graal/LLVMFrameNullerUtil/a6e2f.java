diff --git a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/base/LLVMFrameNullerUtil.java b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/base/LLVMFrameNullerUtil.java
index b4b05be..202a2f3 100644
--- a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/base/LLVMFrameNullerUtil.java
+++ b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/base/LLVMFrameNullerUtil.java
@@ -56,18 +56,18 @@
     private LLVMFrameNullerUtil() {
     }
 
-    public static void nullFrameSlot(VirtualFrame frame, FrameSlot frameSlot) {
+    public static void nullFrameSlot(VirtualFrame frame, FrameSlot frameSlot, boolean forceNulling) {
         FrameSlotKind kind = frameSlot.getKind();
         CompilerAsserts.partialEvaluationConstant(kind);
         if (kind == FrameSlotKind.Object) {
             // object frame slots always need to be nulled (otherwise we would impact GC)
             nullObject(frame, frameSlot);
-        } else if (CompilerDirectives.inCompiledCode()) {
+        } else if (CompilerDirectives.inCompiledCode() || forceNulling) {
             // Nulling primitive frame slots is only necessary in compiled code (otherwise, we would
-            // compute values that are only used in framestates). Tthis code must NOT be moved to a
-            // separate method as it would cause endless deopts (code method might be unresolved
-            // because it was never executed). For the same reason, we also must NOT use a switch
-            // statement.
+            // compute values that are only used in framestates). This code must NOT be moved to a
+            // separate method as it would cause endless deopts (the method or classes that are used
+            // within the method might be unresolved because they were never executed). For the same
+            // reason, we also must NOT use a switch statement.
             if (kind == FrameSlotKind.Boolean) {
                 frame.setBoolean(frameSlot, false);
             } else if (kind == FrameSlotKind.Byte) {
