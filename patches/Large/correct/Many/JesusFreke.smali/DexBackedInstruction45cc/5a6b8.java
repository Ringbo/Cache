diff --git a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/instruction/DexBackedInstruction45cc.java b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/instruction/DexBackedInstruction45cc.java
index bbdc229..2cb023f 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/instruction/DexBackedInstruction45cc.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/instruction/DexBackedInstruction45cc.java
@@ -91,7 +91,7 @@
     @Override
     public Reference getReference2() {
         return DexBackedReference.makeReference(dexFile, opcode.referenceType2,
-                dexFile.readUshort(instructionStart + 3));
+                dexFile.readUshort(instructionStart + 6));
     }
 
     @Override
