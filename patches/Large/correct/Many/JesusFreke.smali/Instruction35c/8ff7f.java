diff --git a/dexlib/src/main/java/org/jf/dexlib/code/Format/Instruction35c.java b/dexlib/src/main/java/org/jf/dexlib/code/Format/Instruction35c.java
index 143f69f..f6828f0 100644
--- a/dexlib/src/main/java/org/jf/dexlib/code/Format/Instruction35c.java
+++ b/dexlib/src/main/java/org/jf/dexlib/code/Format/Instruction35c.java
@@ -116,7 +116,7 @@
     }
 
     public byte getRegisterG() {
-        return NumberUtils.decodeLowUnsignedNibble(encodedInstruction[5]);
+        return NumberUtils.decodeHighUnsignedNibble(encodedInstruction[5]);
     }
 
     private void checkItem() {
