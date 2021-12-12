diff --git a/compiler/src/org.graalvm.compiler.truffle.test/src/org/graalvm/compiler/truffle/test/OptimizedCallTargetTest.java b/compiler/src/org.graalvm.compiler.truffle.test/src/org/graalvm/compiler/truffle/test/OptimizedCallTargetTest.java
index a47f933..d50e8c1 100644
--- a/compiler/src/org.graalvm.compiler.truffle.test/src/org/graalvm/compiler/truffle/test/OptimizedCallTargetTest.java
+++ b/compiler/src/org.graalvm.compiler.truffle.test/src/org/graalvm/compiler/truffle/test/OptimizedCallTargetTest.java
@@ -448,7 +448,7 @@
         });
         final OptimizedCallTarget outerTarget = (OptimizedCallTarget) runtime.createCallTarget(new RootNode(null) {
 
-            @Child private OptimizedDirectCallNode child = (OptimizedDirectCallNode) runtime.createDirectCallNode(innerTarget);
+            @Child private DirectCallNode child = runtime.createDirectCallNode(innerTarget);
 
             @Override
             public Object execute(VirtualFrame frame) {
