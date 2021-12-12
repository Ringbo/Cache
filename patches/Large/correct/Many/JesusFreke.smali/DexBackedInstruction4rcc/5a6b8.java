diff --git a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/instruction/DexBackedInstruction4rcc.java b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/instruction/DexBackedInstruction4rcc.java
index 629e753..f1cae64 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/instruction/DexBackedInstruction4rcc.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/instruction/DexBackedInstruction4rcc.java
@@ -70,7 +70,7 @@
     @Override
     public Reference getReference2() {
         return DexBackedReference.makeReference(dexFile, opcode.referenceType2,
-                dexFile.readUshort(instructionStart + 3));
+                dexFile.readUshort(instructionStart + 6));
     }
 
     @Override
