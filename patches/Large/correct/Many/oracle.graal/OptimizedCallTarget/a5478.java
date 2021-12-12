diff --git a/compiler/src/org.graalvm.compiler.truffle.runtime/src/org/graalvm/compiler/truffle/runtime/OptimizedCallTarget.java b/compiler/src/org.graalvm.compiler.truffle.runtime/src/org/graalvm/compiler/truffle/runtime/OptimizedCallTarget.java
index 8191343..a000600 100644
--- a/compiler/src/org.graalvm.compiler.truffle.runtime/src/org/graalvm/compiler/truffle/runtime/OptimizedCallTarget.java
+++ b/compiler/src/org.graalvm.compiler.truffle.runtime/src/org/graalvm/compiler/truffle/runtime/OptimizedCallTarget.java
@@ -284,7 +284,7 @@
     }
 
     protected final Object callProxy(VirtualFrame frame) {
-        final boolean inCompiled = CompilerDirectives.inCompiledCode();
+        final boolean inCompiled = CompilerDirectives.inCompilationRoot();
         try {
             return getRootNode().execute(frame);
         } catch (ControlFlowException t) {
