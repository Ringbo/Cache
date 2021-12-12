diff --git a/src/main/java/org/JesusFreke/dexlib/code/Format/Format11x.java b/src/main/java/org/JesusFreke/dexlib/code/Format/Format11x.java
index d8cf37c..fe6fd5f 100644
--- a/src/main/java/org/JesusFreke/dexlib/code/Format/Format11x.java
+++ b/src/main/java/org/JesusFreke/dexlib/code/Format/Format11x.java
@@ -44,7 +44,7 @@
 
         checkOpcodeFormat(op);
 
-        if (regA >= 2<<8) {
+        if (regA >= 1<<8) {
             throw new RuntimeException("The register number must be less than v256");
         }
 
