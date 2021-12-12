diff --git a/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java b/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
index 8c7b049..273bd77 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
@@ -1454,8 +1454,8 @@
             deodexedOpcode = Opcode.INVOKE_VIRTUAL_RANGE;
         }
 
-        Instruction3rc deodexedInstruction = new ImmutableInstruction3rc(deodexedOpcode, instruction.getRegisterCount(),
-                instruction.getStartRegister(), resolvedMethod);
+        Instruction3rc deodexedInstruction = new ImmutableInstruction3rc(deodexedOpcode, instruction.getStartRegister(),
+                instruction.getRegisterCount(), resolvedMethod);
 
         analyzedInstruction.setDeodexedInstruction(deodexedInstruction);
         analyzeInstruction(analyzedInstruction);
