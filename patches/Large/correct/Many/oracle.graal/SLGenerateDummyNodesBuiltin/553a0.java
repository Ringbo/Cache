diff --git a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/builtins/SLGenerateDummyNodesBuiltin.java b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/builtins/SLGenerateDummyNodesBuiltin.java
index f0dd752..c3182d5 100644
--- a/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/builtins/SLGenerateDummyNodesBuiltin.java
+++ b/graal/com.oracle.graal.truffle.test/src/com/oracle/graal/truffle/test/builtins/SLGenerateDummyNodesBuiltin.java
@@ -47,7 +47,7 @@
     @Specialization
     public Object generateNodes(long count) {
         CompilerAsserts.neverPartOfCompilation("generateNodes should never get optimized.");
-        FrameInstance callerFrame = Truffle.getRuntime().getCurrentFrame();
+        FrameInstance callerFrame = Truffle.getRuntime().getCallerFrame();
         SLRootNode root = (SLRootNode) callerFrame.getCallNode().getRootNode();
         root.getBodyNode().replace(createBinaryTree((int) (count - 1)));
         return SLNull.SINGLETON;
