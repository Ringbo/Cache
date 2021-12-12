diff --git a/compiler/src/org.graalvm.compiler.truffle.runtime/src/org/graalvm/compiler/truffle/runtime/OptimizedDirectCallNode.java b/compiler/src/org.graalvm.compiler.truffle.runtime/src/org/graalvm/compiler/truffle/runtime/OptimizedDirectCallNode.java
index 48abead..db14384 100644
--- a/compiler/src/org.graalvm.compiler.truffle.runtime/src/org/graalvm/compiler/truffle/runtime/OptimizedDirectCallNode.java
+++ b/compiler/src/org.graalvm.compiler.truffle.runtime/src/org/graalvm/compiler/truffle/runtime/OptimizedDirectCallNode.java
@@ -63,7 +63,7 @@
 
     @Override
     public Object call(Object[] arguments) {
-        if (CompilerDirectives.inInterpreter()) {
+        if (CompilerDirectives.inInterpreterOrLowTier()) {
             // TODO: See why enabling this for low-tier leads to terrible performance in high-tier compilations.
             onInterpreterCall();
         }
