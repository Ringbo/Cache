diff --git a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/EdgeMoveOptimizer.java b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/EdgeMoveOptimizer.java
index 5c8d970..dab9163 100644
--- a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/EdgeMoveOptimizer.java
+++ b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/EdgeMoveOptimizer.java
@@ -190,10 +190,13 @@
         }
 
         LIRInstruction branch = instructions.get(instructions.size() - 2);
-        if (!(branch instanceof StandardOp.BranchOp) || branch.hasState()) {
-            // not a valid case for optimization
-            // currently, only blocks that end with two branches (conditional branch followed
-            // by unconditional branch) are optimized
+        if (!(branch instanceof StandardOp.BranchOp) || branch.hasOperands()) {
+            // Only blocks that end with two branches (conditional branch followed
+            // by unconditional branch) are optimized.
+            // In addition, a conditional branch with operands (including state) cannot
+            // be optimized. Moving a successor instruction before such a branch may
+            // interfere with the operands of the branch. For example, a successive move
+            // instruction may redefine an input operand of the branch.
             return;
         }
 
