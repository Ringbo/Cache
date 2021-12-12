diff --git a/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java b/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
index 60c4343..41d9048 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
@@ -1486,7 +1486,7 @@
         Instruction3rc instruction = (Instruction3rc)analyzedInstruction.instruction;
 
         Instruction3rc deodexedInstruction = new ImmutableInstruction3rc(Opcode.INVOKE_DIRECT_RANGE,
-                instruction.getRegisterCount(), instruction.getStartRegister(), instruction.getReference());
+                instruction.getStartRegister(), instruction.getRegisterCount(), instruction.getReference());
 
         analyzedInstruction.setDeodexedInstruction(deodexedInstruction);
 
