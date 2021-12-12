diff --git a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMGlobalRootNode.java b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMGlobalRootNode.java
index 3f33a34..c34e731 100644
--- a/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMGlobalRootNode.java
+++ b/projects/com.oracle.truffle.llvm.nodes/src/com/oracle/truffle/llvm/nodes/func/LLVMGlobalRootNode.java
@@ -93,7 +93,7 @@
                 Object[] realArgs = new Object[arguments.length + LLVMCallNode.ARG_START_INDEX];
                 realArgs[0] = LLVMFrameUtil.getAddress(frame, stackPointerSlot);
                 System.arraycopy(arguments, 0, realArgs, LLVMCallNode.ARG_START_INDEX, arguments.length);
-                result = executeIteration(frame, i, realArgs);
+                result = executeIteration(i, realArgs);
 
                 context.awaitThreadTermination();
                 assert LLVMSignal.getNumberOfRegisteredSignals() == 0;
@@ -112,7 +112,7 @@
         }
     }
 
-    protected Object executeIteration(VirtualFrame frame, int iteration, Object[] args) {
+    protected Object executeIteration(int iteration, Object[] args) {
         Object result;
 
         if (iteration != 0) {
@@ -127,7 +127,7 @@
         int returnCode = 0;
 
         try {
-            result = main.call(frame, args);
+            result = main.call(args);
         } catch (LLVMExitException e) {
             returnCode = e.getReturnCode();
             throw e;
