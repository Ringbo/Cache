diff --git a/presto-bytecode/src/main/java/com/facebook/presto/bytecode/instruction/InvokeInstruction.java b/presto-bytecode/src/main/java/com/facebook/presto/bytecode/instruction/InvokeInstruction.java
index f1e05be..8c499ee 100644
--- a/presto-bytecode/src/main/java/com/facebook/presto/bytecode/instruction/InvokeInstruction.java
+++ b/presto-bytecode/src/main/java/com/facebook/presto/bytecode/instruction/InvokeInstruction.java
@@ -357,7 +357,7 @@
     @Override
     public void accept(MethodVisitor visitor, MethodGenerationContext generationContext)
     {
-        visitor.visitMethodInsn(opCode.getOpCode(), target.getClassName(), name, getMethodDescription());
+        visitor.visitMethodInsn(opCode.getOpCode(), target.getClassName(), name, getMethodDescription(), target.isInterface());
     }
 
     @Override
