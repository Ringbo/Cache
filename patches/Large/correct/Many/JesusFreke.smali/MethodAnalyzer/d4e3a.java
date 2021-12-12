diff --git a/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java b/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
index e92e9a7..231634a 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/analysis/MethodAnalyzer.java
@@ -1590,8 +1590,8 @@
                 opcode = Opcode.INVOKE_VIRTUAL_RANGE;
             }
 
-            deodexedInstruction = new ImmutableInstruction3rc(opcode, instruction.getRegisterCount(),
-                    instruction.getStartRegister(), resolvedMethod);
+            deodexedInstruction = new ImmutableInstruction3rc(opcode, instruction.getStartRegister(),
+                    instruction.getRegisterCount(), resolvedMethod);
         } else {
             Instruction35ms instruction = (Instruction35ms)analyzedInstruction.instruction;
             Opcode opcode;
