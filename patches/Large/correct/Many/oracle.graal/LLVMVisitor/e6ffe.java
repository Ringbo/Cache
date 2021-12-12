diff --git a/projects/com.oracle.truffle.llvm.parser.impl/src/com/oracle/truffle/llvm/parser/impl/LLVMVisitor.java b/projects/com.oracle.truffle.llvm.parser.impl/src/com/oracle/truffle/llvm/parser/impl/LLVMVisitor.java
index 298f35f..593ec30 100644
--- a/projects/com.oracle.truffle.llvm.parser.impl/src/com/oracle/truffle/llvm/parser/impl/LLVMVisitor.java
+++ b/projects/com.oracle.truffle.llvm.parser.impl/src/com/oracle/truffle/llvm/parser/impl/LLVMVisitor.java
@@ -804,7 +804,7 @@
         for (Constant c : indices) {
             constants.add((Integer) LLVMConstantEvaluator.evaluateConstant(this, c));
         }
-        if (constants.size() != 0) {
+        if (constants.size() != 1) {
             throw new AssertionError(constants);
         }
         int index = constants.get(0);
