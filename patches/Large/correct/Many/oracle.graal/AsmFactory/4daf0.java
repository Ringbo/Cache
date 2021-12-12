diff --git a/projects/com.oracle.truffle.llvm.asm.amd64/src/com/oracle/truffle/llvm/asm/amd64/AsmFactory.java b/projects/com.oracle.truffle.llvm.asm.amd64/src/com/oracle/truffle/llvm/asm/amd64/AsmFactory.java
index 4afaa48..8a0441b 100644
--- a/projects/com.oracle.truffle.llvm.asm.amd64/src/com/oracle/truffle/llvm/asm/amd64/AsmFactory.java
+++ b/projects/com.oracle.truffle.llvm.asm.amd64/src/com/oracle/truffle/llvm/asm/amd64/AsmFactory.java
@@ -1670,7 +1670,7 @@
         statements.add(write);
     }
 
-    public void createTernaryOperation(String operation, AsmOperand a, AsmOperand b, AsmOperand c) {
+    void createTernaryOperation(String operation, AsmOperand a, AsmOperand b, AsmOperand c) {
         AsmOperand dst = c;
         LLVMExpressionNode srcA;
         LLVMExpressionNode srcB;
